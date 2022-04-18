import java.util.Scanner;
public class GradeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Grade me = new Grade();
		System.out.println("수점");
		me.math = sc.nextInt();
		System.out.println("괒머");
		me.science = sc.nextInt();
		System.out.println("영점");
		me.english = sc.nextInt();
		
		me.average();
		System.out.println(me.average()
				
				);
		
	}

}

class Grade{
	int math;
	int science;
	int english;
	public int average() {
		return (math+science+english)/3;
	}
}
 