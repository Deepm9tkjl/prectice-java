
package recursion;
import java.io.*;
import java.util.Scanner;
import java.util.*;

public class powerlog{

    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int x=scn.nextInt();
    int n=scn.nextInt();
    int ans= powerFakeSmart( x,n);
    System.out.println(ans);
    }
    public static int powerFakeSmart(int x, int n){
        if(n == 0){
            return 1;
        }
        int xPowN = powerFakeSmart(x,n/2) * powerFakeSmart(x,n/2);
        if(n%2 == 1){
            xPowN *= x;
        }
        return xPowN;
    }}