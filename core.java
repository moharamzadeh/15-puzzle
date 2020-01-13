public class core {
	public  static boolean gameOver = true;
	private static int nbTiles;
	public static int[] tiles;
	public static int blankPos;
	
	public static void newGame() {
		do {
			newTile();
			shuffle();
		} while (!isSolvable());

		gameOver = false;

	}

	private static void newTile() {
		for (int i = 0; i < tiles.length; i++)
			tiles[i] = (i + 1) % tiles.length;

		blankPos = tiles.length - 1;

	}

	private static void shuffle() {
		
		int number = nbTiles;

		while (number > 1) {
			int ran = (int)(Math.random() * number);
			number--;
			int tmp = tiles[ran];
			tiles[ran] = tiles[number];
			tiles[number] = tmp;
		}
	}

	private static boolean isSolvable() {
		int condition = 0;

		for (int i = 0; i < nbTiles; i++)
			for (int j = 0; j < i; j++)
				if (tiles[j] > tiles[i])
					condition++;
		
		return (condition % 2 == 0);

	}

	public static boolean isSolved() {
		int blanck = tiles.length - 1;

		if (tiles[blanck] != 0)
			return false;

		for (int i = nbTiles - 1; i >= 0; i--)
			if (tiles[i] != i + 1)
				return false;

		return true;

	}


}
