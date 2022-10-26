package com.company;
//It is a hierarchical Data Structure.
//Left subtree is less than root.
//Right subtree is greater than root.

//Search complexity of BST(O(log h))
//BST Makes Search Efficient.
//Skewed tree (jo ik hi traf ko chala jata hai  ya left or ya right) is traha ka tree ma search complexity O(n) tak chali jatiti hai

//jo difference binary search or linear search ma hota hai vohi difference Binary tree or Binary Search tree ma hota hai

import java.util.ArrayList;

//In BST, Most problems will be solved using recursion i.e. by dividing into subproblems & making recursive calls on subtrees
public class BST {
    class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
        }
    }

        public node insertNode(node root,int val)
        {
            if(root == null)
            {
                root = new node(val);
                return root;
            }

            if(val < root.data)
            {
                root.left = insertNode(root.left,val);
            }
            else
            {
                root.right = insertNode(root.right,val);
            }
            return root;
        }

        public static boolean searchKey(node root,int key)
        {
            if(root == null)
            {
                return false;
            }
            if(root.data == key)
            {
                return true;
            }
            else if (root.data > key)
            {
                return searchKey(root.left,key);
            }
            else
            {
                return searchKey(root.right,key);
            }
        }

//        Inorder Successor always has 0 or 1 child.
    public static node deleteNode(node root,int val)
    {
        if(root.data > val)
        {
            root.left = deleteNode(root.left,val);
        }
        else if (root.data < val)
        {
            root.right = deleteNode(root.right,val);
        }
        else
        {
//            case 1 : Both child are null
            if(root.left == null && root.right == null)
            {
                return null;
            }
//            case 2 : Only one child exist
            if(root.left == null)
            {
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

//            case 3: Both child exist
            node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteNode(root.right,IS.data);
        }
        return root;
    }

    public static node inorderSuccessor(node root)
    {
        while(root.left != null)
        {
            root = root.left;
        }
        return root;
    }

    public static void printInRange(node root,int x,int y)
    {
        if(root == null)
        {
            return;
        }
        if(root.data >= x && root.data <= y)
        {
            printInRange(root.left,x,y);
            System.out.print(root.data+" ");
            printInRange(root.right,x,y);
        }
        else if (root.data >= y)
        {
            printInRange(root.left,x,y);
        }
        else {
            printInRange(root.right,x,y);
        }
    }

    public static void printPath(ArrayList<Integer> path)
    {
        for(int i = 0;i<path.size();i++)
        {
            System.out.print(path.get(i) + "-->");
        }
        System.out.println();
    }
    public static void printRoot2Leaf(node root, ArrayList<Integer> path)
    {
        if(root == null)
        {
            return;
        }
        path.add(root.data);

//        leaf node ki condition
        if(root.left == null && root.right == null)
        {
            printPath(path);
        }else {
            printRoot2Leaf(root.left,path);
            printRoot2Leaf(root.right,path);
        }
        path.remove(path.size()-1);

    }

//        It is for printing the key in sorted fashion.
        public static void inOrder(node root)
        {
            if(root == null)
            {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

    public static void main(String[] args) {
        int value[]={8,5,3,6,10,11,14};
        node root = null;
        BST b = new BST();
        for (int i : value)
        {
            root = b.insertNode(root,i);
        }
        inOrder(root);
        System.out.println();

        if(searchKey(root,22))
        {
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }
//        deleteNode(root,8);
//        inOrder(root);

//        System.out.println();
        printInRange(root,3,5);
        System.out.println();

        printRoot2Leaf(root,new ArrayList<>());
    }
}
