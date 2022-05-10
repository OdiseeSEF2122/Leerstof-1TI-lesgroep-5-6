package com.example.code;

import java.util.ArrayList;

public class Database {

    private ArrayList<User> users = new ArrayList<>();

    public boolean addUser(User user){
        if(!users.contains(user)) {
            users.add(user);
            return true;
        }

        return false;
    }
}
