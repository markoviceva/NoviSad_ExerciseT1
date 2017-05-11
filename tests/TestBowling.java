import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {
	
	private int firstThrow;
	private int secondThrow;
	
	Frame frame;

	@Test
	public void testIfIsStrike() {
		firstThrow=10;
		frame=new Frame(firstThrow,secondThrow);
		assertFalse(frame.isStrike());
	
		
	}
	
	@Test
	public void testIfIsSpare(){
		firstThrow=5;
		secondThrow=5;
		frame=new Frame(firstThrow,secondThrow);
		assertFalse(frame.isSpare());
	}

}
