package base;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.testng.annotations.BeforeClass;
import utils.ConfigManager;

public class BaseTest {
    @BeforeClass
    public void setup() {
        RestAssured.baseURI = ConfigManager.getProperty("base.url");
    }
}
