package testngday4;

import org.testng.annotations.*;

public class RetriableDataProviderSample {
	private boolean throwException = true;

    @Test(dataProvider = "test-data")
    public void sampleTestMethod(int input) {
        System.err.println("Input value = " + input);
    }

    @DataProvider(retryUsing = RetryDataProvider.class, name = "test-data")
    public Object[][] testDataSupplier() {
        // Simulate a failure on the first attempt
        if (throwException) {
            throwException = false;
            System.err.println("Simulating a problem when invoking the data provider");
            throw new IllegalStateException("Simulating a failure in data provider");
        }
        // Provide the data if not failing
        return new Object[][]{
                {1}, {2}
        };

}}
