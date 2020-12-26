package net.dev4any1.fruitcounter;

public class App {
	public static void main(String args[]) {
		System.out.println("new object created at" + System.currentTimeMillis());

		IFruitCounter ac = new AppleCounter();
        IFruitCounter bc = new BananaCounter();
		
		System.out.println("total: " + ac.getFruitSize() + "; apples: "+ ac.getCount());
		System.out.println("total: " + bc.getFruitSize() + "; bananas: "+ bc.getCount());
	}
}
