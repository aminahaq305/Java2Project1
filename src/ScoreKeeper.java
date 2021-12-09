
public class ScoreKeeper {
	private int xwins = 0;
	private int owins = 0;
	
	public void scoreTally(char player) {
		if (player == 'X') {
			xwins++;
		}
		else {
			owins++;
		}
	}
	
	public int getxwins() {
		return xwins;
	}
	public int getowins() {
		return owins;
	}
}
