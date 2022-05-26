package light;

import javax.swing.JOptionPane;

//This class conrtols the whole program and makes a new lightboard object to run the program.
//It also takes in a name and board size.
public class Overseer {

	
	private LightBoard _board;
	private static int numRows;
	private static int numCols;

	private static String _name;
	private static boolean _isRico;
	private boolean bool = true;
	
	
	//This takes a name and board size from the player and makes a new board given that information.
	public Overseer() {
		
		JOptionPane.showMessageDialog(null, "Hello! Welcome to The LightBoard");
		while(bool) {
		_name = JOptionPane.showInputDialog(null, "Type in your name." + "\n" + "If you type in the name of a certain techer with a large ego, a special picture will show with a larger board." + "\n" + "Notice: The larger board may not work on smaller computers");
		if(_name.equals("")) {
			_name = "No Name Joe";
		}
		
		if(!_name.equalsIgnoreCase("rico")) {
			try {
			numRows = Integer.parseInt(JOptionPane.showInputDialog(null, "How many rows do you want the lightboard to have? Please choose between 1 and 10." + "\n" + "If you make your lightboard a square with sides of 5 or more, you get a special option!"));
			while(numRows > 10 || numRows < 1) {
				numRows = Integer.parseInt(JOptionPane.showInputDialog("Not a valid size, try again."));
			}
			numCols = Integer.parseInt(JOptionPane.showInputDialog(null, "How many columns do you want the lightboard to have? Please choose between 1 and 10." + "\n" + "If you make your lightboard a square with sides of 5 or more, you get a special option!"));
			while(numCols > 10 || numCols < 1) {
				numCols = Integer.parseInt(JOptionPane.showInputDialog("Not a valid size, try again."));
				
			}
			_isRico = false;
			_board = new LightBoard(numRows, numCols);
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Wow, you didn't even put in a number. Fine, I'll choose for you. Your board can be a 10 by 10 board.");
				numRows = 10;
				numCols = 10;
				_isRico = false;
				_board = new LightBoard(numRows, numCols);
			}
		
		}else {
				numRows = 40;
				numCols = 40;
				_isRico = true;
				_board = new LightBoard(numRows, numCols);
				_isRico = false;
			
		}
		
		}
	}
	

	public LightBoard getBoard() { return _board; }
	
	public static int getRows() {return numRows;}
	public static int getCols() {return numCols;}
	public static String getName() {return _name;}
	public boolean getBool(){return bool;}

	public static boolean isRico() { return _isRico;}
	
	public void changeBool(){bool = false;}
}
