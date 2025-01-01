package Find;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,7,47,87,103,123,227,379,481};
        System.out.println(binarySearch(481,arr));
    }
    public static int binarySearch(int number,int[] arr){
        int max=arr.length-1;
        int min=0;
        while (true){
            if (max<min){
                return -1;
            }
            int mid=(max+min)/2;
            if (number>arr[mid]){
                min=mid+1;
            }else if (number==arr[mid]){
                return mid;
            }else if(number<arr[mid]){
                max=mid-1;
            }
        }

    }
}
