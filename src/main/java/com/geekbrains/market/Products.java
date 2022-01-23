package com.geekbrains.market;

import static com.geekbrains.market.MarketConstants.*;

public enum Products {
    TOMATO(TOMATO_PRODUCT_NAME, 5, 17),
    CUCUMBER(CUCUMBER_PRODUCT_NAME, 7, 21),
    CARROT(CARROT_PRODUCT_NAME, 3, 16),
    CABBAGE(CABBAGE_PRODUCT_NAME, 6, 19),
    APPLE(APPLE_PRODUCT_NAME, 2, 11),
    PEAR(PEAR_PRODUCT_NAME, 3, 13),
    BANANA(BANANA_PRODUCT_NAME, 9, 18),
    STRAWBERRY(STRAWBERRY_PRODUCT_NAME, 13, 24),
    RASPBERRY(RASPBERRY_PRODUCT_NAME, 8, 16),
    WATERMELON(WATERMELON_PRODUCT_NAME, 2, 18),
    CHERRY(CHERRY_PRODUCT_NAME, 7, 15),
    ONION(ONION_PRODUCT_NAME, 1, 6),
    MELON(MELON_PRODUCT_NAME, 6, 21);

    public final String productName;
    public final int minPrice;
    public final int maxPrice;

    Products(String productName, int minPrice, int maxPrice) {
        this.productName = productName;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public String getProductName() {
        return productName;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }
}
