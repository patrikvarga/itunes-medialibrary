package net.kemitix.itunes.medialibrary;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.io.IOException;
import java.util.Properties;
import javax.sql.DataSource;
import net.kemitix.spring.common.ResourceReader;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan({
    "net.kemitix.itunes.medialibrary",
    "net.kemitix.spring.common"})
public class LibraryConfiguration {

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        return new HikariDataSource(hikariConfiguration());
    }

    private HikariConfig hikariConfiguration() {
        Properties parameters = new Properties();
        parameters.put("driverClassName", "org.sqlite.JDBC");
        parameters.put("jdbcUrl", jdbcConnectionString());
        return new HikariConfig(parameters);
    }

    private String jdbcConnectionString() {
        return "jdbc:sqlite:" + mediaLibraryFilePath();
    }

    private String mediaLibraryFilePath() {
        return "samples/MediaLibrary.sqlitedb";
    }

    @Bean
    @Qualifier("album tracks")
    public Resource albumTracksResource() {
        return new ClassPathResource("album_tracks.sql");
    }

    @Bean
    @Qualifier("album tracks")
    public String albumTracksSql(
            ResourceReader reader,
            @Qualifier("album tracks") Resource resource)
            throws IOException {
        return reader.read(resource);
    }

}
