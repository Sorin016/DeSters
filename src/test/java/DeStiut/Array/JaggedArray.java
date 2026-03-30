package DeStiut.Array;

import java.util.Arrays;

public class JaggedArray {
    public static void main(String[] args) {
        int a[][]=new int[3][];
        a[0]=new int[3];
        a[1]=new int[4];
        a[2]=new int[3];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=(int) (Math.random()*101);
            }
        }
        for(int[] ss:a){
            for(int kk:ss)
                System.out.print(kk+" ");
            System.out.println();
        }
        System.out.println("*********");
        System.out.print(Arrays.deepToString(a)+" ");
    }
}
