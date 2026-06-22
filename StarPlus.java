import java.util.Scanner;
public class StarPlus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int m = sc.nextInt();

        if(m % 2 == 0){
            System.out.print("Enter odd number");
            sc.close();
            return;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if(i == m/2 || j == m/2){
                    System.out.print("* ");
                }else{
                    System.out.print(". ");

                }
            }
            System.out.println();
        }
        sc.close();
    }
}