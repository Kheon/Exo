package fr.feo.mowitnow;

public class Mower {

	private Position position;
	private Direction direction;

	public Mower(int x, int y, String direction) {
		super();
		position = new Position(x, y);
		this.direction = Direction.valueOf(direction);
	}

	public String showPosition() {
		return position.getX() + " " + position.getY() + " "
				+ direction.toString();
	}

	public void turnRight() {
		direction = direction.getRightDirection();
	}

	public void turnLeft() {
		direction = direction.getLeftDirection();
	}

	public void goForward(int mapSizeX, int mapSizeY) {
		Position newPos = direction.getMoveCmd().apply(position);
		if (isNewPosValid(newPos, mapSizeX, mapSizeY)) {
			position = newPos;
		}
	}

	private boolean isNewPosValid(Position newPos, int mapSizeX, int mapSizeY) {
		return newPos.getX() >= 0 && newPos.getX() <= mapSizeX
				&& newPos.getY() >= 0 && newPos.getY() <= mapSizeY;
	}
}
