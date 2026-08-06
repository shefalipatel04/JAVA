import java.util.Scanner;
public class condition01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x % 2 == 0){
            System.out.print("Even");
        }
        else{
            System.out.print("odd");
            sc.close();
        }
    }
}
   

