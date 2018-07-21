package utils.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {

    public static Properties readProperties(String path) throws IOException {
        File file = new File(path);
        InputStream in = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(in);
        return properties;
    }
}
