package net.dev4any1.fruitcounter;

public abstract class Counter implements IFruitCounter {

	protected Fruit[] f;

	public Counter() {

		f = new Fruit[(int) (Math.random() * 10)];
		for (int i = 0; i < f.length; i++) {
			if (System.currentTimeMillis() % 2 == 0) {
				f[i] = new Apple();
			} else {
				f[i] = new Banana();
			}
		}

	}

	protected boolean isApple(Fruit f) {

		return f.getColor().equals("red") && f.getForm().equals("circle");

	}

	@Override
	public int getFruitSize() {

		return f.length;
	}

}