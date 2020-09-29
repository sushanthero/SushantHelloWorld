//to declare variables a2+2ab+b2
package testProject;

import java.util.Scanner;

public class DeclareVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,c,d,e,p,q;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the variables: ");
		a= sc.nextFloat();
		b= sc.nextFloat();
		c= sc.nextFloat();
		d= sc.nextFloat();
		e= sc.nextFloat();
		
		p= a*a+2*a*b+b*b;
		q= (a*a*a*a*a +(b*b*b*b * c*c*c)+d*d*e);
		System.out.println("p="+p);
		System.out.println("q="+q);
		}

	}


