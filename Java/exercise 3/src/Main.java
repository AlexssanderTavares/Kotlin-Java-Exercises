
//TIP
// Write a function that receives as parameter two values X and Z and calculates and returns X^z. Without using ready
//    functions or pow operators.

public class Main {
    public static void main(String[] args){
        System.out.println(potencyOf(5, 3));
        System.out.println(potencyOf(7, 8));
    }

    static int potencyOf(int x, int z){
        int count = 1;
        int res = x;
        do{
            res *= x;
            count++;
        }while(count < z);
        return res;
    }
}
