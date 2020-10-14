package com.codegym;

public interface Tree<T> {
    boolean insert (T data);

    void postorder();

    void inorder();

    void preorder();

    int getSize();

    boolean delete(T e);

    boolean search(T e);
}
