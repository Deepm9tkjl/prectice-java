import java.io.*;
import java.util.*;
import java.util.Scanner;
public class maxarr {
    
    public static void main(String[] args) throws Exception{
        Scanner scn =new Scanner(System.in);
            int n=scn.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n; i++){
                arr[i]=scn.nextInt();
            }
            int max= maxofArray(arr,0);
            System.out.println(max);

        }
    public static int maxofArray(int[] arr,int idx){
        if(idx==arr.length-1);
        return arr[idx];
    }
    int smax=maxofArray(arr, idx+1);
     int omax=Math.max(smax,arr[idx]);
    return omax;
}