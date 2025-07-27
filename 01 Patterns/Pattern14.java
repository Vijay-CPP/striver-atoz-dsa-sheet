// Enter the number of rows: 5
// A 
// A B 
// A B C 
// A B C D 
// A B C D E 

//import java.lang.*;
import java.util.*; 

class Pattern14{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for(int i=1; i<=rows; i++){
            char ch = 'A';
            for(int j=1; j<=i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

        sc.close();
    }
}