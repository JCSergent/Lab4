package pkgCore;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class TableTest {

	@Test
	public void test() {
		Table t = new Table();
		assertNotNull(t);
		
		Player p1 = new Player("Mike",4);
		Player p2 = new Player("John", 5);
		
		t.AddPlayerToTable(p1);
		List<Player> player1 = t.GetTable();
		assertEquals(1,player1.size());
		assertNotNull(t.GetPlayerFromTable(p1));
		assertEquals(t.GetPlayerFromTable(p1),p1);
		
		t.ClearTable();
		assertEquals(0,t.GetTable().size());
		
	}

}
