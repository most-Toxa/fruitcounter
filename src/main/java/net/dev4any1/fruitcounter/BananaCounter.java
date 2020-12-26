package net.dev4any1.fruitcounter;

public class BananaCounter extends Counter {

	
	public int getCount() {
		int result = 0;
		for (int i = 0; i < f.length; i++) {
			if (!isApple(f[i])) {
				result = result + 1;
			}
		}
		return result;


	
	}
}