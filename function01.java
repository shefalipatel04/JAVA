import java.util.Scanner;
public class function01 {
    public static int MultiplySum(int a , int b){
        int sum = a*b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = MultiplySum(a ,b);
        System.out.print("multiple of 2 number" + sum);
    }
    
}
