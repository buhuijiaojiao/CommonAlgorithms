package Sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= {8,5,6,2,7,5,1};
        //外层循环表示要选择的索引,最后一个索引无需选择，已经排序完成
        for (int i = 0; i < arr.length-1; i++) {
            //内层循环表示选择的数据与后面索引的元素进行依次比较，符合就交换
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=arr[i];
                }
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");

        }
    }
}
