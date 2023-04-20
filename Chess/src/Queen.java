
public class Queen extends Piece {
	
	public Queen(boolean whiteTeam, char coloum, int row) {
		super(whiteTeam, 1, coloum, row);
	}
	
	@Override
	public String toString() {
		String message = "Queen - ";
		if (this.whiteTeam) {
			message += "W";
		} else {
			message += "B";
		}
		return message;
	}
}
