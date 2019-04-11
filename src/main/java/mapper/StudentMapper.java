package mapper;

import entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentMapper {
    @Select("select * from t_student where user_id=#{id}")
    Student getStudent(int id);
}
