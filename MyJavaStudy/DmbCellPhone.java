package inheritance;

public class DmbCellPhone extends CellPhone {

	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("Channel No: "+channel + "starts ");
	}
	
	void changeChannelDmb (int channel) {
		this.channel = channel;
		System.out.println ("Channel No: "+channel + "changes ");
	}
	
	void turnOffDmb() {
		System.out.println("Turning off Dmb ");
	}
}
