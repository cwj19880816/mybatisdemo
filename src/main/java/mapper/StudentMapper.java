package mapper;

import entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("select * from t_student where user_id=#{id}")
    Student getStudent(int id);

    @Select("select * from t_student where clas_id=#{id}")
    List<Student> getStudents(int id);
}
