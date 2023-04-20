
public class Piece {
	boolean whiteTeam;
	int points;
	public char coloum;
	public int row;
	
	public Piece(boolean whiteTeam, int points, char coloum, int row) {
		this.whiteTeam = whiteTeam;
		this.points = points;
	}
	
	public boolean canMove(char coloum, int row, Board board) throws Exception{
		if (board.array[Board.charToInt(coloum)][row].getPiece() == null) {
			return true;
		} else if(board.array[Board.charToInt(coloum)][row].getPiece().whiteTeam == this.whiteTeam) {
			return false;
		} else {
			return true;
		}
	}
	
	public String toString() {
		return "error";
	}
}
