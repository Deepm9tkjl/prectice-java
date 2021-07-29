import java.io.*;
import java.util.*;
import java.util.Scanner;
public class find{
        public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new  int[n];
        for (int idx=0;idx<arr.length; idx++){
            arr[idx]=scn.nextInt();
        }
        int x=scn.nextInt();
        int res=find(arr,x);
        System.out.println(res);
    }
    public static int find(int arr[],int x){
        for( int idx=0; idx<arr.length; idx++){
            if(arr[idx]==x){
                return idx;
            }
        }
        return -1;
    }
        }