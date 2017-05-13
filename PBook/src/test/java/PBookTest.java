import static org.junit.Assert.*;

import org.junit.Test;




public class PBookTest {

	@Test
	public void testPBookCreation() {
		PBook pbook = new PBook(); // 羅說除還
		assertTrue(pbook.isEmpty()); // 舒廓簞 說除還
	}
	
	@Test
	public void testAddNumber() {
		PBook pbook = new PBook();
		pbook.addNumber("Hong, Gildong", "010-123-4567"); // 撮廓簞 說除還
		assertFalse(pbook.isEmpty());
	}
	
	@Test
	public void testGetNumber() {
		PBook pbook = new PBook();
		pbook.addNumber("Hong, Gildong", "010-123-4567"); 
		String num = pbook.getNumber("Hong, Gildong");
		assertEquals("010-123-4567", num);
	}
	
	@Test
	public void test2Numbers() {
		PBook pbook = new PBook();
		pbook.addNumber("Hong, Gildong", "010-123-4567");
		pbook.addNumber("Hong, Gilseo", "010-234-5678");
		String num1=pbook.getNumber("Hong, Gildong");
		assertEquals("010-123-4567", num1);
		String num2=pbook.getNumber("Hong, Gilseo");
		assertEquals("010-234-5678", num2);
	}
	
	@Test
	public void testAdd2Number() {
		PBook pbook = new PBook();
		pbook.addNumber("Hong, Gildong", "010-123-4567");
		pbook.addNumber("Hong, Gildong", "010-234-5678");
		String num = pbook.getNumber("Hong, Gildong");
		assertEquals("010-123-4567; 010-234-5678", num);
	}
	
	

}
