import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTC {

	@Test
	void runAddMethod() {
		Calculator calc = new Calculator();
		assertEquals(2, calc.add(1,1), "bad math");
	}
	
	@Test
	void runAnotherAddMethod() {
		
		Calculator calc = new Calculator();
		assertEquals(2, calc.subtract(4, 2), "bad subtraction");
		
	}
	
	
	
}
