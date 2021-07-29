package recursion;
import java.io.*;
import java.util.Scanner;
import java.util.*;

public class PDI {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        printdi(n);
    }
    public static void printdi(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printdi(n-1);
        System.out.println(n);
    }
}
