import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;
public class getkpc {
    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
     public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    String str=scn.next();
    ArrayList<String>kpc=getk(str);
    System.out.println(kpc);    
     }
      public static ArrayList<String> getk(String str){
          if(str.length()==0){
              ArrayList<String>ba=new ArrayList<>();
              ba.add("");
              return ba;
          }
          char ch=str.charAt(0);
          String ros=str.substring(1);
          ArrayList<String>rans=getk(ros);
          ArrayList<String>myans=new ArrayList<>();
          String mycode=codes[ch-'0'];
          for(int i=0; i<mycode.length(); i++){
             
			for(int j=0; j<rans.size(); j++){
                  String code=mycode.charAt(i)+rans.get(j);
                  myans.add(code);
              }
          }
          return myans;
      }  
    }
    

