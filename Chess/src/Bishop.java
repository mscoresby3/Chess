
public class Bishop extends Piece {

	public Bishop(boolean whiteTeam, char coloum, int row) {
		super(whiteTeam, 1, coloum, row);
	}
	
	@Override
	public String toString() {
		String message = "Bishop - ";
		if (this.whiteTeam) {
			message += "W";
		} else {
			message += "B";
		}
		return message;
	}
}
