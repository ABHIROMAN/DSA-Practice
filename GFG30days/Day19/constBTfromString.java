package GFG30days.Day19;

import java.util.*;

class Node
{
    int data;
    Node left;
    Node right;
    
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}

class Pair{

    Node node;

    int state;

    Pair( Node node , int state){

        this.node = node;
        this.state = state;
    }

}

public class constBTfromString {
    
    public static Node treeFromString(String s) {
        
        if( s.length() == 0 ){

            return null;

        }

        Stack<Pair> stack  = new Stack<>();

        int index=0;

        String number="";

        while( index<s.length() && (s.charAt(index)!='(' && s.charAt(index)!= ')')){

            number+=s.charAt(index);

            index+=1;

        }

        Node root = new Node( Integer.parseInt(number));

        stack.push( new Pair( root , 0));

        

        while( index<s.length() ){

            char ch = s.charAt(index);

            if(ch=='('){

                stack.peek().state+=1;

                stack.push(null); // storing to handle empty brackets case..like 1()(2)..but these cases are not included in this test cases

            }else if( ch == ')' ){

                stack.pop();

            }else{

                stack.pop(); // remove null; because we have added it to avoid empty bracekts

                String digit="";

                while( index<s.length() && (s.charAt(index)!='(' && s.charAt(index)!= ')')){

                    digit+=s.charAt(index);

                    index+=1;

                }

                index-=1; // because it would get incresed at last

                Node node = new Node(Integer.parseInt(digit) );

                Pair top = stack.peek();

                if( top.state == 1){ /*can be attached to the left side */

                    top.node.left = node;

                }else if( top.state == 2 ){

                    top.node.right = node;

                }

                stack.push( new Pair(node , 0 ));

            }

            index+=1;

        }

        return stack.peek().node;

    }
}
