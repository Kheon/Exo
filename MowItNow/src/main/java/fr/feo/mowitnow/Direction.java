package fr.feo.mowitnow;

import java.util.function.Function;

public enum Direction {
	N((p) -> {return new Position(p.getX(),p.getY()+1);}),
	E((p) -> {return new Position(p.getX()+1 , p.getY());}),
	S((p) -> {return new Position(p.getX(), p.getY()-1);}), 
	W((p) -> {return new Position(p.getX()-1, p.getY());});
	
	Direction(Function<Position, Position> moveCmd) {
		this.moveCmd = moveCmd;
	}
	
	private Function<Position, Position> moveCmd;
	
	public Direction getRightDirection() {
		return values()[(ordinal()+1)%4];
	}
	
	public Direction getLeftDirection() {
		return values()[(ordinal()+3)%4];
	}

	public Function<Position, Position> getMoveCmd() {
		return moveCmd;
	}

}
