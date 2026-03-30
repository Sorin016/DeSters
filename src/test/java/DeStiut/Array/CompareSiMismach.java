package DeStiut.Array;

import java.util.Arrays;

public class CompareSiMismach {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4};
        int b[]=new int[]{1,2,3};
        System.out.println(Arrays.compare(a,b));
        System.out.println(Arrays.mismatch(a,b));
    }
}
