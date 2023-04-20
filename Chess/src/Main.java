import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Main {
	public JFrame frame;
	
	public static void buttonFunction(Position thisPosition) {
		
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		System.out.println("System Starting");
		initialize();
	}

	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		Board board = new Board();

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				final int i2 = i;
				final int j2 = j;
				board.array[i][j].button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						buttonFunction(board.array[i2][j2]);
					}
				});
				board.array[i][j].button.setLocation(i * 50, j * 50 );
				if (board.array[i][j].getPiece() == null) {
					board.array[i][j].button.setText(" - ");
				} else {
					board.array[i][j].button.setText(board.array[i][j].getPiece().toString());
				}
				frame.getContentPane().add(board.array[i][j].button);
			}
		}
		
		System.out.println("System Started");
	}
}
