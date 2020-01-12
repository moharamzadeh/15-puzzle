public class core {
	private boolean gameOver = true;
	
	public static void newGame() {
		do {
			newTile();
			shuffle();
		} while (!isSolvable());

		gomeOver = false;

	}

	private static void newTile() {
		for (int i = 0; i < tiles.length; i++)
			tiles[i] = (i + 1) % tiles.length;

		blankPos = tiles.lenght - 1;

	}
}
