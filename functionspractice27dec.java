public class functionspractice27dec {
    public static void main(String[] args) {

        int A[] = {1, 2, 3, 4};
        System.out.println(sum(A));
    }
    public static int sum(int A[])
    {
        int sum2=0;
        for (int i = 0; i <4 ; i++) {
          sum2=sum2+A[i] ;

        }
        return sum2;
    }
}
