import java.util.Scanner;

public class oh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner sc =new Scanner(System.in);
		System.out.print("���� ����");
		int fn = sc.nextInt();
		System.out.print("������ ����");
		int ln = sc.nextInt();
	
		for(int i = fn; i<=ln;i++) {
			sum +=i;
		}	
		System.out.println(fn+"����"+ln+"������ ����? "+sum);
		
	}

}
