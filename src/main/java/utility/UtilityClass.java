package utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Map;

import static dataBaseUtility.sqlReader.SqlReader.sqlExecutionAndMapResultToHashMap;

public class UtilityClass {

    public static  final Logger LOG = LogManager.getLogger(UtilityClass.class);


    //Reading the data base table rows

    public static List<Map<String,Object>> extractRowsFromDataBaseTable(String sqlCommandToExecute)
    {
        List<Map<String,Object>> listOfBooking;
         listOfBooking=sqlExecutionAndMapResultToHashMap(sqlCommandToExecute);
        return listOfBooking;
    }
}
