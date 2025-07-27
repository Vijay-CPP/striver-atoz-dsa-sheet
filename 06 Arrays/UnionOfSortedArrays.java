import java.util.*;

public class UnionOfSortedArrays {

}

class Solution1 {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        Set<Integer> set = new HashSet<>();
        
        for(int ele : a) set.add(ele);
        for(int ele : b) set.add(ele);
        
        ArrayList<Integer> res = new ArrayList<>();
        for(Integer val : set){
            res.add(val);
        }
        
        Collections.sort(res);
        return res;
    }
}

class Solution2 {
    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (arr1[i] == arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < n) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < m) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }
}

