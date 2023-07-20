package main;

public class PokerHand {

	private String player;
	private String winningHand;

	public PokerHand(String player, String winningHand) {
		this.player = player;
		this.winningHand = winningHand;
	}

//	public PokerHand(String[] split) {
//		
//	}
	
	public PokerHand(String[] handInfo) {
		this.player = handInfo[0];
		this.winningHand = handInfo[1];
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public String getWinningHand() {
		return winningHand;
	}

	public void setWinningHand(String winningHand) {
		this.winningHand = winningHand;
	}

}
