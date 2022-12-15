import java.util.Arrays;

public class MergedArrays {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 4};
        int []arr2={5,6,7,8};

        int[] merged = new int [arr1.length + arr2.length];  // 8

        int i = 0;
        for (int each : arr1) {
            merged[i++] = each;
        }

        for (int each : arr2) {
            merged[i++] = each;
        }

        System.out.println(Arrays.toString(merged));

    }
    
}
