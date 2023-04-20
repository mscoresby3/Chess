import javax.swing.JButton;

public class Position {
	public char coloum;
	public int row;
	public JButton button;
	private Piece currentPiece;
	
	private static int currentRow = 1;
	private static char currentColoum = 'a';
	
	public Position() {
		this.coloum = currentColoum;
		this.row = currentRow;
		currentRow++;
		if (currentRow == 9) {
			currentRow = 1;
			currentColoum++;
			if (currentColoum == 'i') {
				currentColoum = 'a';
			}
		}
		this.button = new JButton();
		this.button.setSize(50, 50);
		this.currentPiece = null;
	}
	
	public void setPiece(String piece, boolean whiteTeam) throws Exception{
		if (piece.equals("Pawn")) {
			this.currentPiece = new Pawn(whiteTeam, this.coloum, this.row);
		} else {
			throw new Exception("Not a Vaild Piece");
		}
	}
	
	public Piece getPiece() {
		return this.currentPiece;
	}
	
	public String toString() {
		if (this.currentPiece == null) {
			return " - ";
		} else {
			return this.currentPiece.toString();
		}
	}
}
