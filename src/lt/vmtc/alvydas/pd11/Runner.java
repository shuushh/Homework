package lt.vmtc.alvydas.pd11;

import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
		Randomizer rand = new Randomizer();
		System.out.println(Arrays.toString(rand.generateNumbers(5)));

	}

}
