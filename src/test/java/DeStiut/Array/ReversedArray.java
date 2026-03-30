package DeStiut.Array;

public class ReversedArray {
    public static void main(String[] args) {
        int a[]={3,1,4,2};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        int b[]=new int[a.length];
        int c=0;
        for(int i=a.length-1;i>=0;i--){
            b[c]=a[i];
            c++;
        }
        for(int s:b)
            System.out.print(s+" ");
    }
}
