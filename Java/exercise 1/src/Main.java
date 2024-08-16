import java.util.ArrayList;
import java.util.Scanner;

/*
    MAKE A FUNCTION THAT VERIFIES IF A VALOR IS PERFECT OR NOT. A VALOR IS CALLED PERFECT WHEN
    IT IS EQUAL THE SUM OF ITS DIVISORS EXCEPT ITSELF. EXAMPLE: 6 IS PERFECT BECAUSE 6 = 1 + 2 + 3
    THE FUNCTION MUST RETURN A BOOLEAN RESULT
* */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int res = 0;
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int userNum = read.nextInt();

        System.out.println(isPerfect(userNum));
    }

    static boolean isPerfect(int num) {
        if(num != 0){
            ArrayList<Integer> divisors = new ArrayList<Integer>();
            for(int n = 1; n < num; n++){
                if(num % n == 0){
                    divisors.add(n);
                }
            }

            divisors.forEach(it -> {
                res += it;
            });

            if(res == num){
                System.out.println(num + "is perfect? ");
                return true;
            }else{
                System.out.println(num + "is perfect? ");
                return false;
            }
        }else{
            throw new IllegalArgumentException("Zero can't be divided. Division by zero is impossible.");
        }
    }
}
