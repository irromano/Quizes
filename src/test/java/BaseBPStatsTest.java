import static org.junit.Assert.*;

import org.junit.Test;

public class BaseBPStatsTest {

	@Test
	public void BA_test1() {
		BaseBPStats player = new BaseBPStats();
		player.setH(5);
		player.setAB(5);
		assertTrue(1.0 == player.BA());
	}

}
