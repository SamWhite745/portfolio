
public class Runner {
	public static void main(String[] args) {
		chickensAndRabbits(35, 94);
	}
	
	public static void chickensAndRabbits(int heads, int legs) {
		System.out.println("heads: " + heads);
		System.out.println("legs: " + legs);
		int chickens = 2*heads - (legs/2);
		int rabbits = (legs/2) - heads;
		System.out.println("Number of chickens: " + chickens);
		System.out.println("Number of rabbits: " + rabbits);
	}
}
