package net.kemitix.itunes.medialibrary;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

class MediaLibraryImpl implements MediaLibrary {

    private File sqliteFile;

    @Override
    public void setLibraryFile(File sqliteFile) {
        this.sqliteFile = sqliteFile;
    }

    private Connection connection;

    private Connection getConnection()
            throws SQLException, ClassNotFoundException, IOException {
        if (connection == null) {

            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(getJDBCConnectionString());
        }
        return connection;
    }

    private String getJDBCConnectionString() throws IOException {
        return "jdbc:sqlite:" + getSqlliteFile().getCanonicalPath();
    }

    private File getSqlliteFile() {
        if (sqliteFile == null) {
            throw new NullPointerException("Library File not set");
        }
        return sqliteFile;
    }

    @Override
    public boolean isLibraryConnected() {
        try {
            return getConnection() != null;
        } catch (SQLException | ClassNotFoundException | IOException ex) {
            Logger.getLogger(MediaLibraryImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
