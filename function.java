import java.util.Scanner;
public class function {
    public static int  AddSum(int a , int b){
        int sum = a + b;
        return sum;
    }
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
         int b = sc.nextInt();

         int sum =AddSum(a,b);
         System.out.print( "sum of 2 number  is " + sum);
    }
    
}
