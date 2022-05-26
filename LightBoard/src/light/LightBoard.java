package light;

import javax.swing.JOptionPane;

//This class controls the whol lightboard and all of its functions.
public class LightBoard {


	private boolean[][] lights;
	private boolean[][] funnyArray;
	private boards board;
	private int numRows;
	private int numCols;
	private String name;
	private boolean bool = true;
	

	//The constructor makes a 2D array with the size of the inputted parameters.
	public LightBoard(int rows, int cols)
	{
	  lights = new boolean[rows][cols]; 
	  numRows = lights.length;
	  numCols = lights[0].length;
	  board = new boards();
	  name = Overseer.getName();
	 
	  startBoard();
	  if(Overseer.isRico()) {
		  lights = board.getRico();
	  }
	  if(numRows == numCols && numRows >= 5) {
	  	while(bool) 
	  		buttonsWithCoolPicture();
	  }else {
		  while(bool) 
		  		buttons();
	  }
	}
	
	//This sets up the lightboard with each light having an on or off status based on a random 40% chance.
	  public void startBoard() {
		  for(int r = 0; r < lights.length; r++)
			    for(int c = 0; c < lights[0].length; c++)
			    	lights[r][c] = false;
		  for(int r = 0; r < lights.length; r++)
			    for(int c = 0; c < lights[0].length; c++)
			      if(Math.random() <= 0.4)
			        lights[r][c] = true;
	}

	  
	  //This makes the lightboard have each light having an on or off status based on a random  50% chance.
	  public void randomizeBoard() {
		  for(int r = 0; r < lights.length; r++)
			    for(int c = 0; c < lights[0].length; c++)
			    	lights[r][c] = false;
		  for(int r = 0; r < lights.length; r++)
			    for(int c = 0; c < lights[0].length; c++)
			      if(Math.random() <= 0.5)
			        lights[r][c] = true;
	}

	  
	  //These makes all the buttons that the player can choose and runs each corresponding method.
	public void buttons() {
		String[] options = 
			{"Checkerboard", "Change lights in an area", "Change lights in a diagonal line", "Change lights in a row/col", "Turn a light on/off",
					"Turn on all lights", "Turn off all lights", "Randomize", "Make a new board"};

		/*int opt = JOptionPane.showOptionDialog(null, printPuzzle(), "Hello " + Overseer.getName() + "! " + "\n" + "Choose what you wanna do with the lights"
				,
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[3]);
		 */
	    try{String choice = ((String) JOptionPane.showInputDialog(null, printBoard(), name + "'s board has " + numRows + " rows and " + numCols + " columns.", JOptionPane.QUESTION_MESSAGE, null, options, options[7]));
	    //System.out.println(choice);
	   
	    
		if (choice.equals("Change lights in an area"))
			changeInArea();
		else if(choice.equals("Change lights in a row/col")) 
			changeInRowOrCol();
		else if(choice.equals("Turn a light on/off")) 
			changeLight();
		else if(choice.equals("Turn on all lights")) 
			turnAllOn();
		else if(choice.equals("Turn off all lights")) 
			turnAllOff();
		else if (choice.equals("Randomize"))
			randomizeBoard();
		else if (choice.equals("Checkerboard"))
			checkerboard();
		else if (choice.equals("Change lights in a diagonal line"))
			diagonal();
		else if(choice.equals("Make a new board"))
			newBoard();
	    }catch(Exception e) {
	    	JOptionPane.showMessageDialog(null, "Hope you had fun with a light board!");
	    	System.exit(0);
	    }
	}
	
	//These makes all the buttons that the player can choose and runs each corresponding method, along with a few extra ones.
	public void buttonsWithCoolPicture() {
		String[] options = 
			{ "Make it a picture designed by Picasso", "Checkerboard", "Change lights in an area", "Change lights in a diagonal line", "Change lights in a row/col", "Turn a light on/off",
					"Turn on all lights", "Turn off all lights", "Randomize", "Make a new board"};

		/*int opt = JOptionPane.showOptionDialog(null, printPuzzle(), "Hello " + Overseer.getName() + "! " + "\n" + "Choose what you wanna do with the lights"
				,
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[3]);
		 */
	    try{String choice = ((String) JOptionPane.showInputDialog(null, printBoard(), name + "'s board has " + numRows + " rows and " + numCols + " columns.", JOptionPane.QUESTION_MESSAGE, null, options, options[8]));
	    //System.out.println(choice);
	   

		if (choice.equals("Change lights in an area"))
			changeInArea();
		else if(choice.equals("Change lights in a row/col")) 
			changeInRowOrCol();
		else if(choice.equals("Turn a light on/off")) 
			changeLight();
		else if(choice.equals("Turn on all lights")) 
			turnAllOn();
		else if(choice.equals("Turn off all lights")) 
			turnAllOff();
		else if (choice.equals("Randomize"))
			randomizeBoard();
		else if (choice.equals("Checkerboard"))
			checkerboard();
		else if (choice.equals("Change lights in a diagonal line"))
			diagonal();
		else if(choice.equals("Make it a picture designed by Picasso"))
			makeFunnyPicture();
		else if(choice.equals("Make a new board"))
			newBoard();
	    }catch(Exception e) {
	    	JOptionPane.showMessageDialog(null, "Hope you had fun with a light board!");
	    	System.exit(0);
	    }
	}
	
	//These makes the lightboard look like a checkerboard with alternating on/off status of each light.
	public void checkerboard(){
		for(int r = 0; r < lights.length; r++)
		    for(int c = 0; c < lights[0].length; c++)
		    	lights[r][c] = false;
		
		for(int r = 0; r < numRows; r++) {
			for(int c = 0; c < numCols; c++) {
				lights[r][c] = ((r + c) % 2 == 0);
			}
		}
	}
	
	//This lets the player make a new board.
	public void newBoard() {
		bool = false;
	}
	
	
	
	//This asks the player for a spot on a diagonal line and if it is going up or down and then sets all values along that line to on or off.
	public void diagonal(){
		
		boolean topToBottom = false;
		boolean on = false;
		int row = Integer.parseInt(JOptionPane.showInputDialog(printBoard() + "\n" + "Pick a random spot on the diagonal line." + "\n"+ "What is the row of that spot?" + "\n" + name + "'s board has " + numRows + " rows and " + numCols + " columns.")) - 1;
		while(row  < 0 || row > numRows){
			row = Integer.parseInt(JOptionPane.showInputDialog("Not a valid number, try again.")) - 1;
		}
		int col = Integer.parseInt(JOptionPane.showInputDialog(printBoard() + "\n" + "Pick a random spot on the diagonal line." + "\n"+ "What is the column of that spot?" + "\n" + name + "'s board has " + numRows + " rows and " + numCols + " columns.")) - 1;
		while(col  < 0 || col > numCols){
			col = Integer.parseInt(JOptionPane.showInputDialog("Not a valid number, try again.")) - 1;
		}
		
		String options1[] = {"Top to Bottom", "Bottom to Top"};
		int opt1 = JOptionPane.showOptionDialog(null, printBoard(), "Hello " + Overseer.getName() + "! " + "\n" + "Is the line going from the top to bottom or bottom to top?",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options1, options1[0]);
		if (opt1 == 0) {
			topToBottom = true;
		}else {
			topToBottom = false;
		}
		
		String options[] = {"Off", "On"};
		int opt2 = JOptionPane.showOptionDialog(null, printBoard(), "Hello " + Overseer.getName() + "! " + "\n" + "Do you want to turn the lights on that line off or on?",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		if (opt2 == 0) {
			on = false;
		}else {
			on = true;
		}
		
		
		
		if(topToBottom) {
			//System.out.println(row + " " + col);
			while(row > 0 && col > 0) {
				row--;
				col--;
			}
			//System.out.println(row + " " + col + " "  + numRows + "\n");
			if(row >= col) {
					int r = row;
					for(int c = col; c < numCols
							; c++) {
						lights[r][c] = on;
						//System.out.println(r + " " + c);
						if(r < (numRows-1)) {
							//System.out.println(r + " " + c + "r++" + "\n" );
							r++;
						}else {
							c = numCols;
						}
					}
				
			}
			else if(row < col) {
				int c = col;
				for(int r = row; r < numRows; r++) {
					lights[r][c] = on;
					//System.out.println(r + " " + c);
					if(c < (numCols-1)) {
						//System.out.println(r + " " + c + "c++" + "\n" );
						c++;
					}else {
						r = numRows;
					}
				}			
			}
		}
		else{
			//System.out.println(row + " " + col + "start");
			while(row < numRows && col > 0) {
				row++;
				col--;
				//System.out.println(row + " " + col + "while loop");
			}
			//System.out.println(row + " " + col + " "  + numRows + "\n");
			if(row >= col) {
				int r = row;
				//System.out.println(row + " " + col + "middle");
				for(int c = col; c < numCols; c++) {
					lights[r][c] = on;
					//System.out.println(r + " " + c + "for loop");
					if(r > (0)) {
						//System.out.println(r + " " + c + "r--" + "\n" );
						r--;
					}else {
						c = numCols;
					}
				}
			
			}
			else if(row < col) {
				int c = col;
				for(int r = row; r < numRows; r++) {
					lights[r][c] = on;
					//System.out.println(r + " " + c);
					if(c > 0) {
						//System.out.println(r + " " + c + "c--" + "\n" );
						c--;
						
					}else {
						r = numRows;
					}
				}			
			}		
		}

	}
	
	//This changes the lightboard to a funny picture preset.
	public void makeFunnyPicture() {
		if(numRows == numCols) {
			  funnyArray = board.getArray(numRows);
		  }
		if(numRows == numCols) {
			//lights = funnyArray;
			for(int r = 0; r < numRows; r ++) {
				for(int c = 0; c < numCols; c++) {
					lights[r][c] = funnyArray[r][c];
					
				}
			}
			/*
			for(int i = 0; i < numRows; i ++) {
				for(int j = 0; j < numCols; j++) {
					System.out.print(funnyArray[i][j]);
				}
				System.out.println("");
			}
			*/
		}else if(Overseer.isRico()) {
			lights = board.getGlasses();
		}
		else {
			turnAllOn();
		}
		
		
	}

	//This changes all the lights on the board from one spot to another to on or off, based on the parameters.
	public void change(int row1, int row2, int col1, int col2, boolean on) {
		if(row1 != row2 && col1 != col2) {
			for(int r = row1; r < row2; r++) {
				for(int c = col1; c < col2; c++) {
					lights[r][c] = on;
				}
			}	
		}else if(row1 == row2) {
			for(int c = col1; c < col2; c++) {
				lights[row1][c] = on;
			}
		}else {
			for(int r = row1; r < row2; r++) {
				lights[r][col1] = on;
			}
		}
	}
	
	//This changes all the lights on the board from one spot to another to on or off, based on what the player gives.
	public void changeInArea() {
		int row1 = Integer.parseInt(JOptionPane.showInputDialog(printBoard() + "\n" + "What row do you want to start it?" + "\n" + name + "'s board has " + numRows + " rows and " + numCols + " columns.")) - 1;
		while(row1  < 0 || row1 > numRows){
			row1 = Integer.parseInt(JOptionPane.showInputDialog("Not a valid number, try again.")) - 1;
		}
		int col1 = Integer.parseInt(JOptionPane.showInputDialog(printBoard() + "\n" + "What column do you want to start it?" + "\n" + name + "'s board has " + numRows + " rows and " + numCols + " columns.")) - 1;
		while(col1  < 0 || col1 > numCols){
			col1 = Integer.parseInt(JOptionPane.showInputDialog("Not a valid number, try again.")) - 1;
		}
		int row2 = Integer.parseInt(JOptionPane.showInputDialog(printBoard() + "\n" + "What row do you want to end it?" + "\n" + name + "'s board has " + numRows + " rows and " + numCols + " columns."));
		while(row2  < 0 || row2 > numRows){
			row2 = Integer.parseInt(JOptionPane.showInputDialog("Not a valid number, try again.")) - 1;
		}
		int col2 = Integer.parseInt(JOptionPane.showInputDialog(printBoard() + "\n" + "What column do you want to end it?" + "\n" + name + "'s board has " + numRows + " rows and " + numCols + " columns."));
		while(col2  < 0 || col2 > numCols){
			col2 = Integer.parseInt(JOptionPane.showInputDialog("Not a valid number, try again.")) - 1;
		}
		
		//System.out.println(row1 + " " + col1 + "\n" + row2 + " " + col2 + "\n");
		
		if(row1 > row2) {
			int num = row1;
			row1 = row2;
			row2 = num;
		}
		if(col1 > col2
				) {
			int num = col1;
			col1 = col2;
			col2 = num;
		}
		//System.out.println(row1 + " " + col1 + "\n" + row2 + " " + col2);
		
		String options[] = {"Off", "On"};
		int opt = JOptionPane.showOptionDialog(null, printBoard(), "Hello " + Overseer.getName() + "! " + "\n" + "Do you want to turn them off or on?",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		if (opt == 0) {
			change(row1, row2, col1, col2, false);
		}else {
			change(row1, row2, col1, col2, true);
		}
	}
	
	//This changes all values in a row or column to on or off.
	public void changeInRowOrCol() {
		String options[] = {"Row", "Col"};
		String offOrOn[] = {"Off", "On"};
		int row1 = 0;
		int col1 = 0;
		int row2 = 0;
		int col2 = 0;
		int opt = JOptionPane.showOptionDialog(null, printBoard() + "\n" + "What do you want to change?", "Hello " + Overseer.getName() + "! ",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		if (opt == 0) {
			row1 = Integer.parseInt(JOptionPane.showInputDialog(printBoard() + "\n" + "What row do you want to change?" + "\n" + name + "'s board has " + numRows + " rows and " + numCols + " columns.")) - 1;
			while(row1  < 0 || row1 > numRows){
				row1 = Integer.parseInt(JOptionPane.showInputDialog("Not a valid number, try again.")) - 1;
			}
			row2 = row1;
			col1 = 0;
			col2 = lights.length;
		}else {
			col1 = Integer.parseInt(JOptionPane.showInputDialog(printBoard() + "\n" + "What column do you want to change?" + "\n" + name + "'s board has " + numRows + " rows and " + numCols + " columns.")) - 1;
			while(col1  < 0 || col1 > numCols){
				col1 = Integer.parseInt(JOptionPane.showInputDialog("Not a valid number, try again.")) - 1;
			}
			col2 = col1;
			row1 = 0;
			row2 = lights.length;
		}
		//System.out.println(row1 + " " + col1 + "\n" + row2 + " " + col2);
		
		int opt2 = JOptionPane.showOptionDialog(null, printBoard(), "Hello " + Overseer.getName() + "! " + "\n" + "Do you want to turn them off or on?",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, offOrOn, offOrOn[0]);
		
		if (opt2 == 0) {
			change(row1, row2, col1, col2, false);
			
			//System.out.println("false");
		}else {
			change(row1, row2, col1, col2, true);
			//System.out.println("true");
		}
	}

	//This changes a single light to on or off.
	public void changeLight() {
		int row = Integer.parseInt(JOptionPane.showInputDialog(printBoard() + "\n" + "What is the row of the light you want to change?" + "\n" + name + "'s board has " + numRows + " rows and " + numCols + " columns.")) - 1;
		while(row  < 0 || row > numRows){
			row = Integer.parseInt(JOptionPane.showInputDialog("Not a valid number, try again.")) - 1;
		}
		int col = Integer.parseInt(JOptionPane.showInputDialog(printBoard() + "\n" + "What is the column of the light you want to change?" + "\n" + name + "'s board has " + numRows + " rows and " + numCols + " columns.")) - 1;
		while(col  < 0 || col > numCols){
			col = Integer.parseInt(JOptionPane.showInputDialog("Not a valid number, try again.")) - 1;
		}
		String options[] = {"Off", "On"};
		int opt = JOptionPane.showOptionDialog(null, printBoard(), "Hello " + Overseer.getName() + "! " + "\n" + "Do you want to turn them off or on?",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		if (opt == 0) {
			lights[row][col] = false;
		}else {
			lights[row][col] = true;
		}
	}

	//This changes the entire board to on.
	public void turnAllOn() {
		change(0, lights.length, 0, lights[0].length, true);
	}
	
	//This changes the entire board to off.
	public void turnAllOff() {
		change(0, lights.length, 0, lights[0].length, false);
	}
	

	
	
	//This prints the entire boolean array so the player can see it.
	public String printBoard() {
		
		String MAP = "";
		String off = "\u25A2";
		String on = "\u2588";
		String space = "  ";


		for(int r = 0; r < lights.length; r++) {
			for(int c = 0; c < lights[r].length; c++) {
				if(lights[r][c] == true) {
					MAP += on + space;
				}
				else {
					MAP += off + space;
				}
			}
			MAP += "\n";
		}	

		return MAP;
	}
	
}