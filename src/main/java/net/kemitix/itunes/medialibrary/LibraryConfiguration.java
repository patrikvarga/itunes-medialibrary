package net.kemitix.itunes.medialibrary;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.io.IOException;
import java.util.Properties;
import javax.sql.DataSource;
import net.kemitix.spring.common.ResourceReader;
import org.springframework.beans.factory.annotation.Value;
import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

@Configuration
@ComponentScan({
    "net.kemitix.itunes.medialibrary",
    "net.kemitix.spring.common"})
public class LibraryConfiguration {

    @Bean
    @Profile({"v5/ro", "v5/rw"})
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean
    @Scope(SCOPE_PROTOTYPE)
    @Profile({"v5/ro", "v5/rw"})
    public SimpleJdbcInsert insertActor(DataSource dataSource) {
        return new SimpleJdbcInsert(dataSource).usingGeneratedKeyColumns("id");
    }

    @Bean(destroyMethod = "close")
    @Profile({"v5/ro", "v5/rw"})
    public DataSource dataSource(@Value("${medialibrary.filename}") String mediaLibraryFilePath) {
        this.mediaLibraryFilePath = mediaLibraryFilePath;
        return new HikariDataSource(hikariConfiguration());
    }

    private HikariConfig hikariConfiguration() {
        Properties parameters = new Properties();
        parameters.put("driverClassName", "org.sqlite.JDBC");
        parameters.put("jdbcUrl", jdbcConnectionString());
        return new HikariConfig(parameters);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    private String mediaLibraryFilePath;

    private String jdbcConnectionString() {
        return "jdbc:sqlite:" + mediaLibraryFilePath;
    }

    @Bean
    @AlbumTracks
    @Profile({"v5/ro", "v5/rw"})
    public Resource albumTracksResource() {
        return new ClassPathResource("album_tracks.sql");
    }

    @Bean
    @AlbumTracks
    @Profile({"v5/ro", "v5/rw"})
    public String albumTracksSql(
            ResourceReader reader,
            @AlbumTracks Resource resource)
            throws IOException {
        return reader.read(resource);
    }

}
