package recursion;
import java.io.*;
import java.util.Scanner;
import java.util.*;

public class odd {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        solve(n);

    }
    public static void solve(int n){
        if(n<=0){
            return;

        }
        if(n%2==0){
            solve(n-1);
        }else{
            solve(n-1);
            System.out.println(n);
        }
    }
}