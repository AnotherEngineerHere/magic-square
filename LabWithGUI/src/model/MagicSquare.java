package model;

public class MagicSquare {

	private int size;
	
	private int matrix[][];
	
	
	/**
	 * 
	 * @param s This is the size n of the matrix
	 */
	public MagicSquare(int s){
		size = s;
		matrix = new int[s][s];
		
	}
	public int[][] getMatrix() {
		return matrix;
	}
/**
 * 
 * @param size
 * @return
 */
	public boolean isOddNumber(int size) {
		boolean isOdd = false;
		double c = 0;
		
		c = size%2;
		
		if(c==1.0) {
			isOdd = true;
		}
		else {
			isOdd = false;
		}
		
		return isOdd;
	}	

/**
 * 
 * @return
 */
	public int magicVerify(){
		int constant = 0;
		constant = (int) (size*(Math.pow(size,2)+1)/2);
		return constant;
	}
	public int fillMatrix() {
		int a =0;
		 for (int i = 0; i < matrix.length; i++) {
			    for (int j = 0; j < matrix[i].length; j++) {
			        a = matrix[i][j];
			    }
			}
			return a;
	
	}
	/**
	 * 
	 * @param pos Indicates the start position it could be Up,Down,left or right
	 * @param dir Indicates the direction, it could be North East, North West,South East and South West
	 */
	public void calculate(String pos,String dir) {
	int col = (size/2);
	int in = 1;
	int row =0;
	int pasposr = 0;
	int pasposc = 0;
	int contador = 1;
	int dirmov = 0;
	int tamanio = matrix.length-1;
	int sis = (size*size);
	if(pos.equalsIgnoreCase("UP")) {
		matrix[row][col]= in;
		 if(dir.equalsIgnoreCase("NW")){
			 dirmov = -1;
			while(contador<sis) {
						pasposc = col;
						pasposr = row;
						col+=dirmov;
						row+=dirmov;
						in++;
					
							if(col==-1) {
								col+=matrix.length;
							}
								if(row==-1) {
									row+=matrix.length;
								}
									if(matrix[row][col]==0) {
										matrix[row][col]=in;									
									}
										else {
											col = pasposc;
											row = pasposr;
											row ++;
											if(contador<(size*size)){
											matrix[row][col]=in;
											}
										}contador++;

				}
		 } if(dir.equalsIgnoreCase("NE")){
				 dirmov = -1;
					while(contador<sis) {
						pasposc = col;
						pasposr = row;
						col = col+1;
						row+=dirmov;
						in++;
						if(col==-1) {
							col+=matrix.length;
						}
						if(col>=size) {
							col=0;
							
						}
						
						if(row==-1) {
							row+=matrix.length;
							
						}
						if(row>=size) {
							row= row +dirmov;
							
						}
						
						if(matrix[row][col]==0) {
							matrix[row][col]=in;
							
						}
						
						else {
							
							col = pasposc;
							row = pasposr;
							
							row = row+1;
							if(row==-1) {
								row+=matrix.length;
								
							}
							if(row>=size) {
								row= row +dirmov;
								
							}
							
							matrix[row][col]=in;
						
						}
						
						 contador++;
					}
			 }
		 }//Finish UP
			 if(pos.equalsIgnoreCase("DOWN")) {
				row = tamanio;
				matrix[row][col]=in;
				 if(dir.equals("SW")){
					 dirmov = -1;
						while(contador<=sis) {
							        pasposc = col;
									pasposr = row;
									col+=dirmov;
									row+=-dirmov;
									in++;
								
									if(col==-1) {
										col+=matrix.length;
									}
									if(col==size) {
										col=0;
									}
									
									if(row==-1) {
										row+=matrix.length;
									}
									if(row==size) {
										row= 0;
									}
									if(matrix[row][col]==0) {
										matrix[row][col]=in;
									}else {
														col = pasposc;
														row = pasposr;
														row--;
														if(contador<(size*size)) {
														matrix[row][col]=in;
														}
													}contador++;
			
							}
						}
				 if(dir.equals("SE")){
					 dirmov = -1;
						while(contador<=sis) {
							pasposc = col;
							pasposr = row;
							col = col+1;
							row = row+1;
							in++;
							if(col==-1) {
								col+=matrix.length;
							}
							if(col>=size) {
								col=0;
							}
							if(row==-1) {
								row+=matrix.length;
								
							}
							if(row==size) {
								row= 0;
							}
							
							if(matrix[row][col]==0) {
								matrix[row][col]=in;
							}
							
							else {
								col = pasposc;
								row = pasposr;
								row--;
								if(contador<(size*size)){
								matrix[row][col]=in;

								}
							}								
							 contador++;
						}
				 }

			}
			 if(pos.equalsIgnoreCase("LEFT")) {
					col=tamanio;
					row =tamanio/2;
					matrix[row][col]=in;

					if(dir.equals("NW")){
						dirmov = -1;
						while(contador<=sis) {								 
									pasposc = col;
									pasposr = row;
									col+=dirmov;
									row+=dirmov;
									in++;
								
										if(col==-1) {
											col+=matrix.length;

										}
											if(row==-1) {
												row+=matrix.length;

											}
												if(matrix[row][col]==0) {
													matrix[row][col]=in;

													
												}
													else {
														col = pasposc;
														row = pasposr;
														col++;
														if(col==-1) {
															col+=matrix.length;
														}
														if(col==size) {
															col=0;
														}
														
														if(row==-1) {
															row+=matrix.length;
														}
														if(row==size) {
															row= 0;
														}
																if(matrix[row][col]==0) {
																	matrix[row][col]=in;
																}
														matrix[row][col]=in;
													}contador++;
			
							}
					}
					if(dir.equals("SW")){
						dirmov = -1;
						while(contador<=sis) {
									pasposc = col;
									pasposr = row;
									col+=dirmov;
									row+=-dirmov;
									in++;
								
									if(col==-1) {
										col+=matrix.length;											
									}
									if(col==size) {
										col=0;										
									}
									
									if(row==-1) {
										row+=matrix.length;										
									}
									if(row==size) {
										row= 0;
									}
									if(matrix[row][col]==0) {
										if(col<=size*size) {
										matrix[row][col]=in;
										}											
									}else {														
														col = pasposc;
														row = pasposr;															
														col++;
														if(col==-1) {
															col+=matrix.length;																
														}
														if(col==size) {
															col=0;														
														}									
														
														matrix[row][col]=in;
													}contador++;
						}
					}
				}
				if(pos.equalsIgnoreCase("RIGHT")) {
					col = tamanio;
					row=tamanio/2;
					matrix[row][col]=in;
					if(dir.equals("NE")){
						 dirmov = -1;
							while(contador<=sis) {
								 contador++;
								pasposc = col;
								pasposr = row;
								col = col+1;
								row+=dirmov;
								in++;
								if(col==-1) {
									col+=matrix.length;
								}
								if(col>=size) {
									col=0;
									
								}
								
								if(row==-1) {
									row+=matrix.length;
									
								}
								if(row>=size) {
									row= row +dirmov;
									
								}
								
								if(matrix[row][col]==0) {
									matrix[row][col]=in;
									
								}
								
								else {
									col = pasposc;
									row = pasposr;
									col--;
									if(col==-1) {
										col+=matrix.length;
									}
									if(col==size) {
										col=0;
									}
									if(contador==(size*size)){
									matrix[row][col]=in;}
									}									
								}
					}
					if(dir.equals("SE")){
						 dirmov = -1;
							while(contador<=sis) {
								pasposc = col;
								pasposr = row;
								col = col+1;
								row = row+1;
								in++;
								if(col==-1) {
									col+=matrix.length;
								}
								if(col>=size) {
									col=0;
									
								}
								if(row==size) {
									row= 0;
									
								}
								
								if(matrix[row][col]==0) {
									matrix[row][col]=in;
									
								}
								
								else {
									col = pasposc;
									row = pasposr;
									col--;
									if(col==-1) {
										col+=matrix.length;
									}
									if(col==size) {
										col=0;
									}
									matrix[row][col]=in;
									}									
								 contador++;
							}
						}	
					}			
				}
	/**
	 * 			
	 * @param i It is the row coordinate
	 * @param j It is the column coordinate
	 * @return A String with the value of the matrix
	 */
	public String printMatrix(int i,int j) {
		String  b = "";
		b += matrix[i][j];
		return b;
	}
}


	