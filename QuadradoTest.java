import junit.framework.*;
import org.junit.Test;


public class QuadradoTest extends TestCase {

	private Quadrado q = new Quadrado();


	@Test
	public void testeLadoPar() {
		q.setLado(2);
		
		assertEquals(4.0f, q.calcularArea());
		assertTrue(q.calcularArea() %2 ==0);
		
		System.out.println("TESTE LADO PAR: " + q.toString());
	}

	@Test
	public void testeLadoFloat() {
		q.setLado(3.3f);
		
		assertEquals(10.89f, q.calcularArea(), 0.10f);
		System.out.println("TESTE LADO FLOAT: " + q.toString());
	}
	
	
	@Test
	public void testeLadoImpar() {
		q.setLado(3);
		
		assertEquals(9.0f, q.calcularArea());
		assertTrue(q.calcularArea() %2 != 0);
		System.out.println("TESTE LADO IMPAR: " + q.toString());
	}
}
