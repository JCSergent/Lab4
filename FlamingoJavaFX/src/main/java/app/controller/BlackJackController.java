package app.controller;

import java.net.URL;
import java.util.ResourceBundle;

import app.Flamingo;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import pkgCore.Action;
import pkgCore.GamePlay;
import pkgCore.Player;
import pkgCore.Table;
import pkgEnum.eAction;

public class BlackJackController implements Initializable {
	private Flamingo FlamingoGame;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}
	public void setMainApp(Flamingo FlamingoGame)
	{
		this.FlamingoGame = FlamingoGame;
	}

	public void btnSitLeave_Click(ActionEvent event)
	{
		Button btn = (Button)event.getSource();
		
		Action act = new Action();
		
		act.setAction(btn.getText()=="sit" ? eAction.Sit : eAction.Leave);
		Player p = FlamingoGame.getAppPlayer();
		if(btn.getId() == "btnTop") {
			p.setiPlayerPosition(2);
		}
		else if(btn.getId() == "btnBottom") {
			p.setiPlayerPosition(0);
		}
		
		act.setPlayer(FlamingoGame.getAppPlayer());
		FlamingoGame.SendMessageToClient(act);
	}
	public void HandleTableState(Table t) {

		//TODO: Implement this.
	}

	public void HandleGameState(GamePlay gp) {

		//		Coming Soon....!
	}

}
