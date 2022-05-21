public class HeapSort {
    public void heapSort(int[] nums) {
        int len = nums.length - 1;
        buildHeap(nums, len);
        while (len > 0) {
            swap(nums, 0, len);
            len--;
            heapify(nums, len, 0);
        }
    }

    private void buildHeap(int[] nums, int len) {
        for (int i = len / 2; i >= 0; i--) {
            heapify(nums, len, i);
        }
    }

    private void heapify(int[] nums, int len, int index) {
        while (true) {
            int max = index;
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            if (left <= len && nums[left] > nums[max]) {
                max = left;
            }
            if (right <= len && nums[right] > nums[max]) {
                max = right;
            }
            if (max == index) {
                break;
            }
            swap(nums, max, index);
            index = max;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
