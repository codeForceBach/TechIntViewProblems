package org.example.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LCodeTreeEasy {

    TreeNode root;
    /*
    Given the root of a binary tree, return the inorder traversal of its nodes' values. - DepTh first Traversal
    https://leetcode.com/problems/binary-tree-inorder-traversal/
    https://www.educative.io/blog/data-structures-trees-java
    https://builtin.com/software-engineering-perspectives/tree-traversal#4https://www.baeldung.com/java-depth-first-search
     */

    //in Order also known as pre-order
    public List<Integer> inorderTraversalIterative(TreeNode root){
        List<Integer> orderTree = new ArrayList<>();
        if(root == null)
            return orderTree;
        Stack<TreeNode> nodeStack = new Stack<>();
        TreeNode node = root;
        while(!nodeStack.isEmpty() || node!= null){
            if(node != null){
                nodeStack.push(node);
                node = node.left;
            } else{
                node = nodeStack.pop();
                orderTree.add(node.val);
                node = node.right;
            }
        }
        return orderTree;
    }

    public List<Integer> inorderTraversalRecursive(TreeNode root){
        /*
        https://leetcode.com/problems/binary-tree-inorder-traversal/solutions/31372/java-solution-both-recursion-and-iteration/
         */
        List<Integer> orderTree = new ArrayList<>();
        preOrderRecursive(root, orderTree);
        return orderTree;
    }

    private void preOrderRecursive(TreeNode root, List<Integer> orderTree) {
        if(root != null){
            if(root.left != null) {
                preOrderRecursive(root.left, orderTree);
            }
            orderTree.add(root.val);
            if(root.right != null){
                preOrderRecursive(root.right, orderTree);
            }
        }
    }

    /*
        https://www.baeldung.com/java-binary-tree
        binary tree implementation
     */
    private TreeNode addRecursive(TreeNode current, int value){
        if(current == null){
            return new TreeNode(value);
        }

        if(value < current.val){
            current.left = addRecursive(current.left, value);
        } else if(value > current.val){
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }//end addRecursive method

    public void add(int value){
        root = addRecursive(root, value);
    }

    private boolean containsNodeRecursive (TreeNode current, int value){
        if(current == null){
            return false;
        } if(value == current.val){
            return true;
        }
        return value < current.val ? containsNodeRecursive(current.left, value) : containsNodeRecursive(current.right, value);
    }
    public boolean containsNode(TreeNode node, int value){
        return containsNodeRecursive(node, value);
    }


    //https://github.com/eugenp/tutorials/blob/master/data-structures/src/main/java/com/baeldung/tree/BinaryTree.java
    private TreeNode deleteRecursive(TreeNode current, int value){
        if(current == null){
            return null;
        }

        if(value == current.val){
            if(current.left == null && current.right == null){
                return null;
            }

            if(current.right == null){
                return current.left;
            }

            if (current.left == null){
                return current.right;
            }

            int smallestValue = findSmallestValue(current.right);
            current.val = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }

        return value < current.val ? deleteRecursive(current.left, value) : deleteRecursive(current.right, value);
        /*
        if(value < current.val){

            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
        */

    }

    private int findSmallestValue(TreeNode root){
        return root.left == null ? root.val : findSmallestValue(root.left);
    }


public void delete(int value){
        root = deleteRecursive(root, value);
    }
}
