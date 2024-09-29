package com.ecommerce.service;

public class UserService {
    private UserDao userDao;

    public UserService() {
        this.userDao = new UserDao();
    }

    public void registerUser(String name, String email, String password) {
        if (userDao.getUserByEmail(email) != null) {
            throw new RuntimeException("Usuário já existe!");
        }
        userDao.addUser(new User(name, email, password));
    }
}

