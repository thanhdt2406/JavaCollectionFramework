package com.codegym;

import java.util.ArrayList;
import java.util.Collections;

public class ProductManager {
    private ArrayList<Product> listProd;

    public ProductManager() {
        listProd = new ArrayList<>();
    }

    public boolean isExistByID(String id) {
        for (Product product : listProd) {
            if (id.equals(product.getId())) {
                return true;
            }
        }
        return false;
    }

    public boolean isExistByName(String name) {
        for (Product product : listProd) {
            if (name.equals(product.getName())) {
                return true;
            }
        }
        return false;
    }

    public void add(Product product) {
        listProd.add(product);
    }

    public void set(String id, String name, long price) {
        if (!isExistByID(id)) {
            System.out.println("Product with id '" + id + "' is not exist!");
            return;
        }
        for (Product product : listProd) {
            if (id.equals(product.getId())) {
                product.setName(name);
                product.setPrice(price);
                return;
            }
        }
    }

    public void delete(String id) {
        if (listProd.isEmpty()) {
            System.out.println("Empty product!");
            return;
        }
        if (!isExistByID(id)) {
            System.out.println("Product with " + id + " is not exist!");
            return;
        }
        for (Product product : listProd) {
            if (id.equals(product.getId())) {
                listProd.remove(product);
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

        Product temp = null;
        for (Product product : listProd) {
            if (name.equals(product.getName())) {
                temp = product;
                break;
            }
        }
        return temp;
    }

    public void ascendingSort() {
        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(listProd, priceComparator);
    }

    public void decreaseSort(){
        ascendingSort();
        Collections.reverse(listProd);
    }

    public void display() {
        for (Product product : listProd) {
            System.out.println(product.toString());
        }
    }
}
