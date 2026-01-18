package com.backend.service;

import com.backend.dao.UserDao;
import com.backend.model.User;
import java.util.List;

public class UserService {

    private final UserDao dao = new UserDao();

    public void save(User user) {
        dao.save(user);
    }

    public List<User> getAll() {
        return dao.findAll();
    }
}
