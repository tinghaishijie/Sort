
public class BubbleSort {

	public static int[] BubbleSort(int arr[]){
		for(int i=0;i<arr.length-1;i++){//���ѭ��������������
			for(int j=0;j<arr.length-1-i;j++){//�ڲ�ѭ������ÿһ��������ٴ�
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		} 
		return arr;
	}
	
	public static void main(String[] args) {
		int[] a = {3,4,2,6,7,1};
		BubbleSort(a);
		for(int i:a) System.out.print(i);
	}
}
