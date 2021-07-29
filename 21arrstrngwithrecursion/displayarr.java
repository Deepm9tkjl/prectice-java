import java.io.*;
import java.util.*;
import java.util.Scanner;
public class displayarr{
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
            int n=scn.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n; i++){
                arr[i]=scn.nextInt();
            }
            displaya(arr,0);
        }
        public static void displaya(int[] arr,int idx){
            if(idx==arr.length){
                return;
            }
            System.out.println(arr[idx]);
            displaya(arr, idx+1);
        }
    }
