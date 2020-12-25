package net.dev4any1.fruitcounter;

public class App {
	public static void main(String args[]) {
		System.out.println("new object created at" + System.currentTimeMillis());

		FruitCounter fc = new FruitCounter();
        
		
		System.out.println("total: " + fc.getFruitCount() + "; apples: "+ fc.appleCounter());
	}
}
