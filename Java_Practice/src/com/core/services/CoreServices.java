package com.core.services;

public class CoreServices {

	public String numToWord(String snum) {
		String[] unit = new String[] { "Zero", "one", "two" };
		String[] tens = new String[] { "Zero", "ten", "twenty" };
		String[] hunds = new String[] { "Zero", "one hundred", "two hundred" };

		int amt = Integer.parseInt(snum);

		if (amt > 99 && amt < 999) {
			for (int i = 0; i < amt; i++) {
				int rem = amt % 10;
				System.out.println(unit[rem]);
				amt = amt / 10;
			}
		}
		// System.out.println(amt / 2);
		return snum;
	}

	public boolean isArmstrong(int num) {
		System.out.println("isArmstrong() Implementation Finished !!!");
		int anum = num;

		int rem = 0, sum = 0;
		while (num > 0) {

			rem = num % 10;
			num = num / 10;
			sum = sum + (rem * rem * rem);

		}
		if (sum == anum) {
			return true;
		} else {
			return false;
		}

	}

	public String stringReverse(String str) {
		System.out.println("\nstringReverse() Implementation Finished!!!");
		String rstr = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			rstr = rstr + str.charAt(i);
		}
		System.out.println("your string -- > " + str);
		return "Output --> " + rstr;
	}

	public String upperCase(String str) {
		// System.out.println("upperCase() Implementation in progress!!!");
		String uppercase = "";
		for (int i = 0; i < str.length(); i++) {

			int ch = str.charAt(i);

			if (ch >= 97 && ch <= 122) {
				ch = ch - 32;
			}
			char c = (char) ch;
			// System.out.print(c);
			uppercase = uppercase + c;
			// System.out.println(ch);
			// System.out.println(str.charAt(i));

		}
		return "\nupperCase() --> " + uppercase;
	}

	public String lowerCase(String str) {
		System.out.println("lowerCase() Implementation in progress!!!");
		return str;
	}

	public int charCount(char word, String str) {
		System.out.println("charCount() Implementation in progress!!!");
		return 0;
	}

	public void repeatedCount(String str) {
		System.out.println("repeatedCount() Implementation in progress!!!");
	}

	public int[] dynamicArray(int[] arr) {
		System.out.println("dynamicArray() Implementation in progress!!!");
		return arr;
	}

	public int largestNo(int[] arr) {
		System.out.println("largestNo() Implementation in progress!!!");
		return 0;
	}

	public int secondLargestNo(int[] arr) {
		System.out.println("secondLargestNo() Implementation in progress!!!");
		return 0;
	}

	public String leftTrim(String str) {
		System.out.println("leftTrim() Implementation in progress!!!");
		return str;
	}

	public String rightTrim(String str) {
		System.out.println("rightTrim() Implementation in progress!!!");
		return str;
	}

	public int wordCount(String word, String str) {
		System.out.println("wordCount() Implementation in progress!!!");
		return 0;
	}

	public int[] sorting(int[] arr) {
		System.out.println("sorting() Implementation in progress!!!");
		return arr;
	}

	public double getSqaureRoot(int number) {

		double x = 1;
		for (int i = 0; i < number; i++) {
			x = 0.5 * (x + number / x);
		}
		System.out.println("sachin");
		name sachin kumar
		return x;
	}

}
