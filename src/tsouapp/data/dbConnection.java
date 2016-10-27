package tsouapp.data;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import java.sql.SQLException;

public class dbConnection {
    final String databaseUrl = "jdbc:sqlite:db/tsoudb.db";
    ConnectionSource con;

    public dbConnection() {
        try {
            con = new JdbcConnectionSource(databaseUrl);
        } catch (SQLException e) {

        }
    }

    public ConnectionSource getConnection() {

        ((JdbcConnectionSource) con).setUsername("");
        ((JdbcConnectionSource) con).setPassword("");
        System.out.println("connected");

        return con;
    }
}

