import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }

        int temp = 0;
        for (int i=0;i<a.length;i++) {
            for (int j=i+1;j<a[i].length;j++) {
                int cc[]= new int[]{a[i][j]};
                    for(int as=0;as<cc.length;as++){
                        for(int sd=as+1;sd<cc.length;sd++){
                            if(cc[as]>cc[sd]){
                                temp=cc[as];
                                cc[as]=cc[sd];
                                cc[sd]=temp;
                            }
                        }
                        System.out.println(cc[as]);
                    }
                }
            }
        }


}

