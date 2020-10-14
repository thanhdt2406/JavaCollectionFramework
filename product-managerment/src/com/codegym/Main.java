package com.codegym;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("SP1", "Iphone", 123);
        Product product2 = new Product("SP2", "SamSung", 1651);
        Product product3 = new Product("SP3", "Nokia", 12323);
        Product product4 = new Product("SP4", "Oppo", 111);
        Product product5 = new Product("SP5", "Xiaomi", 1251);
        Product product6 = new Product("SP6", "BlackBerry", 13);

        //ArrayList
//		ProductManager productManager = new ProductManager();
//		productManager.add(product1);
//	    productManager.add(product2);
//	    productManager.add(product3);
//	    productManager.add(product4);
//	    productManager.add(product5);
//	    productManager.add(product6);
//	    productManager.set("SP1","Oppo",10000);
//	    productManager.delete("SP3");
//	    if(productManager.find("SamSung")!=null){
//			System.out.println(productManager.find("SamSung").toString());
//		}
//	    productManager.display();
//		System.out.println();
//	    productManager.ascendingSort();
//		productManager.decreaseSort();
//		productManager.display();


        //LinkedList
        ProductManager2 productManager2 = new ProductManager2();
        productManager2.add(product1);
        productManager2.add(product2);
        productManager2.add(product3);
        productManager2.add(product4);
        productManager2.add(product5);
        productManager2.add(product6);

//		productManager2.set("SP1","Haha",12321);
//		productManager2.delete("SP5");
//		if(productManager2.find("Iphone")!=null){
//			System.out.println(productManager2.find("Iphone"));
//		}
//		productManager2.ascendingSort();
        productManager2.decreaseSort();
        productManager2.display();
    }
}
