// Enter the number of rows: 5
// A 
// B B
// C C C
// D D D D
// E E E E E


//import java.lang.*;
import java.util.*; 

class Pattern16{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        char ch = 'A';
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch + " ");
            }
            System.out.println();
            ch++;
        }

        sc.close();
    }
}