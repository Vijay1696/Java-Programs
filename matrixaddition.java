/**
 * 
 */

/**
 * @author Gaddam Bhavani
 *
 */
public class matrixaddition {
	public static void main(String [] args) {
		int[][] N = new int[3][3];
		int[][] M = new int[3][3];
		
		N[0][0] = 1;
		N[0][1] = 2;
		N[0][2] = 3;
		N[1][0] = 4;
		N[1][1] = 5;
		N[1][2] = 6;
		N[2][0] = 7;
		N[2][1] = 8;
		N[2][2] = 9;
		M[0][0] = 11;
		M[0][1] = 12;
		M[0][2] = 13;
		M[1][0] = 14;
		M[1][1] = 15;
		M[1][2] = 16;
		M[2][0] = 17;
		M[2][1] = 18;
		M[2][2] = 19;
		
		for(int i=0; i< N.length; i++) {
			
			for(int j=0; j< M.length; j++) {
				System.out.print(N[i][j] + " ");
				System.out.print(M[i][j] + " ");
				System.out.print(N[i][j] + M[i][j] + " ");
			}
			System.out.println();
		}
	}
	

}
