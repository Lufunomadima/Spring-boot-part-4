package com.funie.springboot4.service;

import com.funie.springboot4.model.User;

public interface UserService {
    String addUser(long id, String name, String surname);
    int remove(long id);
    User getUser(long id);
}
