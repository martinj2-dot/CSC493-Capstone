package com.joey.PaperTrader.repository;

import java.util.HashMap;
import java.util.Map;

public class UserService {

    /*
    * UserService class to keep track of currently signed-in User object.
    *
    * When initialized the user cache takes the string from the /login controller and updates the cache.
    *
    * Before anything is added to the cache a check bust be made in order to assure there are no users logged in.
    * */
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
