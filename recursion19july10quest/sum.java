package recursion;
import java.io.*;
import java.util.*;
public class sum {
    public static void main(String[] args){
        System.out.println(sums(7));
    }
    public static int sums(int num){
        if(num==0){
            return 0;
        }
        int rres=sums(num-1);
        return rres+num;
    }
    
}
