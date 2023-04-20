
public class Pawn extends Piece{
	
	private boolean firstMove = true;
	
	public Pawn(boolean whiteTeam, char coloum, int row) {
		super(whiteTeam, 1, coloum, row);
	}
	
	public boolean getFirstMove() {
		return firstMove;
	}
	
	@Override
	public boolean canMove(char coloum, int row, Board board) throws Exception {
		if (super.canMove(coloum, row, board)) {
			if (coloum == this.coloum) {
				if (row == this.row + 1) {
					return true;
				} else {
					if (this.firstMove && row == this.row + 2) {
						return true;
					} else {
						return false;
					}
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		String message = "Pawn - ";
		if (this.whiteTeam) {
			message += "W";
		} else {
			message += "B";
		}
		return message;
	}
}
