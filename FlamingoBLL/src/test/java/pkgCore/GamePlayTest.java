package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgEnum.eGameType;

public class GamePlayTest {

	@Test
	public void test() {
		GamePlayBlackJack game1 = new GamePlayBlackJack();
		assertNotNull(game1);

		Table t = new Table();
		
		Player p1 = new Player("Mike",4);
		Player p2 = new Player("John", 5);
		
		t.AddPlayerToTable(p1);
		t.AddPlayerToTable(p2);
		
		game1.AddPlayersToGame(t.GetTable());
		assertEquals(2,game1.GetPlayersInGame().size());
		
		game1.RemovePlayerFromGame(p1);
		assertEquals(1,game1.GetPlayersInGame().size());
		assertEquals(game1.GetPlayerInGame(p2), p2);
	}

}
