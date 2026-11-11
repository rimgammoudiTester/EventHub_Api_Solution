package configUtility.propertyReader;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import static bases.apiBasePage.ApiBasePage.log;
import static utility.constants.uiConstants.UiConstants.CONFIG_FILE;

public class PropertyReader {
    static Properties prop;


    public static void readPropertyNameFromConfigFile() {
        prop = new Properties();
        try {
            FileInputStream file = new FileInputStream(CONFIG_FILE);
            prop.load(file);
            log.info("File is loaded successfully");


        } catch (IOException e) {
            log.error("could not find the  property file: !");
            throw new RuntimeException(e);
        }

    }

    public static String getPropertyFromConfigFile(String key) {

        return prop.getProperty(key);
    }



}
