package com.nsc.tdd.repository;

import com.nsc.tdd.model.User;

public interface UserRepository {

    User insert(User user);

    User update(User user);

    User get(String id);

    boolean delete(String id);

    int getUserCount();
}
