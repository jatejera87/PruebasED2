import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMain {

	@Test
	public void test() 
	{
		String[] args = {"2","4"};
		assertThrows(IndexOutOfBoundsException.class, ()-> {Main.main(args);});
		
	}

	@Test
	public void testSuma1(){
		int resultado = Main.suma(5,2);
		assertEquals(resultado, 7);
	}

	@Test
	public void testMain1() throws Exception {
		String[] args = {"2","4","+"};
		Main.main(args);
	}


}
