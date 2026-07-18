package configUtility.propertyReader;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import static utility.UtilityClass.LOG;
import static utility.constants.uiConstants.UiConstants.CONFIG_FILE;

public class PropertyReader {
    static Properties prop;

    @BeforeClass
    public static void readPropertyNameFromConfigFile() {
        prop = new Properties();
        try {
            FileInputStream file = new FileInputStream(CONFIG_FILE);
            prop.load(file);
            LOG.info("File is loaded succesfully");


        } catch (IOException e) {
            LOG.error("could not find the  property file: !");
            throw new RuntimeException(e);
        }

    }

    public static String getPropertyFromConfigFile(String key) {

        return prop.getProperty(key);
    }
}
