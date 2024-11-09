package module1_7;

import com.chong.module1_4.Colour;
import com.chong.module1_4.Triangle;
import org.junit.Before;

import static org.junit.Assert.*;

public class TriangleTest {

    Triangle triangle1;
    Triangle triangle2;
    Triangle triangle3;

    //setup for the three triangles
    @Before
    public void setup(){
        triangle1 = new Triangle(5,10, Colour.RED); //red triangle with a width of 5 and a height of 10
        triangle2 = new Triangle(5,10,14, Colour.BLUE); //blue triangle with side lengths: a = 5, b = 10, c = 14
        triangle3 = new Triangle(4,10,12, Colour.GREEN);//green triangle with side lengths: a = 4, b = 10, c = 12
    }

    @org.junit.Test
    public void testArea() {
        //tests the getArea method by sharing the same code as the method, as the method returns nothing (is void)
        //the getArea method cannot be tested as it is an informational method, where it is just printing the formula for triangle area
        //formula for triangle area is (w*h)/2
        //delta is the margin of error, set as 1e-6 (to the one millionth decimal place)
        assertEquals(25.0,triangle1.getArea(), 1e-6);
        assertEquals(17.605041891458253, triangle2.getArea(),1e-6);
        assertEquals(18.734993995195193, triangle3.getArea(),1e-6);
    }
    @org.junit.Test
    public void testHeronsHeight(){
        //tests herons height method by using the getHeight method, referring to the height variable
        //the height variable is set with the herons height method
        //delta is the margin of error, set as 1e-6 (to the one millionth decimal place)
        assertEquals(3.5210083782916506, triangle2.getHeight(), 1e-6 );
        assertEquals(3.7469987990390385, triangle3.getHeight(), 1e-6 );
    }

}