package demo;
import java.util.Scanner;
public class two_dimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Enter Matrix A");
			int[][] A = new int[2][2];
			
			int i,j;
			
			Scanner myObj = new Scanner(System.in);
			for(i=0;i<2;i++) {
				for(j=0;j<2;j++) {
					A[i][j] = myObj.nextInt();
				}
			}
			
			for(i=0;i<2;i++) {
				for(j=0;j<2;j++) {
					System.out.println(A[i][j]);
				}
			}
	}

}
