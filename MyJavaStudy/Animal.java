package inheritance;

//추상메소드를 사용했으므로 무조건 추상 클래스임. 
public abstract class Animal {

	public String kind;
	
	public void breathe() {
		System.out.println("Breathing");
	}
	
//	추상매소드 선언
//	상속받는 클래스에서 반드시 구현해야 하는 메소드  
	public abstract void sound();
	
}
