
public class Board {
	private char[][] grid = new char[3][3];
	private ScoreKeeper keeper = new ScoreKeeper();

	public Board() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				grid[i][j] = ' ';
			}
		}
	}
	
	public void resetBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				grid[i][j] = ' ';
			}
		}
	}
	
	public boolean locationinuse(int num) {
		boolean inuse = false;
		int x = 0;
		int y = 0;
		switch (num) {
		case 1:
			x = 0;
			y = 0;
			break;
		case 2:
			x = 1;
			y = 0;
			break;
		case 3:
			x = 2;
			y = 0;
			break;
		case 4:
			x = 0;
			y = 1;
			break;
		case 5:
			x = 1;
			y = 1;
			break;
		case 6:
			x = 2;
			y = 1;
			break;
		case 7:
			x = 0;
			y = 2;
			break;
		case 8:
			x = 1;
			y = 2;
			break;
		case 9:
			x = 2;
			y = 2;
			break;
		}
		if (grid[x][y] == ' ') {
			return inuse;
		}
		else {
			return !inuse;
		}
		
	}
	
	public void setLocation(char xoro, int location) {
		switch (location) {
		case 1: 
			grid[0][0] = xoro;
			break;
		case 2: 
			grid[1][0] = xoro;
			break;
		case 3: 
			grid[2][0] = xoro;
			break;
		case 4: 
			grid[0][1] = xoro;
			break;
		case 5: 
			grid[1][1] = xoro;
			break;
		case 6: 
			grid[2][1] = xoro;
			break;
		case 7: 
			grid[0][2] = xoro;
			break;
		case 8: 
			grid[1][2] = xoro;
			break;
		case 9: 
			grid[2][2] = xoro; 
			break;
		}
	}
	
	public char hasWon() {
		if ((grid[0][0] == 'X' && grid[0][1] == 'X' && grid[0][2] == 'X') || (grid[1][0] == 'X' && grid[1][1] == 'X' && grid[1][2] == 'X') ||(grid[2][0] == 'X' && grid[2][1] == 'X' && grid[2][2] == 'X') || (grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == 'X') || (grid[0][2] == 'X' && grid[1][1] == 'X' && grid[2][0] == 'X') || (grid[0][0] == 'X' && grid[1][0] == 'X' && grid[2][0] == 'X') || (grid[0][1] == 'X' && grid[1][1] == 'X' && grid[2][1] == 'X') || (grid[0][2] == 'X' && grid[1][2] == 'X' && grid[2][2] == 'X')) {
			keeper.scoreTally('X');
			return 'X';
		}
		else if ((grid[0][0] == 'O' && grid[0][1] == 'O' && grid[0][2] == 'O') || (grid[1][0] == 'O' && grid[1][1] == 'O' && grid[1][2] == 'O') ||(grid[2][0] == 'O' && grid[2][1] == 'O' && grid[2][2] == 'O') || (grid[0][0] == 'O' && grid[1][1] == 'O' && grid[2][2] == 'O') || (grid[0][2] == 'O' && grid[1][1] == 'O' && grid[2][0] == 'O') || (grid[0][0] == 'O' && grid[1][0] == 'O' && grid[2][0] == 'O') || (grid[0][1] == 'O' && grid[1][1] == 'O' && grid[2][1] == 'O') || (grid[0][2] == 'O' && grid[1][2] == 'O' && grid[2][2] == 'O')) {
			keeper.scoreTally('O');
			return 'O';
		}
		else {
			return ' ';
		}
	}
	
	
	public String xwins() {
		return ("" + (keeper.getxwins()/2));
	}
	public String owins() {
		return ("" + (keeper.getowins()/2));
	}
}
