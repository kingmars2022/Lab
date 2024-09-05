
public abstract class Appliance {
	
	protected int power;
    protected String brand;
    
    public void turnOn() {
    	
    	System.out.println("The Appliance is working.");
    }
    
    public String toString() {
    	return "Power = " + power + ";" + "Brand = " + brand +".";
    }

}
