package com.codegym;

public class TreeNode<T> {
    public T element;
    public TreeNode<T> left;
    public TreeNode<T> right;

    public TreeNode(){
        this.element = null;
        this.right = null;
        this.left = null;
    }

    public TreeNode(T element){
        this.element = element;
        this.right = null;
        this.left = null;
    }

//    public T getData() {
//        return data;
//    }
//
//    public void setData(T data) {
//        this.data = data;
//    }
}
