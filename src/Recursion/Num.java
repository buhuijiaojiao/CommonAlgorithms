package Recursion;

public class Num {
    public static void main(String[] args) {

        System.out.println(getSum(100));
        System.out.println(getNum(5));
    }
    public static int getSum(int number){
        if (number==1){
            return 1;
        }
        return number+getSum(number-1);
    }
    public static int getNum(int number){
        if (number==1){
            return 1;
        }
        return number*getNum(number-1);
    }
}
