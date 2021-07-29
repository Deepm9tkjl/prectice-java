package recursion;
import java.io.*;
import java.util.Scanner;
import java.util.*;

public class PD {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        printd(n);
    }
    public static void printd(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printd(n-1);
    }
}
