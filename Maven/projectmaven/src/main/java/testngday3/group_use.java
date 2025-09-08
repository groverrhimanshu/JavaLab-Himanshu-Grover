package testngday3;

import org.testng.annotations.*;

public class group_use {
	@Test(groups = {"smoke"})
    public void testLogin()
    {
        System.out.println("Smoke: Login Test");
    }

    @Test(groups = {"regression"})
    public void testAddToCart()
    {
        System.out.println("Regression : Add to Cart Test");
    }

    @Test(groups = {"sanity", "regression"})
    public void testCheckout()
    {
        System.out.println("Regression : Add to Cart Test");
    }

}
