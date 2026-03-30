package DeStiut.Array;

public class DublareaCifrelor {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,1,2,3,4,5,6};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }

}
