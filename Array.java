//Author: Govind Akhil
//Date: 24/07/2019
//Purpose: To Print an Array.
package capgemini_JAVA;
import java.util.*;
public class Array
{
		public static void main(String args[])
		{
			 
			int[] nums = {1,2,3,4,5};
			for(int index=0;index < nums.length; index++) 
				{
				System.out.println(nums[index]);
				}
			char[] vowels = {'A','E','I','O','U'};
			System.out.println(Arrays.toString(vowels));
				
			String[] countrys = {"India","China","Japan"};
			System.out.println(Arrays.toString(countrys));
			for(String country : countrys)
				{
				System.out.println(country);
				}	
			
			
		}

}
