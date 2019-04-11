package dao.daoimpl;

import dao.UserDao;
import entity.User;
import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import util.MySqlSessionFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public List<User> getUsers(String name, String password) {
        SqlSession sqlSession = MySqlSessionFactory.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.getUsers(name, password);
        System.out.println(users.get(0).getTeacher());
        sqlSession.commit();
        sqlSession.close();
        return users;
    }
}
