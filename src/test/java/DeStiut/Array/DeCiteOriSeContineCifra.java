package DeStiut.Array;

public class DeCiteOriSeContineCifra {
    public static void main(String[] args) {
            int a[]={6,3,5,4,2,3,3,5};
            int count=0;
            for(int i=0;i<a.length;i++){
                if(a[i]==5){
                    count++;
                }
            }
        System.out.println(count);
    }
}
