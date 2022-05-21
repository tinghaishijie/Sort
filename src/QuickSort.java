import java.util.Arrays;
import java.util.Random;

public class QuickSort {
	private static Random random = new Random();

	public static void main(String[] args) {
		int[] nums = { 9, 2, 4, 7, 3, 6, 10 };

		quickSort(nums);
		System.out.println(Arrays.toString(nums));
	}
 
	private static void quickSort(int[] nums) {
		quickSort(nums, 0, nums.length - 1);
	}

	private static void quickSort(int[] nums, int start, int end) {
		if (start >= end) {
			return;
		}
		int index = randomPartition(nums, start, end);
		quickSort(nums, start, index - 1);
		quickSort(nums, index + 1, end);
	}

	private static int randomPartition(int[] nums, int start, int end) {
		int index = random.nextInt(end - start + 1) + start;
		swap(nums, index, end);
		return partition(nums, start, end);
	}

	private static int partition(int[] nums, int start, int end) {
		int i = start;
		for (int j = start; j < end; j++) {
			if (nums[j] < nums[end]) {
				swap(nums, i, j);
				i++;
			}
		}
		swap(nums, i, end);
		return i;
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
