package mapper;

import entity.Clas;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Mapper
public interface ClasMapper {
    @Select("select * from t_clas c,t_teacher_clas_relation r where c.clas_id=r.clas_id and r.teacher_id=#{id}")
    @Results({
            @Result(id = true, property = "clas_id", column = "clas_id"),
            @Result(property = "clas_name", column = "clas_name"),
            @Result(property = "teachers", column = "clas_id", many = @Many(select = "mapper.TeacherMapper.getTeachers", fetchType = FetchType.EAGER)),
            @Result(property = "students", column = "clas_id", many = @Many(select = "mapper.StudentMapper.getStudents", fetchType = FetchType.EAGER)),
    })
    List<Clas> getClases(int id);
}
