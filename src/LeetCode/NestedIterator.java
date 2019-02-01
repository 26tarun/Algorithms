package LeetCode;

import java.util.*;
import static java.util.Arrays.*;

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 */
   interface NestedInteger {

      // @return true if this NestedInteger holds a single integer, rather than a nested list.
      public boolean isInteger();

     // @return the single integer that this NestedInteger holds, if it holds a single integer
      // Return null if this NestedInteger holds a nested list
      public Integer getInteger();

      // @return the nested list that this NestedInteger holds, if it holds a nested list
   // Return null if this NestedInteger holds a single integer
      public List<NestedInteger> getList();
  }

public class NestedIterator implements Iterator<Integer> {
    private Stack<Iterator<NestedInteger>> stack;
    private Iterator<NestedInteger> itr;

    public NestedIterator(List<NestedInteger> nestedList) {
        stack = new Stack();
        itr= nestedList.iterator();
        System.out.println("List " + nestedList.toString());
    }

    @Override
    public Integer next() {
        Integer val =-1;
        NestedInteger curr =null;
        //current iterator has values
        if(itr.hasNext()){
            //find level of nesting
            while(curr==null || (curr.getList()!=null)){

                if(curr!=null) itr = curr.getList().iterator();
                curr = itr.next();
            }
            if(curr!=null) val = curr.getInteger();
        }

            System.out.println("Outputting " + val);
        return val;
    }

    @Override
    public boolean hasNext() {
        while(!itr.hasNext()){
            if(stack.size()>0) itr = stack.pop();
            else break;
        }

        if(itr!=null) return itr.hasNext();

        return false;
    }

    public static void main(String args[]){

        //List<NestedInteger> li = asList(asList());
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
