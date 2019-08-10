package capgemini_JAVA;

//Author: Govind Akhil
//Date:24/07/2019
//Purpose:To print Multiplemain.
public class Multiplemain
{
	public static void main(String args[])
	{
		System.out.println("Hello..");
		// calling another main method....
		main(new int[]{});
	}
	//main can be overloaded.
	public static void main(int args[])
	{
		System.out.println("Hi..");
	}
}
 