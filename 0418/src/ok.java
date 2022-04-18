import java.util.Scanner;
public class ok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		int i = sc.nextInt();
		int sum = 0;
		for(int c =1;c<=i;c++) {
			if(c%4==0) {
				sum += c;
			}
		}
 		System.out.println("4의 배수의 합은?"+sum);
	}

}
