package javaStudy;

public class StringEquals {

	public static void stringEquals () {
		String str1 = "Sejin Hwang";
		String str2 = "Sejin Hwang";
	
	
	if (str1 == str2) {
		System.out.println("Same Sejin");
	} else {
		System.out.println("Different Sejin");
	}
	
	if (str1.equals(str2)) {
		System.out.println("Same String Sejin");
	} else {
		System.out.println("Different Sting Sejin");
	}
	
	String str3 = new String ("Sejin Hwang");
	String str4 = new String ("Sejin Hwang");
	
	if(str3 == str4) {
		System.out.println("Same Sejin");
	} else {
		System.out.println("Different Sejin");
	}
	
	if (str3.equals(str4)) {
		System.out.println("Same String Sejin");
	} else {
		System.out.println("Different String Sejin");
	}
	}
	
}
