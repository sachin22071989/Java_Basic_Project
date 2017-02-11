package com.core.oops;

import com.core.services.CoreServices;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "";
		int num = 0;
		for (int i = 0; i <= args.length - 1; i++) {
			input = input + args[i] + " ";
		}
		// System.out.println(input);
		input = input.trim();
		try {
			num = Integer.parseInt(input);
			// num = num + 1;
			// System.out.println(num);
		} catch (NumberFormatException exp) {

			System.out.println("------------Exception---------------");
			System.out.println("Unable to convert string to Number");
			System.out.println("------------End of Excpetion--------\n");
			// exp.printStackTrace();
			System.out.println("Program Terminated, Kindly Provide numbers\n");
			System.exit(0);
		} finally {
			// System.out.println(num);

		}
		CoreServices cs = new CoreServices();
		
		int arm = 153;
		if (cs.isArmstrong(arm) == true) {
			System.out.println("Input --> " + arm + " \nNumber is Armstrong");
			
		} else {
			System.out.println("Input --> " + arm + " \nNot a Armstrong Number");
		}
		System.out.println(cs.stringReverse("sachin"));
		System.out.println(cs.upperCase("sachin kumar kashyap"));
	}
}
