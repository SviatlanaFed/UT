package triangle;


import org.testng.Assert;

import org.testng.annotations.Test;

public class TriangleGetSquareTest {

    @Test
    public void testGetSquare() throws Exception {
        Assert.assertEquals(new Triangle(2.0, 2.0,2.0).getSquare(),1.7320508075688772);
    }

    @Test(expectedExceptions =Exception.class,groups = {"exception"})
    public void testGetSquareException() throws Exception {
        double square=new Triangle(0.0, 0.0,0.0).getSquare();
    }


}
