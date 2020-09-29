package testProject;

import java.util.Scanner;

public class AreaofShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int length,breadth ,rectangle ,radius ,square;
float circle;
Scanner sc= new Scanner(System.in);
System.out.print("enter length breadth radius: ");
 length =sc.nextInt();
 breadth =sc.nextInt();
 radius = sc.nextInt();
 double pi=3.14159265359;
 
 rectangle=length*breadth;
 square=length*length;
 
circle=(float)pi*radius*radius;

System.out.println("the area of rectangle="+rectangle);
System.out.println("the area of square="+square);
System.out.println("the area of circle="+circle);
}

	
}
