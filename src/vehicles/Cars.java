package vehicles;

public class Cars {
	String color;
	String model;
	boolean lights;


	public static void main(String[] args) {
		Cars c = new Cars("green",true, "Toyota");
		System.out.println("We have created a car!");

		c.printCarInformation();
	}

	public Cars(String c, boolean l, String model) {
		lights = l;
		color = c;
		this.model = model;
	}

	public void printCarInformation() {
	    String state = "";
	    if(lights) {
	        state = "on";
	    } else {
	        state = "off";
	    }
	    System.out.println("This car is " + color + " and lights are " + state + "the model is " + model);
	}
}