package DeStiut.Array;

public class BubbleSort {
    public static void main(String[] args) {
        int a[]={8,3,6,4,7,9,4,2,6};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int c:a)
            System.out.print(c+" ");
    }
}
