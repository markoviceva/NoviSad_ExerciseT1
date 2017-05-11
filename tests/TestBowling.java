import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {
	
	private int firstThrow;
	private int secondThrow;
	
	Frame frame=new Frame(firstThrow,secondThrow);

	@Test
	public void testIfIsStrike() {
		firstThrow=10;
		
		assertFalse(frame.isStrike());
	
		
	}
	
	@Test
	public void testIfIsSpare(){
		assertFalse(frame.isSpare());
	}

}
