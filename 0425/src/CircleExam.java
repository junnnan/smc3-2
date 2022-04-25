import java.util.Scanner;

public class CircleExam {
	public static void main(String args[]) {
		 Scanner scan = new Scanner(System.in);
		 System.out.print("반지름 값 >>");
		 
		int n = scan.nextInt();
		 Circle c = new Circle(n);
		 
		 
	
		 System.out.println("반지름 "+ c.radius+ "인 원의 넓이는 " + c.Area() + "이다.");  // 출력문
	}
}

class Circle{
	int radius =0;

public Circle(int radius) {
	this.radius= radius;
}
	
	public double Area() {   
		return radius*radius*3.14;
	}
}