package GFG30days.Day17;

import java.util.*;

class Node {

    int data;
    int hd;
    Node left, right;

    public Node(int key) {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}

class Pair {
    int hd;
    Node node;

    Pair(int distance, Node n) {
        hd = distance;
        node = n;
    }
}

public class bottomViewOfBinaryTree {

    public ArrayList<Integer> bottomView(Node root) {

        ArrayList<Integer> ansList = new ArrayList<>();

        //if tree is empty
        if(root == null) return ansList;
        //create a mapping of horizontal distance with node data
        //but we need a sorted map, so we use treemap

        Map<Integer, Integer> map = new TreeMap<>();
        //declare the queue to store the horizontal distance and their nodes
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(0,root));
        while(q.size()>0){
            //remove peek element
            Pair p = q.remove();
            //find the horizontal distance and their corresponding node 
            int hozd = p.hd;
            root = p.node;
            //mapping the horizontal distance with root data
            map.put(hozd,root.data);
            //on left side, the horizonatal distance will decrease
            if(root.left!=null)  q.add(new Pair(hozd-1,root.left));
            //on right side, the horizontal distance will increase
            if(root.right!=null)  q.add(new Pair(hozd+1,root.right));
        }
        //add all node's value in answer list;
        for(int x:map.values()){
            ansList.add(x);
        }
        return ansList;
    }
    
}
