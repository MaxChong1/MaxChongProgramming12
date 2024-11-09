package module1_7;

import com.chong.module1_4.Circle;
import com.chong.module1_4.Colour;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    Circle circle1;
    Circle circle2;

    //setup for the two circles
    @Before
    public void setup(){
        circle1 = new Circle(5, Colour.RED); //red circle with radius of 5
        circle2 = new Circle(6, Colour.BLUE); //blue circle with radius of 6
    }

    @Test
    public void testArea() {
        //tests the getArea method by sharing the same code as the method, as the method returns nothing (is void)
        //the getArea method cannot be tested as it is an informational method, where it is just printing the formula for circle area
        //formula for circle area is pi(r^2)
        //delta is the margin of error, set as 1e-6 (to the one millionth decimal place)
        assertEquals(78.53981633974483, circle1.getArea(), 1e-6);
        assertEquals(113.09733552923255, circle2.getArea(), 1e-6);
    }
}