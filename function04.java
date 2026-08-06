import java.util.Scanner;
public class function04 {
    public static boolean IsEven(int n){
        if(n%2==0){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        if(IsEven(n)){
            System.out.println("Even number");
        } else{
            System.out.println("Odd number");
            sc.close();
        }

    }
    
}
