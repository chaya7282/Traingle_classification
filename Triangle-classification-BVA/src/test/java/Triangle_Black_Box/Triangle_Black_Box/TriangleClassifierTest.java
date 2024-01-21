package Triangle_Black_Box.Triangle_Black_Box;

import static org.junit.Assert.*;
import  org.junit.Test;
public class TriangleClassifierTest {
	
	TriangleClassifier triangle = new TriangleClassifier();
	
	@Test
  
	public void equilateralTriangle(){
        int a = 2;
        int b = 2;
        int c=2;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.equilateral.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
}  