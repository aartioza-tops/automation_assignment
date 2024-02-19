//W.a.junit program to handled Assert class with all method to check its
//pass or fail


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyIntSETTest {

	@Test
	void test() {
		  //Variable declaration		
        String string1="Junit";					
        String string2="Junit1";					
        String string3="test";					
        String string4="test";					
        String string5=null;					
        int variable1=1;					
        int	variable2=2;					
        int[] airethematicArrary1 = { 1, 2, 3 };					
        int[] airethematicArrary2 = { 1, 2, 3 };
        
        //Assert statements		
        assertEquals(string1,string2);					
        assertSame(string3, string4);					
        assertNotSame(string1, string3);					
        assertNotNull(string1);			
        assertNull(string5);			
        assertTrue(variable1<variable2);					
        assertArrayEquals(airethematicArrary1, airethematicArrary2);	
	}

}