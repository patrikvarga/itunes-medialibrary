package net.kemitix.itunes.medialibrary;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan
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
}
