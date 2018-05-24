package data;

import main.MyException;

public class Player extends Movable {

	private int money;
	private int life;
	private boolean isWin = false;

	public Player(Field field, int x, int y, int direction, int movingDelay) {
		super(field, x, y, direction, movingDelay);
		this.money = 0;
		this.life = 5;
		field.setTerrainAt(this.x, this.y, 100);
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
		if (field.getTerrainAt(this.x, this.y) == 20) {
			this.decreaseLife(1);
			this.increaseMoney(100);
			System.out.println(this.getMoney());
		}
		if (field.getTerrainAt(this.x, this.y) == 80) {
			this.decreaseMoney(this.getMoney());
		}
		if (field.getTerrainAt(this.x, this.y) == 99) {
			this.isWin = true;
		}
		field.setTerrainAt(this.x, this.y, 100);
	}

	public boolean isWin() throws MyException {
		if(isWin) {
			throw new MyException();
		}
		return isWin;
	}

	public void increaseMoney(int money) {
		this.money = this.money + money;
	}

	public void decreaseMoney(int money) {
		this.money = this.money - money;
	}

	public int getMoney() {
		return money;
	}

	public int getLife() {
		return life;
	}

	public void decreaseLife(int a) {
		this.life = this.life - a;
		if (this.life <= 0)
			this.isDestroyed = true;
	}
}
