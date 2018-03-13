package triangle;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TriangleCheckTest {
    @DataProvider(name = "checkTriangleDataProviderNegative")
    public Object[] createTriangle() {
        return new Object[][]
                {
                        {new Triangle(0.0, 0.0, 0.0)},
                        {new Triangle(-1.0, -2.0, -4.0)},
                        {new Triangle(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY)},
                        {new Triangle(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY)},
                        {new Triangle(Double.NaN, Double.NaN, Double.NaN)}

                };
    }
    @Test(dataProvider = "checkTriangleDataProviderNegative")
    public void testCheckTriangle( Triangle triangle) throws Exception {
        Assert.assertFalse(triangle.checkTriangle());
    }

    @DataProvider(name = "checkTriangleDataProviderPositive")
    public Object[] createTrianglePositive() {
        return new Object[][]
                {
                        {new Triangle(7.0, 6.0, 7.0)},
                        {new Triangle(7.0, 7.0, 7.0)},
                        {new Triangle(15.0, 8.0, 11.0)}
                };
    }
    @Test(dataProvider = "checkTriangleDataProviderPositive")
    public void testCheckTrianglePositive( Triangle triangle) throws Exception {
        Assert.assertTrue(triangle.checkTriangle());
    }
}
