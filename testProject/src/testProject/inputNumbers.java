package testProject;

import java.util.Scanner;

public class inputNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); // input function
     System.out.print("input first num:");
     int num1=in.nextInt();
     System.out.print("input second num: ");
     int num2=in.nextInt();
     
     System.out.println("the sum of two number is "+(num1+num2));
     System.out.println("the difference betn two number is"+(num1-num2) );
     System.out.println("the mulplication of two number is"+(num1*num2));
     System.out.println("the division of two number is"+(num1/num2));
	}

}
