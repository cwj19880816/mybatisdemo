package biz.bizimpl;

import biz.UserBiz;
import dao.UserDao;
import dao.daoimpl.UserDaoImpl;
import entity.User;
import org.apache.ibatis.io.Resources;

import java.io.InputStream;
import java.util.List;

public class UserBizImpl implements UserBiz {
    @Override
    public User loginVerify(String name, String password) {
        User user = null;
        UserDao userDao = new UserDaoImpl();
        List<User> users = userDao.getUsers(name, password);
        if (users.size() > 0) {
            user = users.get(0);
        }
        return user;
    }
}
