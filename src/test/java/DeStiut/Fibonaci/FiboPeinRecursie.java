package DeStiut.Fibonaci;

public class FiboPeinRecursie {
    public static void main(String[] args) {
        System.out.print(0+" ");
        for(int i=0;i<10;i++) {
            System.out.print(fibo(i) + " ");
        }
    }
    static int fibo(int n){
        if(n<=1)
            return 1;
        return fibo(n-1)+fibo(n-2);
    }
}
