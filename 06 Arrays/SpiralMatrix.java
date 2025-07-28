import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        Solution solution = new Solution();
        List<Integer> result = solution.spiralOrder(matrix);

        System.out.println("Spiral order of the matrix:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0;
        int left = 0;
        int down = rows - 1;
        int right = cols - 1;

        int dir = 0;

        List<Integer> res = new ArrayList<>();

        while (top <= down && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    res.add(matrix[top][i]);
                }
                top++;
            } else if (dir == 1) {
                for (int i = top; i <= down; i++) {
                    res.add(matrix[i][right]);
                }
                right--;
            } else if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[down][i]);
                }
                down--;
            } else {
                for (int i = down; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }

            dir = (dir + 1) % 4;
        }

        return res;
    }
}