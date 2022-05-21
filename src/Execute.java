import java.util.Arrays;

public class Execute {
    public static void main(String[] args) {
        int[] nums = { 9, 2, 4, 7, 3, 6, 10 };
//        HeapSort sort = new HeapSort();
//        sort.heapSort(nums);
//        QuickSort sort = new QuickSort();
//        sort.quickSort(nums);
        MergeSort sort = new MergeSort();
        sort.mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
