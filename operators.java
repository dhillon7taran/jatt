import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        int num1,num2;
        System.out.println("enter integer number 1");
        Scanner i=new Scanner(System.in);
        num1=i.nextInt();
       System.out.println("enter number 2 now");
        Scanner j=new Scanner(System.in);
        num2=j.nextInt();
        int sum=num1+num2;
        System.out.println("sum of num1 & num2 is" +(num1+num2));
        String Str1,Str2;
        System.out.println("enter my char");
        Scanner k=new Scanner(System.in);
       Str1=k.nextLine();
        System.out.println("enter your char");
        Scanner m=new Scanner(System.in);
        Str2=m.nextLine();
        System.out.println("sum of two strings"+Str1+Str2);
        System.out.println(num1%num2);
        System.out.println(num1>num2);
        System.out.println((num1>=num2)?num1:num2);






    }
}
