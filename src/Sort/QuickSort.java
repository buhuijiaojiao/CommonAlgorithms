package Sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={4,9,6,5,2,0};
        quickSort(arr,0,arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void quickSort(int[] arr,int i,int j){
        int start=i;
        int end=j;
        if (start>end){
            return;
        }
        //起始索引和结束索引如果相等 则和基数交换
        while (start!=end){

            //end前移，找比基数小的数
            while (true){
                if (end<=start||arr[end]<arr[i]){
                    break;
                }
                end--;

            }
            //start后移，找比基数大的数
            while (true){
                if (start>=end||arr[start]>arr[i]){
                    break;
                }
                start++;
            }
            //现在比基数大和小的数都找到了，互换
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;

        }
        //start==end代表基数位置找到了
        //基数归位
        int temp=arr[start];
        arr[start]=arr[i];
        arr[i]=temp;

        quickSort(arr,i,start-1);
        quickSort(arr,start+1,j);

    }
}
