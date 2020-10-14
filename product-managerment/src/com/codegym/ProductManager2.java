package com.codegym;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ProductManager2 {
    private LinkedList<Product> listProd;

    public ProductManager2() {
        listProd = new LinkedList<>();
    }

    public boolean isExistByID(String id) {
        if (listProd.isEmpty()) {
            System.out.println("Empty list!");
            return false;
        }

        Iterator<Product> itr = listProd.iterator();
        while (itr.hasNext()) {
            Product temp = itr.next();
            if (temp.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public boolean isExistByName(String name) {
        if (listProd.isEmpty()) {
            System.out.println("Empty list!");
            return false;
        }

        Iterator<Product> itr = listProd.iterator();
        while (itr.hasNext()) {
            Product temp = itr.next();
            if (temp.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void add(Product product) {
        listProd.addLast(product);
    }

    public void set(String id, String name, long price) {
        if (listProd.isEmpty()) {
            System.out.println("Empty product!");
            return;
        }
        if (!isExistByID(id)) {
            System.out.println("Product with id '" + id + "' is not exist!");
            return;
        }

        Iterator<Product> itr = listProd.iterator();
        while (itr.hasNext()) {
            Product temp = itr.next();
            if (temp.getId().equals(id)) {
                temp.setName(name);
                temp.setPrice(price);
            }
        }
    }

    public void delete(String id) {
        if (listProd.isEmpty()) {
            System.out.println("Empty product!");
            return;
        }
        if (!isExistByID(id)) {
            System.out.println("Product with id '" + id + "' is not exist!");
            return;
        }
        Iterator<Product> itr = listProd.iterator();
        while (itr.hasNext()) {
            Product temp = itr.next();
            if (temp.getId().equals(id)) {
                listProd.remove(temp);
                break;
            }
        }
    }

    public Product find(String name) {
        if (listProd.isEmpty()) {
            System.out.println("Empty product!");
            return null;
        }
        if (!isExistByName(name)) {
            System.out.println("Product with name '" + name + "' is not exist!");
            return null;
        }

        Iterator<Product> itr = listProd.iterator();
        while (itr.hasNext()) {
            Product temp = itr.next();
            if (temp.getName().equals(name)) {
                return temp;
            }
        }
        return null;
    }

    public void ascendingSort() {
        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(listProd, priceComparator);
    }

    public void decreaseSort() {
        ascendingSort();
        Collections.reverse(listProd);
    }

    public void display() {
        Iterator<Product> itr = listProd.iterator();
        while (itr.hasNext()) {
            Product temp = itr.next();
            System.out.println(temp.toString());
        }
    }
}
