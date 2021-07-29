import java.io.*;
import java.util.*;
import java.util.Scanner;
public class getanybase {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int b=scn.nextInt();
        System.out.println(getanyb(n,b));

    }
    public static  int getanyb(int n, int b){
        int rv=0,pow=1;
        while(n>0){
            int rem=n%10;
            rv= rv+(rem*pow);
            pow=pow*10;
            n=n/10;
        }
        return rv;
    }
    
}
