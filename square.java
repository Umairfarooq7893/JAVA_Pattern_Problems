import java.util.Scanner;
public class square {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter order");
        int m = sc.nextInt();

        for(int i=0 ;i<m ;i++){
            System.out.println();
            for(int j=0 ;j<m ;j++){
                System.out.print("*");
            }
        }
    sc.close();

    }
}
