import java.util.Scanner;
public class AlphaNumericTriangle {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of triangle");
        int m = sc.nextInt();

        int n = 1;
        while(m>=n){
        for(int i=1 ;i<=n ;i++){
            if(n%2!=0){
            System.out.print(i+" ");
            }else{
            System.out.print((char)(64+i)+" ");
            }
        }
            System.out.println();  
        n++;
        }
        sc.close();

    }
}