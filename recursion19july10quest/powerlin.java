package recursion;
import java.io.*;
import java.util.Scanner;
import java.util.*;


public class powerlin {
    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int x=scn.nextInt();
    int n=scn.nextInt();

    System.out.println(powerLinear(x,n));
}

public static int powerLinear(int x, int n){
    if(n == 0){
        return 1;
    }
    int xPowNm1 = powerLinear(x,n-1);
    int xPowN = x * xPowNm1;
    return xPowN;
}}