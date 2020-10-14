package com.codegym;

public class BST<T extends Comparable<T>> implements Tree<T> {
    protected TreeNode<T> root;
    protected int size = 0;

    public BST() {

    }

    public BST(T[] objects) {
        for (T object : objects) {
            insert(object);
        }
    }

    @Override
    public boolean insert(T e) {
        if (root == null)
            root = createNewNode(e); /*create a new root*/
        else {
            /*locate the parent node*/
            TreeNode<T> parent = null;
            TreeNode<T> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false; /*Duplicate node not inserted*/
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true; /*element inserted successfully*/
    }

    protected TreeNode<T> createNewNode(T e) {
        return new TreeNode<>(e);
    }

    @Override
    public void postorder() {
        postorder(root);
    }

    protected void postorder(TreeNode<T> root) {
        if (root == null) return;
        inorder(root.left);
        inorder(root.right);
        System.out.println(root.element + " ");
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    protected void inorder(TreeNode<T> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }

    @Override
    public void preorder() {
        preorder(root);
    }

    protected void preorder(TreeNode<T> root) {
        if (root == null) return;
        System.out.println(root.element + " ");
        inorder(root.left);
        inorder(root.right);
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public boolean delete(T e) {
        return false;
    }

    @Override
    public boolean search(T e) {
        return false;
    }
}
