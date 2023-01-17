package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.io.Resources;

import java.io.File;
import java.io.IOException;

public class WebDriverService {

    //refactor to try with resources
    public static DriverProperties getDriverProperties() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(Resources.getResource("config.json").getFile()), DriverProperties.class);
    }
}
