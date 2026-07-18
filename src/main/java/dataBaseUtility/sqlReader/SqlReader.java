package dataBaseUtility.sqlReader;

import dataBaseUtility.databaseConfiguration.DataBaseConfiguration;
import org.testng.annotations.BeforeClass;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SqlReader  extends DataBaseConfiguration {
    //
    static Connection connectionInstance;
    @BeforeClass
    public void establishTheConnectionToDataBase() {
        setUpDataBaseDbeaver();
        connectionInstance= getConnection();
        // closeConnectionOfDbeaver();

    }


    public static List<Map<String, Object>> sqlExecutionAndMapResultToHashMap(String sqlQuery) {


        List<Map<String, Object>> tableData = new ArrayList<>();
        try {
            Statement statement = connectionInstance.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            ResultSetMetaData resultSetMetaDataVariable = resultSet.getMetaData();
            int columnsNumber = resultSetMetaDataVariable.getColumnCount();
            //List<Map<String,Object>> tableData=new ArrayList<>();
            // Loop through each row one by one
            while (resultSet.next()) {
                Map<String, Object> currentRow = new LinkedHashMap<>();
                for (int i = 1; i <= columnsNumber; i++) {
                    String columnName = resultSetMetaDataVariable.getColumnName(i);
                    Object columnValue = resultSet.getObject(i);
                    currentRow.put(columnName,columnValue);

                }
                tableData.add(currentRow);


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(tableData);
        return tableData;
    }



}
