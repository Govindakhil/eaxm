package capgemini_JAVA;

import java.util.Scanner;

public class GetInput {
	static Scanner sc = new Scanner (System.in);
	static int getInput(String message){
		int Input=0;
		System.out.println(message);
		Input = sc.nextInt();
		return Input;
	}
	public static void main(String[] args) {
		int n1,n2,result;
		n1=n2=result=0;
		
		n1=getInput("Enter NO1:");
		n2=getInput("Enter NO2:");
		result = n1+n2;
		System.out.println("Result:"+result);
	}

}
