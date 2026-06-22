import java.util.Scanner;
public class NumSquare{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of square");
        int n = sc.nextInt();

        for(int i=1 ;i<=n ;i++){
            System.out.println();
            for(int j=1 ;j<=n ;j++){
                System.out.print(j);
            }
        }
        sc.close();

    }
}