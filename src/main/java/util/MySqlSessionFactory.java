package util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MySqlSessionFactory {
    private static SqlSessionFactory sqlSessionFactory=null;

    //初始化SqlSessionFactory对象
    static {
        try {
            InputStream inputStream= Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //获取SqlSessionFactory对象的静态方法
    public static SqlSessionFactory getSqlSessionFactory(){
        return sqlSessionFactory;
    }

    //获取SqlSession对象的静态方法
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
