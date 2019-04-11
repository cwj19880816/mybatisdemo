package mapper;

import entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from t_user where user_name=#{param1} and user_password=#{param2}")
    @Results({
            @Result(id = true, property = "user_id", column = "user_id"),
            @Result(property = "user_name", column = "user_name"),
            @Result(property = "user_password", column = "user_password"),
            @Result(property = "student", column = "user_id", one = @One(select = "mapper.StudentMapper.getStudent", fetchType = FetchType.EAGER)),
            @Result(property = "teacher", column = "user_id", one = @One(select = "mapper.TeacherMapper.getTeacher", fetchType = FetchType.EAGER))
    })
    List<User> getUsers(String name, String password);

    @Select("select * from t_user where user_id=#{id}")
    User getUser(int id);
}
