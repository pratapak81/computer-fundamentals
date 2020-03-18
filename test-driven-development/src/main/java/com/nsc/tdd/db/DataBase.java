package com.nsc.tdd.db;

import com.nsc.tdd.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private static volatile DataBase instance;
    private List<User> userList;

    private DataBase() {
        if (instance != null) {
            throw new RuntimeException("Please use getInstance() method");
        }
        userList = new ArrayList<>();
    }

    public static DataBase getInstance() {
        if (instance == null) {
            synchronized (DataBase.class) {
                if (instance == null) {
                    instance = new DataBase();
                }
            }
        }
        return instance;
    }
}
