package com.ecom.management.product.database;

public class Database {
    private static Database instance;
    
    private Database() {

    }

    public Database get() {
        if (instance == null) {
            instance = new Database(); 
        }
        return instance;
    }
}
