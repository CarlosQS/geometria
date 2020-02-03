import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void testArea7() {
		Circulo_CQS circulo = new Circulo_CQS(7, "Circulo");
		double area = circulo.area();
		assertEquals(153.9384, area);
	}
	
	@Test
	void testArea0() {
		Circulo_CQS circulo = new Circulo_CQS(0, "Circulo");
		double area = circulo.area();
		assertEquals(0, area);
	}

	@Test
	void testAreaM3() {
		Circulo_CQS circulo = new Circulo_CQS(-3, "Circulo");
		double area = circulo.area();
		assertEquals(28.2744, area);
	}
}
