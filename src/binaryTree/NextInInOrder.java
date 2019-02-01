package binaryTree;
import java.util.*;
import static java.lang.System.out;
public class NextInInOrder {
    private Node curr ;
    private Node head;
    Node value;
    private List<StringBuilder> l ;
    private void add(int val){
        Node n = new Node(val);
        if(curr == null) {
            curr = n;
            if(head == null) head =curr;
        }
        else{
            if(val>= curr.val) curr.right =  n;
            else curr.left = n;
        }
    }
    private int findNextSuccessor(int val){
        if(findNextSuccessorUtil(head,val,false)) return value.val;

        return -1;
    }


    public static void main(String[] args){
        Node n = new Node(5);
        Node n3 = new Node(3);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        n.left = n2;
        n.right = n7;
        n2.left = n1;
        n2.right = n3;
        n7.left = n6;
        n7.right = n8;
        n8.right =n9;
        NextInInOrder niio = new NextInInOrder();
        niio.head = n;
        niio.l = new ArrayList<StringBuilder>();
        System.out.println(niio.print(niio.head,niio.l,0));
        System.out.println(niio.findNextSuccessor(7));

    }

    private static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

    private List<StringBuilder> print(Node head, List<StringBuilder> l , int level){
        if(head == null) return l;

        if(level>l.size()-1) l.add(new StringBuilder().append(head.val));

        else l.get(level).append(" " + head.val);

            print(head.left,l,level+1);
            print(head.right,l,level+1);

            return l;
    }
}
