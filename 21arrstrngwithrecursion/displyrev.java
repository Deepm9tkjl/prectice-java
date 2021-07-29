import java.io.*;
import java.util.*;
import java.util.Scanner;
public class displyrev {
    
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
            int n=scn.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n; i++){
                arr[i]=scn.nextInt();
            }
            displayre(arr,0);
        }
        public static void displayre(int[] arr,int idx){
            if(idx==arr.length){
                return;
            }
            displayre(arr, idx+1);
            System.out.println(arr[idx]);
            
        }
    }
