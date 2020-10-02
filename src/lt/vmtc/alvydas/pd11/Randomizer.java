package lt.vmtc.alvydas.pd11;

public class Randomizer {
	public int[] numbers;

	public int[] generateNumbers(int arraySize) {
		this.numbers = new int[arraySize];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100);
		}
		return numbers;
	}
}
