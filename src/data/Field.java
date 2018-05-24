package data;

public class Field {

	private int[][] map;

	public Field() {
		map = new int[10][10];
		int i, j;
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++)
				map[i][j] = 0;
		}
		// assign the forest
		map[0][6] = -1;
		map[1][9] = -1;
		map[2][3] = -1;
		map[3][7] = -1;
		map[4][1] = -1;
		map[5][5] = -1;
		map[6][2] = -1;
		map[7][1] = -1;
		map[8][4] = -1;
		map[9][8] = -1;

		map[9][9] = 99;
	}

	public boolean outOfField(int x, int y) {
		// TODO Auto-generated method stub
		if (x > 9 || y > 9 || x < 0 || y < 0)
			return true;
		else
			return false;
	}

	public int getTerrainAt(int x, int y) {
		// TODO Auto-generated method stub
		if (this.outOfField(x, y))
			return -5;
		else
			return map[x][y];
	}

	public void setTerrainAt(int x, int y, int s) {
		// TODO Auto-generated method stub
		map[x][y] = s;
	}

}
