package core.utils;

import java.io.IOException;
import java.util.Properties;

/**
 * @author Rajesh
 */
public class PropertyUtils {

    Properties properties;
    String fileName;

    public PropertyUtils(String fileName)
    {
        this.fileName = fileName;

    }

    public String getProperty(String property)
    {
        try {
            properties = new Properties();
            properties.load(getClass().getClassLoader().getResourceAsStream(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(property);
    }
}
