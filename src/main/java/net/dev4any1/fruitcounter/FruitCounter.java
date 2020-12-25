package net.dev4any1.fruitcounter;

public class FruitCounter {

	public static void main(String args[]) {
		System.out.println("new object created at" + System.currentTimeMillis());

		FruitCounter fc = new FruitCounter();
		Fruit[] f = fc.fruitCounter();
		System.out.println("total " + f.length + " " + fc.appleCounter(f));
	}

	public Fruit[] fruitCounter() {

		int n = (int) (Math.random() * 10);
		Fruit[] f = new Fruit[n];
		for (int i = 0; i < f.length; i++) {
			if (System.currentTimeMillis() % 2 == 0) {
				f[i] = new Apple();
			} else {
				f[i] = new Banana();
			}
		}
		return f;
	}

	public int appleCounter(Fruit[] f) {
		int result = 0;
		for (int i = 0; i < f.length; i++) {
			if (f[i].getColor().equals("red") && f[i].getForm().equals("circle")) {
				result = result + 1;
			}
		}
		return result;
	}
}