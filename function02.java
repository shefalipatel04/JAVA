import java.util.Scanner;
public class function02 {
    public static void Factorial(int n){
        int fac = 1;
        for(int i=n ; i>=1 ; i--){
            fac = fac*i;  
        }
            System.out.println(fac);
            
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Factorial(n);


    }
    
}
