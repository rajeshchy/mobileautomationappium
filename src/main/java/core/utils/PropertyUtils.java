package core.utils;

import java.io.IOException;
import java.util.Properties;

/**
 * @author Rajesh
 */
public class PropertyUtils {

    Properties properties;

    public String getProperty(String property)
    {
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream(""));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(property);
    }
}
