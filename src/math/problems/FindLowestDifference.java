package math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};

        int m = array1.length;
        int n = array2.length;

        System.out.println(findLowestDifference(array1, array2, m, n));

        }

    private static int findLowestDifference(int[] array1, int[] array2, int m, int n) {
        int result = 1;
        return result;
    }

}
