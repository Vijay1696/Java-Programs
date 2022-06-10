import java.util.Scanner;
public class substract {
		public static void main(String[] args) {
		int a,b;
		Scanner S= new Scanner(System.in);
		System.out.println("Enter the size of row:");
		a=S.nextInt();
		System.out.println("Enter the size of column:");
		b=S.nextInt();
		int[][] M = new int[a][b];
		int[][] N = new int[a][b];
		for(int i=0; i< M.length; i++) {
			System.out.println("row "+(i+1));
			for(int j=0; j< M[i].length; j++) {
				System.out.println("column "+(j+1));
				M[i][j] = S.nextInt();
			}
		}
		for(int i=0; i< M.length; i++) {
			for(int j=0; j< M[i].length; j++) {
				System.out.print(M[i][j] + "  ");
		}
			System.out.println();
		
	}
		for(int i=0; i< N.length; i++) {
			System.out.println("row "+(i+1));
			for(int j=0; j< N[i].length; j++) {
				System.out.println("column "+(j+1));
				N[i][j] = S.nextInt();
			}
		}
		for(int i=0; i< N.length; i++) {
			for(int j=0; j< N[i].length; j++) {
				System.out.print(N[i][j] + "  ");
		}
			System.out.println();
			System.out.println();
	}
		for(int i=0; i< N.length; i++) {
			
			for(int j=0; j< M.length; j++) {
				System.out.print(M[i][j] - N[i][j] + " ");
			}
			System.out.println();
		}
		

		//System.out.println("Enter the matrix N:" + N[a][b]);
		//System.out.println("Enter the matrix M:" + M[a][b]);

		}

	}


