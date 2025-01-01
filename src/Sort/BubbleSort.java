package Sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={2,5,1,0,8};
        //外层循环表示比较的轮数，假设数组长度为n,那么就需要比较n-1轮（这是因为最后一轮只剩一个数据）
        for (int i = 0; i < arr.length-1; i++) {
            //内层循环表示新一轮找到当前的最大值，（前一轮的数据不参与比较(必定为最大或最小)，直接排除此数据的索引）
            for (int j = 0; j < arr.length-1 -i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
