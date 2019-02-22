package javaStudy;

public class Main {

	public static void main(String[] args) {
		
		test();
		dog();
		dog2();
		testEncapsulation();
	}
	
	public static void test () {
		MountainBike mb = new MountainBike (3, 100, 25);
		System.out.println(mb.toString());
	}
	
	public static void dog () {
		System.out.println();
		Dog tuffy = new Dog ("tuffy", "papillon", 5, "white");
		System.out.println(tuffy.toString());
	}
	
	public static void dog2 () {
		System.out.println();
		Dog2 ob1 = new Dog2 ("Bravo", 4);
		Dog2 ob2 = new Dog2 ("Oliver", 5);
		
		System.out.println(ob1.dogName+ ", "+ ob1.dogAge);
		System.out.println(ob2.dogName + ", "+ ob2.dogAge);
	}
	
	public static void testEncapsulation() {
		System.out.println();
		
		Encapsulate obj = new Encapsulate();
		
		obj.setName("Harsh");
		obj.setAge(19);
		obj.setRoll(51);
		
		System.out.println("Geek's name: "+ obj.getName());
		System.out.println("Geek's age : "+ obj.getAge());
		System.out.println("Geek's roll: "+ obj.getRoll());
		
	}

}
