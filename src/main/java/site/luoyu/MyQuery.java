package site.luoyu;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import site.luoyu.entity.CourseEntity;
import site.luoyu.entity.ScEntity;
import site.luoyu.entity.StudentEntity;

import java.util.List;
import java.util.Set;

/**
 * Created by luoyu on 2016/10/19 0019.
 */
public class MyQuery {

    private Session querySession ;
    public MyQuery(SessionFactory factory) {
        this.querySession =  factory.openSession();
        getEntityById();
        getStudentAndSC();
        hibernateNamedQuery();
    }

    private void getEntityById(){
        CourseEntity courseEntity = (CourseEntity) querySession.load(CourseEntity.class,"1");
        System.out.println("课程名称 "+courseEntity.getCname()+" 先修课 "+courseEntity.getCpno());
    }

    private void getStudentAndSC(){
//        查询课程的同时查询课程名称
        StudentEntity student = (StudentEntity) querySession.load(StudentEntity.class,"201215121");
        Set<ScEntity> sc = student.getSc();
        for (ScEntity oneSc:sc) {
            System.out.println(student.getSname()+" "+oneSc.getCourse().getCname()+" "+oneSc.getGrade());
        }
    }
    private void hibernateNamedQuery(){
        System.out.println("通过Hibernate命名查询查询学生");
        Query query = querySession.getNamedQuery("Student.Query");
//todo        继续折腾中文查询不到的问题
        query.setParameter("name","李勇");
        Query ageQuery = querySession.getNamedQuery("Student.Query.ByAge");
//        Hibernate的自动类型识别挺坑的啊，这里把20识别为Int，但是数据库中是short。查询会有问题
        ageQuery.setParameter("age",(short)20);
        List<StudentEntity> NameResult = query.list();
        List<StudentEntity> ageResult = ageQuery.list();
        System.out.println("中文名称查询");
        for (StudentEntity student : NameResult) {
            System.out.println("学生姓名："+student.getSname());
        }
        System.out.println("通过年龄查询");
        for (StudentEntity student : ageResult) {
            System.out.println("学生姓名："+student.getSname());
        }
    }
}
