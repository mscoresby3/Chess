
public class Kinght extends Piece{
	
	public Kinght(boolean whiteTeam, char coloum, int row) {
		super(whiteTeam, 1, coloum, row);
	}
	
	@Override
	public String toString() {
		String message = "Kinght - ";
		if (this.whiteTeam) {
			message += "W";
		} else {
			message += "B";
		}
		return message;
	}
}
