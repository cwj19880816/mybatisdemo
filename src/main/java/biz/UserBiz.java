package biz;

import entity.User;

public interface UserBiz {
    User loginVerify(String name, String password);
}
