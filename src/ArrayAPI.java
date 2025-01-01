import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayAPI {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 10));
        System.out.println(Arrays.binarySearch(arr, 20));
        //-最大索引-1，这么设计是因为当传入数组长度为0时无法判断是查到了0索引还是没查到
        System.out.println(Arrays.toString(Arrays.copyOf(arr, 11)));
        //newlenth是多少就拷贝多少
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,5,8)));
//        //拷贝5-8索引的数据，包头不包尾
//        Arrays.fill(arr,100);
//        System.out.println(Arrays.toString(arr));
        //覆盖

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //排序基本数据类型只能升序
        //默认升序排列
        //若想降序要把基本数据类型数组变成其对应包装类的数组
        Integer[] arrIntger=new Integer[11];
        for (int i = 0; i < arr.length; i++) {
            arrIntger[i]=Integer.valueOf(arr[i]);
        }
        //插入排序加二分查找确定每个无序数据在有序数据中的插入点
        Arrays.sort(arrIntger,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1,Integer o2) {
                return o2-o1;  //o1为遍历出来无序的数据，o2二分查找插入点的可能插入点数据
                            //返回结果为非负数则拿着无序数据和o2后面数据比较，为负数则拿着无序数据和o2前面数据比较
                            //0, o1-o2表示为升序,o2-o1表示为降序
            }
        });
        //lambda表达式 简化函数式接口的实现类对象的写法 直接实现了需要的方法省略繁琐创建对象的流程
        Arrays.sort(arrIntger,(Integer o1,Integer o2)->{
            return o1-o2;
        });
        System.out.println(Arrays.toString(arrIntger));
    }
}
