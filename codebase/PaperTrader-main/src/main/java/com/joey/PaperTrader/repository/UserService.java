package com.joey.PaperTrader.repository;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    public static Map<String, String> cache = new HashMap<>();

    public static Map<String, String> getCache(){
        return cache;
    }

    public static void setCache(String ID, String email ){
        cache.put(ID, email);
    }

    public static void clearCache(){
        cache.clear();
    }
}
