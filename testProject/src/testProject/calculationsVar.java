package testProject;

import java.util.Scanner;

public class calculationsVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int first,second,addition,substraction,multiplication;
float divide;
Scanner sc=new Scanner(System.in);
System.out.print("Enter Two Numbers : ");
first =sc.nextInt();
second =sc.nextInt();

addition =first+second;
substraction =first-second;
multiplication = first*second;

divide=(float)first/second;
System.out.println("the sum of integer=" + addition);
System.out.println("the difference of integer=" +substraction);
System.out.println("the multiplication of integer="+ multiplication);
System.out.println("the division of integer=" +divide);


	}

}
