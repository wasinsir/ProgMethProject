package data;

import java.util.Random;

public class Animal extends Movable {


	public Animal(Field field, int x, int y, int direction, int movingDelay, int price) {
		super(field, x, y, direction, movingDelay);
		field.setTerrainAt(this.x, this.y, 20);
	}


	public void moveP() {
		Random rand = new Random();
		int a = rand.nextInt(4);
		System.out.println(a);
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
		field.setTerrainAt(this.x, this.y, 0);
		move();
		field.setTerrainAt(this.x, this.y, 20);
	}

}
