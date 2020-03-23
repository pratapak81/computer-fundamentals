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

    public User insert(User user) throws Exception {
        if (user == null) {
            throw new NullPointerException("Object which you are trying to insert is null");
        }

        if (validateRequiredFields(user) && !isUserExist(user.getId())) {
            userList.add(user);
            return user;
        }
        throw new Exception("User already exist");
    }

    public User update(User user) throws Exception {
        if (user == null) {
            throw new NullPointerException("Object which you are trying to insert is null");
        }

        if (validateRequiredFields(user) || !isUserExist(user.getId())) {
            throw new Exception("User doesn't exist. Please insert before updating");
        }
        int index = findIndex(user.getId());
        userList.set(index, user);
        return user;
    }

    public User get(String id) {
        int index = findIndex(id);
        if (index > -1) {
            return userList.get(index);
        }
        return null;
    }

    public boolean delete(String id) {
        int index = findIndex(id);
        if (index > -1) {
            userList.remove(index);
            return true;
        }
        return false;
    }

    private int findIndex(String id) {
        int index = -1;
        for (User user : userList) {
            index++;
            if (user.getId().equals(id)) {
                break;
            }
        }
        return index;
    }

    private boolean validateRequiredFields(User user) throws Exception {
        if (user.getId() == null) {
            throw new Exception("Unique identifier Id is mandatory");
        }
        return true;
    }

    private boolean isUserExist(String id) {
        return userList.stream().anyMatch(user -> user.getId().equals(id));
    }
}
