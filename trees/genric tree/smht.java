import java.util.ArrayList;
import java.util.Stack;

//package genric tree;

public class smht {
   	
    public static class Node{
        int data;
        ArrayList<Node> children;
        Node(){

        }
        Node(int data){
            this.data=data;
            this.children=new ArrayList<>();


        }

    }
    public static Node construct(int [] data){
        Stack<Node> st=new Stack<>();
        Node root=null;
        for(int i=0; i<data.length; i++){
            if(data[i]==-1){

            }else{
                Node nn=new Node(data[i]);
                if(st.size()>0){
                    Node  par=st.peek();
                par.children.add(nn);
            
            }
            else{ root=nn;}
            st.push(nn);
            }
        }
        return root;
    }    
    public static void display(Node node){
        System.out.println(node.data +"->");
        for(int i=0;i<node.children.size();i++){
Node child=node.children.get(i);
display(child);

        }
    }

    //size off treee
public static int size(Node node){
    int ts=0;//total size
    for(int i=0; i<node.children.size();i++){
        Node child=node.children.get(i);
        int cfc=size(child);
        ts =ts+cfc;
    }
    return ts+1;
}
//max of tree
public static int max(Node node){
    int omax=Integer.MIN_VALUE;
    for(int i=0; i<node.children.size();i++){
        Node child=node.children.get(i);
        int  cfm=max(child);
        if(cfm>omax){
            omax=cfm;
        }
    }
return Math.max(node.data,omax);
}

public static int height(Node node){
    int mcht=-1;
    for(int i=0; i<node.children.size();i++){
        Node child =node.children.get(i);
        int htc=height(child);
        if(htc>mcht){
            mcht=htc;
        } 
    }
    return mcht+1;

}
 public static void treversals(Node node){
     System.out.println("node pre" + node.data);
     for(int i=0; i<node.children.size();i++){
         Node child=node.children.get(i);
         System.out.println("Edge pre" +node.data +"--"+child.data);
         treversals(child);
         System.out.println("Edge post" +node.data+"--"+ child.data);
     }
System.out.println("Node post" +node.data);
 }
 public static void main(String[] args) {
    int[]data = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};

    Node root = construct(data);
    int sz = size(root);
    System.out.println(sz);
    int ht = height(root);
    System.out.println(ht);   
    treversals(root);
}
}