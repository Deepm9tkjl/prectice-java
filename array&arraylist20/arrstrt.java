
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class arrstrt {
    

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new  int[n];
        arr[0]=10;
        
        arr[2]=10;
        
        arr[3]=10;
        
        arr[4]=14;
        for(int idx=0; idx<arr.length;idx++){
            System.out.println(arr[idx]);
        }
        for(int val : arr){
            System.out.println(val);

        }
        System.out.println(arr.length);
    }
    }