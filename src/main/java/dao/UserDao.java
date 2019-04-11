package dao;

import entity.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers(String name, String password);
}
