package Sort;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr={10,40,89,10,1,58,100,92,10,5,3,2};
        int startIndex=-1;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]<=arr[i+1]){
                //若有序跳至下一次循环
                continue;
            }
            //先找到有序后面无序的第一个索引
            startIndex=i+1;

            while (startIndex>0&&arr[startIndex]<arr[startIndex-1]){
                //如果比有序的最后一个数据小，则进行数据交换
                int temp=arr[startIndex];
                arr[startIndex]=arr[startIndex-1];
                arr[startIndex-1]=temp;
                startIndex--;  //依次向前比较，较小就交换
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
