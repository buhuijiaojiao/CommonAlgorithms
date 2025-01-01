package Lambda.girl;

import java.util.Arrays;
import java.util.Comparator;

public class GirlSort {
    public static void main(String[] args) {
        Girl g1=new Girl("liuyifei",18,1.83);
        Girl g2=new Girl("shejie",18,1.83);
        Girl g3=new Girl("yedao",18,1.83);
        Girl g4=new Girl("liya",18,1.83);
        Girl[] girls={g1,g2,g3,g4};
        Arrays.sort(girls, (o1,o2)-> {
                /*if (o1.getAge()!=o2.getAge()){
                    temp= o1.getAge()-o2.getAge();
                }else if (o1.getHeight()!=o2.getHeight()){
                    temp= o1.getHeight()-o2.getHeight();
                }else{
                    temp= o1.getName().length()-o2.getName().length();
                }*/
                double temp=o1.getAge()-o2.getAge();
                temp=temp==0?o1.getHeight()-o2.getHeight():temp;
                temp=temp==0?o1.getName().compareTo(o2.getName()):temp;
                if (temp>0){
                    return 1;
                }else if (temp<0){
                    return -1;
                }else {
                    return 0;
                }

        });
        System.out.println(Arrays.toString(girls));
    }
}
