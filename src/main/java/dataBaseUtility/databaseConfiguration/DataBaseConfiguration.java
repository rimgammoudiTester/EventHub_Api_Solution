package dataBaseUtility.databaseConfiguration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import configUtility.propertyReader.PropertyReader;
import org.postgresql.ds.PGSimpleDataSource;
import org.testng.annotations.BeforeClass;
import java.sql.Connection;
import java.sql.SQLException;
import static configUtility.propertyReader.PropertyReader.getPropertyFromConfigFile;
import static utility.constants.dataBaseConstants.DataBaseConstants.*;
import static utility.constants.uiConstants.UiConstants.CONFIG_FILE;

public class DataBaseConfiguration extends PropertyReader {
    PGSimpleDataSource postgres;
    HikariDataSource datasource;

    @BeforeClass
    public void readSystemVariables() {
        getPropertyFromConfigFile(CONFIG_FILE);
        postgres = new PGSimpleDataSource();
        postgres.setUser((String) getPropertyFromConfigFile(DATABASE_USERNAME));
        postgres.setPassword((String) getPropertyFromConfigFile(DATABASE_PASSWORD));
        postgres.setUrl((String) getPropertyFromConfigFile(DATABASE_URL));

    }

    // Method useful to set up read , establish connection from dbeaver dataBase
    public void setUpDataBaseDbeaver() {
        try {
            HikariConfig dbConfig = new HikariConfig();
            dbConfig.setDataSource(postgres);
            dbConfig.setMaximumPoolSize(5);
            //Creating th pool of db
            datasource = new HikariDataSource(dbConfig);
        } catch (RuntimeException e) {
            throw new RuntimeException("problem" + e);
        }
    }

    //Methos useful to establish connection
    public Connection getConnection() {
        try {

            return datasource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException("Connection failed !" + e);
        }
    }


    // Method useful to close connection for dataBase
    public void closeConnectionOfDbeaver() {
        if (datasource != null) {
            datasource.close();
        }
    }


}
