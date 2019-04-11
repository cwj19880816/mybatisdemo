package mapper;

import entity.Clas;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ClasMapper {
    @Select("select * from t_clas c,t_teacher_class_relation r where c.clas_id=r.class_id and r.teacher_id=#{id}")
    List<Clas> getClases(int id);
}
