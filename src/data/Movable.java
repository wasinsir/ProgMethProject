package data;

public abstract class Movable {
	public static final int WEST = 0, NORTH = 1, EAST = 2, SOUTH = 3;
	protected boolean isDestroyed;
	protected int x, y, direction;
	protected Field field;
	protected int nextX, nextY, nextDirection;

	public Movable(Field field, int x, int y, int direction, int movingDelay) {
		if (field.outOfField(x, y)) {
			x = 0;
			y = 0;
		}
		if (direction > 3 || direction < 0) {
			direction = Movable.WEST;
		}
		this.field = field;
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public abstract void update();

	protected void move() {
		this.x = this.nextX;
		this.y = this.nextY;
		this.direction = this.nextDirection;
	}

	public boolean isDestroyed() {
		return isDestroyed;
	}

	public void setDestroyed(boolean isDestroyed) {
		this.isDestroyed = isDestroyed;
	}

	public boolean isIntersect(Movable other) {
		if (this.x == other.x && this.y == other.y) {
			return true;
		} else
			return false;
	}

	public int getX() {
		return x;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public int getY() {
		return y;
	}

	public int getDirection() {
		return direction;
	}

	public int getNextX() {
		return nextX;
	}

	public int getNextY() {
		return nextY;
	}

	public int getNextDirection() {
		return nextDirection;
	}
}
