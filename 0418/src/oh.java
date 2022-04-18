import java.util.Scanner;

public class oh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner sc =new Scanner(System.in);
		System.out.print("시작 숫자");
		int fn = sc.nextInt();
		System.out.print("마지막 숫자");
		int ln = sc.nextInt();
	
		for(int i = fn; i<=ln;i++) {
			sum +=i;
		}	
		System.out.println(fn+"부터"+ln+"까지의 합은? "+sum);
		
	}

}
