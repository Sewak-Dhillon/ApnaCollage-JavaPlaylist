package com.company;

//It is a Hierarchical Structure.

import java.util.LinkedList;
import java.util.Queue;
//All traversals have time complexity of O(n);
//PreOrder Traversal => Root --> Left SubTree --> Right SubTree.  ----
//InOrder Traversal => Left SubTree --> Root --> Right SubTree.       } ---- Depth first search(Going in depth)
//PostOrder Traversal => Left SubTree --> Right SubTree --> Root. ----
//LevelOrder Traversal => Print data level wise.(Iteration and Queue is used in this traversal) #Important Traversal.  -- Breadth first search.(level wise printing)
public class TreeDataStructure {
    static class Node{
        int data;
        Node root;
        Node right;
        Node left;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int node[])
        {
            idx++;
            if(node[idx] == -1)
            {
                return null;
            }

            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);

            return newNode;
        }

        public static void preOrder(Node root) // Time Complexity of this function is O(n).
        {
            if(root == null)
            {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root)
        {
            if(root == null)
            {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static void postOrder(Node root)
        {
            if(root == null)
            {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrder(Node root)
        {
            if(root == null)
            {
                return;
            }
            Queue<Node> q= new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty())
            {
                Node currNode = q.remove();
                if(currNode == null)
                {
                    System.out.println();
                    if(q.isEmpty())
                    {
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else {
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null)
                    {
                        q.add(currNode.left);
                    }
                    if(currNode.right != null)
                    {
                        q.add(currNode.right);
                    }
                }
            }
        }
//      Count number of nodes
        public static int countNode(Node root)//(Time Complexity is O(n).)
        {
            if (root == null)
            {
                return 0;
            }
            int leftNodes = countNode(root.left);
            int rightNodes = countNode(root.right);

            return leftNodes + rightNodes + 1;
        }

//        sum of nodes
        public static int sumNode(Node root)//(Time Complexity is O(n).)
        {
            if (root == null)
            {
                return 0;
            }
            int leftsum = sumNode(root.left);
            int rightsum = sumNode(root.right);

            return leftsum + rightsum + root.data;
        }

//        Height of a tree.
        public static int heightOfTree(Node root)
        {
            if(root == null)
            {
                return 0;
            }
            int leftHeight = heightOfTree(root.left);
            int rightHeight = heightOfTree(root.right);
            int height = Math.max(leftHeight,rightHeight) + 1;
            return height;
        }

        public static int diameter1(Node root)// (Time complexity is O(n^2).)
        {
            if(root == null)
            {
                return 0;
            }
            int diam1 = diameter1(root.left);
            int diam2 = diameter1(root.right);
            int diam3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

            return Math.max(diam3,Math.max(diam1,diam2));
        }
        static  class treeInfo{
            int ht;
            int diam;
            treeInfo(int ht,int diam)
            {
                this.ht = ht;
                this.diam = diam;
            }
        }
        public static treeInfo diameter2(Node root)// (Time complexity is O(n).)
        {
            if (root == null)
            {
                return new treeInfo(0,0);
            }
            treeInfo left = diameter2(root.left);
            treeInfo right = diameter2(root.right);

            int myHeight = Math.max(left.ht,right.ht) + 1;

            int diam1 = left.diam;
            int diam2 = right.diam;
            int diam3 = left.ht + right.ht + 1;

            int myDiam = Math.max(diam3,Math.max(diam1,diam2));
            treeInfo myInfo = new treeInfo(myHeight,myDiam);
            return myInfo;
        }
    }

    public static void main(String[] args) {
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node res = tree.buildTree(node);
//        System.out.println(res.data);
        System.out.print("PreOrder Traversal : ");
        tree.preOrder(res);
        System.out.println();
        System.out.print("InOrder Traversal : ");
        tree.inOrder(res);
        System.out.println();
        System.out.print("PostOrder Traversal : ");
        tree.postOrder(res);
        System.out.println();
        System.out.println("Level Order Traversal ");
        tree.levelOrder(res);
        System.out.println("Count of nodes is " + tree.countNode(res));
        System.out.println("Sum of nodes is " + tree.sumNode(res));
        System.out.println("Height of tree is " + tree.heightOfTree(res));
        System.out.println("Diameter of tree using first approuch " + tree.diameter1(res));
        System.out.println("Diameter of tree using second approuch " + tree.diameter2(res).diam);
    }
}
