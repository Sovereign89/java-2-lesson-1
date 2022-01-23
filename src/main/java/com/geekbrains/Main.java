package com.geekbrains;

import com.geekbrains.market.Market;
import com.geekbrains.market.Products;
import com.geekbrains.person.buyer.Buyer;
import com.geekbrains.person.seller.Seller;
import com.geekbrains.person.seller.SellerObject;
import com.geekbrains.person.seller.Sellers;
import com.geekbrains.product.Product;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static SecureRandom random = new SecureRandom();

    //1) Seller, может добавлять, убирать продукты, выставлять стоимость
    //2) Customer может покупать товар, может что-то желать
    //3) Когда seller продает продукты, у него они отнимаются, но добавляются у customer
    // кэш отнимается у customer, добавляется к seller
    //4) Поиск товара про продавцу и продукту, либо по продукту

    public static void main(String[] args) {

        Market market = new Market("Рынок");

        for (Sellers seller : Sellers.values()) {
            market.addSeller(createSeller(seller.getSellerName(), seller.getSellerLastName(), seller.getInitCash()));
        }

        Buyer customer = createCustomer();
        System.out.printf("У меня было %s руб.%n",customer.getCash());
        SellerObject mySeller = new SellerObject("Алексей".toLowerCase(),"Ушаков".toLowerCase());
        customer.findProductOnMarket(market);
        customer.findProductSeller(market, Sellers.get(mySeller));
        customer.info();
    }

    private static Buyer createCustomer() {

        List<Product> productList = new ArrayList<>();
        for (Products product : Products.values()) {
            int quantity = (random.nextInt(10));

            if (quantity > 0) {
                Product newProduct = new Product();
                newProduct.setName(product.getProductName());
                newProduct.setQuantity(quantity);

                productList.add(newProduct);
            }
        }

        return new Buyer(productList, random.nextInt(100));
    }

    private static Seller createSeller(String name, String lastName, int cash) {
        Seller seller = new Seller();
        seller.setName(name);
        seller.setLastName(lastName);
        seller.setCash(cash);

        List<Product> productList = new ArrayList<>();
        for (Products product : Products.values()) {
            int quantity = 0;
            int price = 0;

            while (quantity <= 0) {
                quantity = random.nextInt(50);
            }

            while (price <= product.getMinPrice()) {
                price = random.nextInt(product.getMaxPrice());
            }

            Product newProduct = new Product();
            newProduct.setName(product.getProductName());
            newProduct.setPrice(price);
            newProduct.setQuantity(quantity);

            productList.add(newProduct);
        }

        seller.setProducts(productList);

        return seller;
    }

}
