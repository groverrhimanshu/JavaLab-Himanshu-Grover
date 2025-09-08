package testngday4;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][]{
            {"User1", "Pass1"},
            {"User2", "Pass2"},
            {"User3", "Pass3"}
        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {
        System.out.println("Testing login with: " +username + "/" + password);
    }

}
