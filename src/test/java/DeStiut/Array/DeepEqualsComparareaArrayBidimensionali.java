package DeStiut.Array;

import java.util.Arrays;

public class DeepEqualsComparareaArrayBidimensionali {
    public static void main(String[] args) {
        int a[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int b[][]=new int[][]{{1,2,3},{4,5,6},{7,8,8}};
        System.out.println(Arrays.deepEquals(a,b));
    }
}
