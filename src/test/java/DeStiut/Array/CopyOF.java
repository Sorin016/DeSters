package DeStiut.Array;

import java.util.Arrays;

public class CopyOF {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5,6};
        int b[]=Arrays.copyOf(a,a.length);
        int c[]=Arrays.copyOfRange(a,0,a.length);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }
}
