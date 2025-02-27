public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int lettersToFive(String word, char character) {
		int countChar = 0;

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == character) {
				countChar++;
			}
			if (countChar == 5) {
				return i + 1;
			}
		}
		return -1;
	}

	public static int countLetter(String word, char character) {
		int countChar = 0;

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == character) {
				countChar++;
			}
		}
		return countChar;
	}

	public static int oddSum(int num, int num2) {
		int sum = 0;
		int start;
		int end;

		if (num < num2) {
			start = num;
			end = num2;
		} else {
			start = num2;
			end = num;
		}

		for (int i = start; i <= end; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		return sum;
	}
}
