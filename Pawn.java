

package Chess;

public class Pawn extends Pieces {

    public Pawn(boolean isWhite, int x, int y) {
        super(isWhite, x, y);
        // TODO Auto-generated constructor stub
    }

  
    public boolean isValidMove(int newx, int newy) {
        int rowDifference = Math.abs(newx - this.getX());
        int colDifference = Math.abs(newy - this.getY());

        if (rowDifference == 1 && colDifference == 0) {
            // Valid move: Move forward by one square
            return true;
        } else if (this.isFirstMove() && rowDifference == 2 && colDifference == 0) {
            // Valid move: Move forward by two squares on the first move
            return true;
        } else if (rowDifference == 1 && colDifference == 1) {
            // Valid move: Capture diagonally
            return true;
        }

        return false;
    }

    private boolean isFirstMove() {
        return false;
    }
}

