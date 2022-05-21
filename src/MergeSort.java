public class MergeSort {
    int[] temp;

    public void mergeSort(int[] nums) {
        int len = nums.length;
        temp = new int[len];
        mergeSort(nums, 0, len - 1);
    }

    private void mergeSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);
        merge(nums, start, mid, mid + 1, end);
    }

    private void merge(int[] nums, int leftStart, int leftEnd, int rightStart, int rightEnd) {
        int index = 0;
        int numsStart = leftStart;
        while (leftStart <= leftEnd && rightStart <= rightEnd) {
            if (nums[leftStart] <= nums[rightStart]) {
                temp[index++] = nums[leftStart++];
            } else {
                temp[index++] = nums[rightStart++];
            }
        }

        // 处理剩余的数组
        int start = leftStart;
        int end = leftEnd;
        if (rightStart <= rightEnd) {
            start = rightStart;
            end = rightEnd;
        }
        while (start <= end) {
            temp[index++] = nums[start++];
        }

        // 赋值回原数组
        for (int i = 0; i < index; i++) {
            nums[numsStart + i] = temp[i];
        }
    }
}
