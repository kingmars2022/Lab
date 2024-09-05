
public class Toaster extends Appliance {
	
	public Toaster(int power, String brand) {
		
		this.power = power;
		this.brand = brand;
		
	}
	@Override
	public String toString() {
		return "This is a Toaster. Power = " + power + "; Brand = " + brand + ".";
	}

}
