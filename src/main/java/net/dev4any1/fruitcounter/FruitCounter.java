package net.dev4any1.fruitcounter;

public class FruitCounter implements IFruitCounter {

	private Fruit[] f;
	
	public FruitCounter() {

	    f = new Fruit[(int) (Math.random() * 10)];
		for (int i = 0; i < f.length; i++) {
			if (System.currentTimeMillis() % 2 == 0) {
				f[i] = new Apple();
			} else {
				f[i] = new Banana();
			}
		}
		
	}

	public int appleCounter() {
		int result = 0;
		for (int i = 0; i < f.length; i++) {
			if (isApple(f[i])) {
				result = result + 1;
			}
		}
		return result;
	}

	private boolean isApple(Fruit f) {

		return f.getColor().equals("red") && f.getForm().equals("circle");

	}

	@Override
	public int getFruitCount() {
		
		return f.length;
	}
}