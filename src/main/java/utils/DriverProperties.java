package utils;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DriverProperties {

    @JsonProperty("hubUrl")
    private String hubUrl;

    @JsonProperty("browserName")
    private String browserName;

    @JsonProperty("platformName")
    private String platformName;
}