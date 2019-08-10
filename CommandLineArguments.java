//Author: Govind Akhil
//Date: 24/07/2019
//Purpose: To Print an Commandline arguments.
package capgemini_JAVA;

public class CommandLineArguments 
{
	public static void main(String[] args)
	{
		String value1,value2;
		value1 =value2 = null;
		
		value1=args[0];	//John
		value2=args[1];	//Doe
		System.out.println("value 1:"+value1);
		System.out.println("value 2:"+value2);
		
	}
}
