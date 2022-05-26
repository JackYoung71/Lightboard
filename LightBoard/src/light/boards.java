package light;
import javax.swing.JOptionPane;

//This classs contains each preset for the board sizes that the overseer uses to change the lightboard to in the program.
public class boards {


	private boolean[][] Rico = new boolean[][] { 
		{false, false, false, false, false, false, false, false, false, false,	 false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false,	 false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false,  true,  true, false, false, false, false, false, false, false, false,  true,  true,  true,  true, false,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false,  true,  true, false,  true,  true,  true, false, false, false, false, false,  true, false, false, false,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false,  true, false, false,  true, false, false, false, false, false, false, false, false, false, false,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false,  true, false, false, false, false, false, false, false, false, false, false, false, false, false,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false,  true, false, false, false, false, false, false, false, false, false, false, false, false, false,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false, false,  true, false, false, false, false, false, false, false, false, false, false, false,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false, false,  true, false, false, false, false,  true, false,  true,  true,  true,  true, false,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false, false,  true,  true, false,  true,  true,  true,  true, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false, false,  true,  true,  true,  true, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false, false, false,  true,  true,  true,  true, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false,  true,  true,  true,  true, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false}, 
		{false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false}, 
		{false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false}, 
		{false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false,  true,  true,  true,  true,  true, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true}, 
		{false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true}, 
		{false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true}, 
		{false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true}, 
		{false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true}, 
		{false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true}, 
		{false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true}, 
		{false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true}, 
		{false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true}, 
		{false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true}, 
		{false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true}, 
		};
		
	private boolean[][] glasses = new boolean[][] { 
		{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true, false, false,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true, false, false,  true,  true,  true,  true, true, false,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false,  true, false,  true,  true,  true, false, false, false, false,  true,  true,  true, false, false,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false,  true, false, false, false, false, false, false, false, false, false, false, false, false, false,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false, false,  true, false, false, false, false, false, false, false, false, false, false, false,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false, false,  true, false, false, false, false,  true, false,  true,  true,  true,  true, false,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false, false,  true,  true, false,  true,  true,  true,  true, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false, false,  true,  true,  true,  true, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false, false, false,  true,  true,  true,  true, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false,  true,  true,  true,  true, false, false, false, false, false, false, false, false}, 
		{false, false, false, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false}, 
		{false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false}, 
		{false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false}, 
		{false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false,  true,  true,  true,  true,  true, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true}, 
		{false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true}, 
		{false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true}, 
		{false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true}, 
		{false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true}, 
		{false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true}, 
		{false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true}, 
		{false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true}, 
		{false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true}, 
		{false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true}, 
		{false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true, false, false,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true}, 
		}; // semi-colon ends the number of variables!!!

	
	

	private boolean[][] five = new boolean[][] { 
	{ false, false, false, false, false},
	{ false,  true, false,  true, false},
	{ false, false, false, false, false},
	{  true, false, false, false,  true},
	{  true,  true,  true,  true,  true},
	};
	private boolean[][] six = new boolean[][] { 
		
		{ false,  true,  true,  true,  true, false},
		{  true, false,  true,  true,  true,  true},
		{  true,  true,  true,  true,  true,  true},
		{  true,  true,  true, false, false, false},
		{  true,  true,  true,  true,  true, false},
		{  true,  true,  true, false, false, false},
		
		};
	private boolean[][] seven = new boolean[][] { 
	{ false, false, false,  true, false, false, false},
	{ false, false,  true, false,  true, false, false},
	{ false,  true, false, false, false,  true, false},
	{  true,  true,  true, false, false,  true, false},
	{  true,  true,  true, false,  true,  true,  true},
	{  true,  true,  true, false,  true,  true,  true},
	{ false, false, false, false,  true,  true,  true},
	};
	
	private boolean[][] eight = new boolean[][] { 
		{ false, false, false,  true,  true,  true, false, false},
		{ false, false,  true, false, false, false,  true, false},
		{ false, false,  true, false,  true, false,  true, false},
		{ false, false,  true, false, false,  true,  true,  true},
		{ false,  true,  true,  true, false, false,  true, false},
		{ false,  true, false, false, false, false,  true, false},
		{ false, false,  true,  true,  true,  true, false, false},
		{ false, false, false,  true, false,  true, false, false},
		};
	private boolean[][] nine = new boolean[][] { 
	{ false, false, false, false,  true, false, false,  true, false},
	{ false, false, false, false,  true,  true,  true,  true, false},
	{ false,  true,  true, false,  true, false,  true, false,  true},
	{  true, false, false,  true,  true, false, false, false,  true},
	{  true, false, false, false,  true, false,  true,  true, false},
	{ false,  true, false, false,  true, false, false, false,  true},
	{ false, false,  true, false,  true, false,  true,  true,  true},
	{ false, false,  true, false, false, false, false,  true, false},
	{ false, false, false,  true,  true,  true,  true,  true,  true},
	};
	private boolean[][] ten = new boolean[][] { 
	{ false, false, false,  true, false, false, false,  true, false, false},
	{ false, false, false,  true, false, false, false,  true, false, false},
	{ false, false,  true,  true, false, false,  true,  true, false, false},
	{ false,  true, false, false, false,  true, false, false, false, false},
	{  true, false, false, false,  true, false, false, false, false, false},
	{  true, false, false, false,  true, false, false, false, false, false},
	{  true, false, false, false,  true, false, false, false, false, false},
	{ false,  true, false, false, false,  true, false, false, false,  true},
	{ false, false,  true,  true,  true, false,  true,  true,  true, false},
	{ false, false, false,  true, false, false, false,  true, false, false},		
	};


	boards() {	}

	public boolean[][] getGlasses() {return glasses;}
	public boolean[][] getRico() {return Rico;}
	public boolean[][] getFive() {return five;}
	public boolean[][] getSix() {return six;}
	public boolean[][] getSeven() {return seven;}
	public boolean[][] getEight() {return eight;}
	public boolean[][] getNine() {return nine;}
	public boolean[][] getTen() {return ten;}
	
	
	
	//This method takes in the size of the array and returns a 2D boolean array that corresponds to the given size.
	public boolean[][] getArray(int size) {
		// \"\"
		
		if(size == 5) { JOptionPane.showMessageDialog(null, "Picasso presents.... \"el smiley face\"");
			return five;
		} if(size == 6) { JOptionPane.showMessageDialog(null, "Picasso presents.... \"dino head\"");
			return six;
		} if(size == 7) { JOptionPane.showMessageDialog(null, "Picasso presents....\"los cherries\"");
			return seven;
		} if(size == 8) { JOptionPane.showMessageDialog(null, "Picasso presents....\"duck\"");
			return eight;
		} if(size == 9) { JOptionPane.showMessageDialog(null, "Picasso presents....\"squirrel\""); 
			return nine;
		} if(size == 10) { JOptionPane.showMessageDialog(null, "Picasso presents.... \"booty cheeks\"");
			//System.out.println("changing array") { JOptionPane.showMessageDialog(null, "Picasso presents....");;
			return ten;
		}
		if(Overseer.isRico()) { 
			JOptionPane.showMessageDialog(null, "Picasso presents....\"The Cooler Rico\"");
			return glasses;
		}
		return glasses;
	}
	
	  
}
