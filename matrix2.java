
public class matrix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] S = new String[3][4];
		
		S[0][0] = "Vijay";
		S[0][1] = "Bhavani";
		S[0][2] = "Vamshi";
		S[0][3] = "Krishna";
		S[1][0] = "Hari";
		S[1][1] = "Karan";
		S[1][2] = "Pavan";
		S[1][3] = "Anji";
		S[2][0] = "Charan";
		S[2][1] = "Shashi";
		S[2][2] = "Mohini";
		S[2][3] = "Kiran";
		for(int i=0; i< S.length; i++) {
			for(int j=0; j< S[i].length; j++) {
				System.out.print(S[i][j] + "  ");
		}
			System.out.println();
		
	}
		System.out.println(S[1].length);
}
}
