import java.util.Scanner;

public class CircleExam {
	public static void main(String args[]) {
		 Scanner scan = new Scanner(System.in);
		 System.out.print("������ �� >>");
		 
		int n = scan.nextInt();
		 Circle c = new Circle(n);
		 
		 
	
		 System.out.println("������ "+ c.radius+ "�� ���� ���̴� " + c.Area() + "�̴�.");  // ��¹�
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