
public class BubbleSort {
    public int[] bubbleSort(int[] nums) {
        //外层循环控制排序趟数
        for (int i = 0; i < nums.length - 1; i++) {
            //内层循环控制每一趟排序多少次
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}
