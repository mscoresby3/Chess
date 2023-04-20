
public class Board {
	public Position[][] array;
	
	public static int charToInt(char Char) throws Exception{
		if (Char == 'a') {
			return 0;
		} else if (Char == 'b') {
			return 1;
		} else if (Char == 'c') {
			return 2;
		} else if (Char == 'd') {
			return 3;
		} else if (Char == 'e') {
			return 4;
		} else if (Char == 'f') {
			return 5;
		} else if (Char == 'g') {
			return 6;
		} else if (Char == 'a') {
			return 7;
		} else {
			throw new Exception("Not a Vaild Input");
		}
	}
	
	public Board() {
		array = new Position[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				array[i][j] = new Position();
			}
		}
	}
	
	public String toString() {
		String message = "";
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				message += " " + array[i][j].toString();
			}
			message += "\n";
		}
		return message;
	}
}
