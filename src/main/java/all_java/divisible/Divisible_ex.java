package all_java.divisible;

public class Divisible_ex {
    public static void main(String[] args) {
        int num = 9;
        boolean divisibleBy7 = false;
        while ( ! divisibleBy7){
            System.out.print(num);//987
            if (num % 7 ==0)
                divisibleBy7 = true;
            --num;
        }
    }
}
