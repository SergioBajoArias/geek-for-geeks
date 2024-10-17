package com.sergio;

import java.util.*;

/**
 * <a href="https://www.geeksforgeeks.org/problems/check-for-bst/1">Link to problem</a>
 */
public class BSTChecker {
    Node buildTree(String str) {

        if (str.isEmpty() || str.charAt(0) == 'N') {
            return null;
        }

        String[] ip = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (!queue.isEmpty() && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    boolean isBST(Node root) {
        if(root == null) {
            return true;
        } else {
            return isBiggerThanChildren(root.data, getAllChildren(root.left)) && isSmallerThanChildren(root.data, getAllChildren(root.right)) && isBST(root.left) && isBST(root.right);
        }
    }

    boolean isSmallerThanChildren(Integer root, List<Integer> children) {
        return children.stream().noneMatch(child -> root >= child);
    }

    boolean isBiggerThanChildren(Integer root, List<Integer> children) {
        return children.stream().noneMatch(child -> root <= child);
    }

    List<Integer> getAllChildren(Node root) {
        List<Integer> results = new ArrayList<>();
        if(root == null) {
            return results;
        } else {
            results.add(root.data);
            results.addAll(getAllChildren(root.left));
            results.addAll(getAllChildren(root.right));
        }
        return results;
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
