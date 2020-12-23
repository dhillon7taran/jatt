public class Arraysclass {
    public static void main(String[] args) {
        int Array[]={1,2,3,4};
        int sum=0;
        int max=Array[0];
        int min=Array[0];
        for (int temp: Array)
        {
            sum=sum+temp;

        }
        System.out.println("sum is "+ sum);
        System.out.println("average is" + sum/Array.length);
        for(int i=0;i<Array.length;i++)
        {
            if (max<Array[i])
            {
                max=Array[i];
            }
        }
        System.out.println("max value is"+max);
        for(int i=0;i<Array.length;i++)
        {
            if (min>Array[i])
            {
                min=Array[i];
            }
        }
        System.out.println("min value is"+min);
    }
}
