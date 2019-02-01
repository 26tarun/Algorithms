package Sorting;

import java.util.Comparator;

public class HeapSort<E extends Comparable> {
    public Node<E> head;
    private void siftDown(Node<E> e){

    }

    private boolean push(Node<E> e, Node<E> curr){
        while(curr!=null){
            if(e.compareTo(curr)>0){
                if(curr.left!= null && curr.right!=null) {
                   if(e.compareTo(curr.left) >0 ){}

                }
            }
        }

        return false;
    }
    public static void main(String args[]){

    }
    static class Node<E extends Comparable> implements Comparable<Node<E>>{
        E val;
        Node<E> left;
        Node<E> right;

        Node(E val){
            this.val =val;
        }

        public int compareTo(Node<E> e){
            return this.val.compareTo(e.val);
        }
    }
}
