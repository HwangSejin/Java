package inheritance;

public class SupersonicAirplane extends Airplane {

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("SuperSonic Mode");
		}else {
			
			super.fly();
			System.out.println(super.flyStatus);
			
			super.flyStatus = "Flying";
			System.out.println(super.flyStatus);
			
		}
		
		
	}

}
