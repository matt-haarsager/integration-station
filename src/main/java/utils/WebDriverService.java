package utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class WebDriverService {

    public static DriverProperties getDriverProperties() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File("/Users/mattmagic/Documents/workspace/ste_test_devops/src/test/resources/config.json"), DriverProperties.class);
    }
}
