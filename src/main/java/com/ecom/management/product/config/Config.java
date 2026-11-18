package com.ecom.management.product.config;

import io.github.cdimascio.dotenv.*;


public class Config {
    private Dotenv dotEnv; 
    private static Config instance; 

    private Config() {
        try {            
            String rootDir = System.getProperty("user.dir");

            this.dotEnv = Dotenv
                .configure()
                .directory(rootDir)
                .ignoreIfMissing()
                .load();
        } catch (Exception e) {
            System.out.println("Error when load the .env");
        }
    }

    public static Dotenv env() {
        if (instance == null) {
            instance = new Config();
        }
        return instance.dotEnv;
    }
    
}
