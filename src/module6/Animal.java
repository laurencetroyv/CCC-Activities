package module6;

public class Animal {
	String name;
}

class Dog extends Animal {

}

class Main {
	public static void main(String[] args) {
		Dog husky = new Dog();
		husky.name = "Aiko";
	}
}