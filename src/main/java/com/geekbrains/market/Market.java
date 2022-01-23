package com.geekbrains.market;

import com.geekbrains.person.seller.Seller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Market {
    private String marketName;

    private UUID uuid = UUID.randomUUID();

    private List<Seller> sellers;

    public Market(String marketName) {
        this.marketName = marketName;
    }

    public List<Seller> getSellers() {
        return sellers;
    }

    public void setSellers(List<Seller> sellers) {
        this.sellers = sellers;
    }

    public void addSeller(Seller seller) {
        if(sellers == null) {
            sellers = new ArrayList<>();
        }

        sellers.add(seller);
    }

    public String getMarketName() {
        return marketName;
    }

    public UUID getUuid() {
        return uuid;
    }
}
