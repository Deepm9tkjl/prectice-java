//package genric;
import java.util.*;
import java.util.ArrayList;
import java.util.Stack;

public class mirror {
    public static class Node {
        int data;
        ArrayList < Node > children;

        Node() {

        }

        Node(int data) {
            this.data = data;
            this.children = new ArrayList < > ();
        }
    }
    public static Node construct(int[] data) {
        Stack < Node > st = new Stack < > ();
        Node root = null;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == -1) {
                st.pop();
            } else {
                Node nn = new Node(data[i]);

                if (st.size() > 0) {
                    Node par = st.peek();
                    par.children.add(nn);
                } else {
                    root = nn;
                }

                st.push(nn);
            }
        }

        return root;
    }
//mirror
public static void mirror(Node node){
    //fatch on  each child's family

for(int i=0; i< node.children.size();i++){

    Node child=node.children.get(i);
    mirror(child);
}
// self work-> revers node's children arraylist
int lo=0;
 int hi=node.children.size()-1;
while(lo<hi){
    Node lon=node.children.get(lo);
    Node hin=node.children.get(hi);
    node.children.set(lo,hin);
    node.children.set(hi,lon);
    lo++;
    hi--;
}



}
public static void main(String[] args) {
    int[]data = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};

    Node root = construct(data);
    mirror(root);
    //input can be managed
}
}