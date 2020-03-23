package com.nsc.tdd.repository;

import com.nsc.tdd.db.DataBase;
import com.nsc.tdd.exception.UserAlreadyExistException;
import com.nsc.tdd.exception.UserNotFoundException;
import com.nsc.tdd.model.User;

public class UserRepositoryImpl implements UserRepository {

    private DataBase dataBase;

    public UserRepositoryImpl() {
        dataBase = DataBase.getInstance();
    }

    @Override
    public User insert(User user) {
        try {
            return dataBase.insert(user);
        } catch (NullPointerException e) {
            throw new NullPointerException(e.getMessage());
        } catch (Exception e) {
            throw new UserAlreadyExistException(e.getMessage());
        }
    }

    @Override
    public User update(User user) {
        try {
            return dataBase.update(user);
        } catch (NullPointerException e) {
            throw new NullPointerException(e.getMessage());
        } catch (Exception e) {
            throw new UserNotFoundException(e.getMessage());
        }
    }

    @Override
    public User get(String id) {
        return dataBase.get(id);
    }

    @Override
    public boolean delete(String id) {
        return dataBase.delete(id);
    }

    @Override
    public int getUserCount() {
        return getCount();
    }

    // we will use this to test mocking private methods
    private int getCount() {
        return 10;
    }
}
