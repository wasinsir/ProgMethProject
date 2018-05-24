package data;

import java.util.Random;

public class Police extends Movable {

	public Police(Field field, int x, int y, int direction, int movingDelay) {
		super(field, x, y, direction, movingDelay);
		// TODO Auto-generated constructor stub
		field.setTerrainAt(this.x, this.y, 80);
	}

	public void moveP() {
		Random rand = new Random();
		int a = rand.nextInt(4);
		if (a == 0)
			this.moveUp();
		else if (a == 1)
			this.moveDown();
		else if (a == 2)
			this.moveLeft();
		else if (a == 3)
			this.moveRight();
	}

	public void moveUp() {

		if (this.field.getTerrainAt(this.nextX, this.nextY - 1) >= 0 && (!this.field.outOfField(nextX, nextY - 1))) {
			this.nextY = this.y - 1;
		}
	}

	public void moveDown() {

		if (this.field.getTerrainAt(this.nextX, this.nextY + 1) >= 0 && (!this.field.outOfField(nextX, nextY + 1))) {
			this.nextY = this.y + 1;
		}
	}

	public void moveRight() {

		if (this.field.getTerrainAt(this.nextX + 1, this.nextY) >= 0 && (!this.field.outOfField(nextX + 1, nextY))) {
			this.nextX = this.x + 1;
		}
	}

	public void moveLeft() {

		if (this.field.getTerrainAt(this.nextX - 1, this.nextY) >= 0 && (!this.field.outOfField(nextX - 1, nextY))) {
			this.nextX = this.x - 1;
		}
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		field.setTerrainAt(this.x, this.y, 0);
		move();
		field.setTerrainAt(this.x, this.y, 80);
	}

}
