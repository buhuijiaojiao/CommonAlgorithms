package Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo {
    public static void main(String[] args) {
        String[] str={"a","aaaa","aaa","aaaaaaa"};
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();  //实现类对象返回一种规则体现到排序方式就是 按照这个规则来排序
            }
        });
        System.out.println(Arrays.toString(str));
        Arrays.sort(str,((o1, o2) -> o1.length()-o2.length() ));
        System.out.println(Arrays.toString(str));
    }
}
