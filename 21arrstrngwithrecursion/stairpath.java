import java.io.*;
import java.util.Scanner;
import java.util.*;

public class stairpath{

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<String>paths=getstairp(n);
        System.out.println(paths);
    }
    public static ArrayList<String> getstairp(int n){
     if(n==0){
         ArrayList<String>ba=new ArrayList<>();
         ba.add("");
         return ba;
     }   
     if(n<0){
         ArrayList<String>ba=new ArrayList<>();
         return ba;
     }
     ArrayList<String>pnm1=getstairp(n-1);
    
     ArrayList<String>pnm2=getstairp(n-2);
     
     ArrayList<String>pnm3=getstairp(n-3);
    
     ArrayList<String>myans=new ArrayList<>();
     //n to 0-> 1+n-1 to 0
     for(int i=0; i<pnm1.size(); i++){
         myans.add(1+pnm1.get(i));
     }
          //n to 0-> 2+n-2 to 0
          for(int i=0; i<pnm2.size(); i++){
            myans.add(2+pnm2.get(i));
        }
             //n to 0-> 1+n-3 to 0
     for(int i=0; i<pnm3.size(); i++){
        myans.add(3+pnm3.get(i));
    }
    return myans;
    }
    }