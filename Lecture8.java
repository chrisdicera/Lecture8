import java.security.Key;
import java.time.chrono.MinguoChronology;

// A class to store a binary tree node
class Node
{
    int key;
    Node left = null, right = null;
 
    Node(int key) {
        this.key = key;
    }
}
 
class Lecture8
{
    // Recursive function to check if a given binary tree is a sum tree or not
    public static int isSumTree(Node root)
    {

        //used to check for leaf nodes 

        if (root.left == null && root.right == null){


            return root.key;

        }
        int left = isSumTree(root.left);
        int right = isSumTree(root.right);

        if (left != Integer.MIN_VALUE && right != Integer.MIN_VALUE && left + right == root.key){

            System.out.println(left + "left");   
            System.out.println(root.key+"node");
            System.out.println(right + "right");
            return root.key * 2; 



        }
        

 
        return Integer.MIN_VALUE;
    }
 
    public static void main(String[] args)
    {
        /* Construct the following tree
                 44
                /  \
               /    \
              9     13
             / \    / \
            4   5  6   7
        */
 
        Node root = new Node(44);
        root.left = new Node(9);
        root.right = new Node(13);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);




        
 
        if (isSumTree(root) != Integer.MIN_VALUE) {
            System.out.println("Binary tree is a sum tree");
        }
        else {
            System.out.println("Binary tree is not a sum tree");
        }
    }
}
