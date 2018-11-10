import java.util.Arrays;

public class mostFrequentLargestNumbers {
	public static void main(String[] args) {
		int[] input = new int[]{2, 8, 4, 6, 8, 5, 8, 4};
		System.out.println(  Arrays.toString(sorting(input)) );
		System.out.println( mostFrequentLargestNumber( sorting(input) ) );

	}

	public static int[] sorting(int[] input) {
		int[] arrangedArr = input.clone();
		Arrays.sort(arrangedArr);
		return arrangedArr;
	}

	public static String mostFrequentLargestNumber(int[] input) {
		int largestNumber = 0;
		int largestNumberCount = 0;
		int largestNumberCandidate = 0;
		int largestNumberCandidateCount = 0;

		for (int number : input) {
			if (largestNumber == 0) {
				largestNumber = number;
				largestNumberCount = 1;
			} else if (number != largestNumber) {

				if (largestNumberCandidateCount > largestNumberCount) {
					largestNumber = largestNumberCandidate;
					largestNumberCount = largestNumberCandidateCount;
					largestNumberCandidateCount = 0;
					largestNumberCandidate = 0;
				}

				largestNumberCandidate = number;
				largestNumberCandidateCount = 1;
			} else if (number == largestNumber) {
				largestNumberCount++;
			}

		}

		return "" + largestNumber;

	}
}