/*给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。

回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

例如，121 是回文，而 123 不是。*/
import java.util.Scanner;
public class huiwen {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        int nums=num;
        int x=0;
        do{
            x=x*10+num%10;
            num=num/10;
        }while(num>0);
        if(x==nums){
            System.out.println("ture");
        }else{
            System.out.println("false");
        }
    }
}
