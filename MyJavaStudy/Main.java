package inheritance;

public class Main {

	public static void main(String[] args) {
		
//		dmbCellPhoneExample();
//		studentExample() ;
//		computerExample ();
//		supersonicAirplaneExample ();
//		childExample ();
		phoneExample ();
		animalExample ();

	}
	
	public static void dmbCellPhoneExample () {
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone ("iPhone ", "While ", 10);
		
	
	
	System.out.println ("Model: "+ dmbCellPhone.model);
	System.out.println ("Color: "+ dmbCellPhone.color);
	
	System.out.println ("Channel: "+ dmbCellPhone.channel);
	
	dmbCellPhone.powerOn();
	dmbCellPhone.bell();
	dmbCellPhone.sendVoice ("Hello");
	dmbCellPhone.receiveVoice("Hi, its Sejin");
	dmbCellPhone.sendVoice("Oh Hi! ");
	dmbCellPhone.hangUp();
	
	dmbCellPhone.turnOnDmb();
	dmbCellPhone.changeChannelDmb (12);
	dmbCellPhone.turnOffDmb();

	}
	
	
	public static void studentExample () {
		
		Student student = new Student ("Sejin Hwang", "123-456", 1);
		
		System.out.println("name: "+ student.name);
		System.out.println("ssn: "+ student.ssn);
		System.out.println("Student No: "+ student.studentNo);
		
	}
	
	public static void computerExample () {
		
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("Area Circle : "+ calculator.areaCircle(r));
		
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("Area Circle : "+ computer.areaCircle(r));
		System.out.println("Area Circle : "+ computer.superAreaCircle(r));
		
		
	}
	
	
	public static void supersonicAirplaneExample () {
		
		SupersonicAirplane sa = new SupersonicAirplane ();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
	
	
	 public static void childExample () {
		 
		 Child child = new Child();
		 
		 Parent parent = child;
		 parent.method1();
		 parent.method2();
//		 parent.method3(); (x)
	 }
	 
	 public static void phoneExample () {
//		 Phone phone = new Phone();
		 
		 SmartPhone smartPhone = new SmartPhone ("Sejin");
		 
		 smartPhone.turnOn();
		 smartPhone.internetSearch();
		 smartPhone.turnOff();
	 }
	 
	 
	 public static void animalExample () {
		 
		 Dog dog = new Dog();
		 Cat cat = new Cat();
		 dog.sound();
		 dog.breathe();
		 cat.sound();
		 System.out.println("------------");
		 
		 Animal animal = null;
		 animal = new Dog();
		 animal.sound();
		 animal = new Cat();
		 animal.sound();
		 
		 System.out.println("------------");
		 
		 animalSound(new Dog());
		 animalSound(new Cat());
	 }
	 
		 public static void animalSound(Animal animal) {
		 animal.sound();
	 }
}
