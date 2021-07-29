package recursion;
import java.io.*;
import java.util.Scanner;
import java.util.*;
public class PI{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        printi(n);

    }
    public static void printi(int n){
        if(n==0){
            return;
        }
         
        printi(n-1);
        System.out.println(n);    
        
    }
}