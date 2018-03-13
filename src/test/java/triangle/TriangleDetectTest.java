package triangle;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TriangleDetectTest {
    @DataProvider(name = "TriangleDetectDataProvider")
    public Object[] createTriangle() {
        return new Object[][]
                {
                        {new Triangle(1, 1, 1), new Integer(1)},
                        {new Triangle(3, 3, 5), new Integer(2)},
                        {new Triangle(3,6,9), new Integer(4)},
                        {new Triangle(3,4,5),new Integer(8)},
                        {new Triangle(4, 4, 4), new Integer(3)},
                };
    }

    @Test(dataProvider = "TriangleDetectDataProvider")
    public void testDetectTriangle(Triangle triangle, Integer i) throws Exception {
        Assert.assertEquals(triangle.detectTriangle() & (int)i ,(int) i );
    }
    @Test(expectedExceptions =Exception.class,groups = {"exception"})
    public void testDetectTriangleException() throws Exception {
        new Triangle(0.0, 0.0, 0.0);
    }

}
