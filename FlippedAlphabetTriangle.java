import java.util.Scanner;
public class FlippedAlphabetTriangle {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of triangle");
        int n = sc.nextInt();

        while(n>0){
        for(int i=1 ;i<=n ;i++){
            System.out.print((char)(96+i)+" "); 
        }
            System.out.println();  
        n--;
        }
        sc.close();
    }
}