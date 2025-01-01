package Find;

import java.util.ArrayList;

public class BasicSearch {
    public static void main(String[] args) {
        int[] arr={121,127,147,7,103,23,7,79,81};
        System.out.println(numberSearch(7,arr));
        System.out.println(numberSearches(7,arr));
    }
    //不考虑元素重复
    public static int numberSearch(int number,int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (number==arr[i]){
                return i;
            }
        }
        return -1;
    }
    //考虑元素重复
    public static ArrayList<Integer> numberSearches(int number,int[] arr){
        ArrayList<Integer> indexArr=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (number==arr[i]){
                indexArr.add(i);
            }

        }
        return indexArr;
    }

}
