package fr.feo.mowitnow;


public class MowItNow {

	private int x;
	private int y;
	
	public void setMapSize(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Mower addMower(int x, int y, String direction) {
		return new Mower(x, y, direction);
	}

	public void giveOrders(Mower mower, String cmdLine) {
		for (char c : cmdLine.toCharArray()) {
			executeCommand(mower, Command.valueOf(String.valueOf(c)));
		}
	}
	
	public void executeCommand(Mower mower, Command command) {
		switch (command) {
		case D:
			mower.turnRight();
			break;
		case G:
			mower.turnLeft();
			break;
		case A:
			mower.goForward(x, y);
			break;
		default:
			break;
		}
	}

}
