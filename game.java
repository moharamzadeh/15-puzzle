public class game {
    public static void move() {
        if (core.gameOver) {
            core.newGame();
        }
        else {
            int colClick = 0;
            int rowClick = 0;

            int colBlank = 0;
            int rowBlank = 0;

            int dir = 0;

            if (colClick == colBlank && rowClick != rowBlank)
                dir = (rowClick - rowBlank) > 0 ? mainMenu.size : -mainMenu.size;
            else if (rowClick == rowBlank && colClick != colBlank)
                dir = (colClick - colBlank) > 0 ? 1: -1;

            if (dir != 0) {
                do {
                    int newBlankPos = core.blankPos + dir;
                    core.tiles[core.blankPos] = core.tiles[newBlankPos];
                    core.blankPos = newBlankPos;
                } while (core.blankPos != ClickPos);

                core.tiles[core.blankPos] = 0;
            }

            core.gameOver = core.isSolved();
        }
        core.newGame();
    }

    
}