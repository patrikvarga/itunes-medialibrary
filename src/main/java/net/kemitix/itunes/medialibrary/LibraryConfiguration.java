package net.kemitix.itunes.medialibrary;

import java.io.File;
import java.io.IOException;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Setter
@Configuration
@ComponentScan
public class LibraryConfiguration {

    @Bean
    public EntityManagerFactory entityManagerFactory() throws IOException {
        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setPersistenceUnitName("medialibrary8");
        factoryBean.setDataSource(datasource());
        EntityManagerFactory entityManagerFactory = factoryBean.getNativeEntityManagerFactory();
        return entityManagerFactory;
    }

    @Bean
    public DataSource datasource() throws IOException {
        String driverClassname = "org.sqlite.JDBC";
        String url = getJDBCConnectionString();
        String username = "";
        String password = "";
        DataSource dataSource = new DriverManagerDataSource(driverClassname, url, username, password);
        return dataSource;
    }

    private String getJDBCConnectionString() throws IOException {
        return "jdbc:sqlite:" + getSqlliteFile().getCanonicalPath();
    }

    private File mediaLibraryFile;

    private File getSqlliteFile() {
        if (mediaLibraryFile == null) {
            throw new NullPointerException("Library File not set");
        }
        return mediaLibraryFile;
    }

}
