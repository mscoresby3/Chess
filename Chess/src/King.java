
public class King extends Piece {
	public King(boolean whiteTeam, char coloum, int row) {
		super(whiteTeam, 1, coloum, row);
	}
	
	@Override
	public String toString() {
		String message = "King - ";
		if (this.whiteTeam) {
			message += "W";
		} else {
			message += "B";
		}
		return message;
	}
}
