
public class ComputerPlayer {
	
	public int computerTurn() {
		int placement = (int)(Math.random() * 9 + 1);
		return placement;
	}
}

