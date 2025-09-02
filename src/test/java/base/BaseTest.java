package base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.BeforeClass;
import utils.ConfigManager;
import utils.TokenManager;

public class BaseTest {
    protected static RequestSpecification requestSpec;
    @BeforeClass
    public static void setup() {
        requestSpec = new RequestSpecBuilder()
                .setBaseUri(ConfigManager.getProperty("base.url"))
                .addHeader("Authorization", "Bearer " + TokenManager.getToken())
                .build();
    }}
