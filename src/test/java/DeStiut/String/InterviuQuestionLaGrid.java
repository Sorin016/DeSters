package DeStiut.String;

public class InterviuQuestionLaGrid {
    public static void main(String[] args) {
        String s="123456";
        String a=s.substring(0,3);
        String b=s.substring(3,s.length());
        char vv[]=a.toCharArray();
        char nn[]=b.toCharArray();
        int sumA=0,sumB=0;
        for(int i=0;i<vv.length;i++){
            sumA+=Integer.parseInt(String.valueOf(vv[i]));
        }
        for(int i=0;i<nn.length;i++){
            sumB+=Integer.parseInt(String.valueOf(nn[i]));
        }
        System.out.println(sumA);
        System.out.println(sumB);
        if(sumB==sumA)
            System.out.println("drept");
    }
}
