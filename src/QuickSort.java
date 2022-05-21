import java.util.Arrays;
import java.util.Random;

public class QuickSort {
	private Random random = new Random();
 
	public void quickSort(int[] nums) {
		quickSort(nums, 0, nums.length - 1);
	}

	private void quickSort(int[] nums, int start, int end) {
		if (start >= end) {
			return;
		}
		int index = randomPartition(nums, start, end);
		quickSort(nums, start, index - 1);
		quickSort(nums, index + 1, end);
	}

	private int randomPartition(int[] nums, int start, int end) {
		int index = random.nextInt(end - start + 1) + start;
		swap(nums, index, end);
		return partition(nums, start, end);
	}

	private int partition(int[] nums, int start, int end) {
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

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
