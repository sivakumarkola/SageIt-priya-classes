package trainig;
public class AnimalDriver {
	
	public static void main(String[] args) {
		
	
	Mammal dog = new Mammal();
	
	dog.setType("dog");
	
	dog.setSound("woof");
	
	System.out.println(dog);
	
	Mammal cat = new Mammal("meow", "cat");
	
	System.out.println("A " + cat.getType() + " goes " + cat.getSound());
	}
	}