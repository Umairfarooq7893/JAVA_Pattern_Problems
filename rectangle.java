import java.util.Scanner;
public class rectangle {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter breadth");
        int m = sc.nextInt();
        System.out.println("length");
        int n = sc.nextInt();

        for(int i=0 ;i<=m ;i++){
            System.out.println();
            for(int j=0 ;j<=n ;j++){
                System.out.print("*");
            }
        }
    }
}


