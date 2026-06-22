import java.util.Scanner;
public class NumTriangle {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of triangle");
        int m = sc.nextInt();

        int n = 1;
        while(m>=n){
        for(int i=1 ;i<=n ;i++){
            System.out.print(i+" ");
        }
            System.out.println();  
        n++;
        }
        sc.close();
    }
}