package mapper;

import entity.Teacher;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

@Mapper
public interface TeacherMapper {
    @Select("select * from t_teacher where user_id=#{id}")
    @Results({
            @Result(id = true,property = "teacher_id",column = "teacher_id"),
            @Result(property = "teacher_name",column = "teacher_name"),
            @Result(property = "teacher_sex",column = "teacher_sex"),
            @Result(property = "user",column = "user_id",one = @One(select = "mapper.UserMapper.getUser",fetchType = FetchType.EAGER)),
            @Result(property = "clases",column = "teacher_id",many = @Many(select = "mapper.ClasMapper.getClases",fetchType = FetchType.EAGER)),
    })
    Teacher getTeacher(int id);
}
