package site.luoyu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import site.luoyu.entity.CourseEntity;

/**
 * Created by luoyu on 2016/10/19 0019.
 */
public class MyQuery {

    private Session querySession ;
    public MyQuery(SessionFactory factory) {
        this.querySession =  factory.openSession();
        getEntityById();
    }

    private void getEntityById(){
        CourseEntity courseEntity = (CourseEntity) querySession.load(CourseEntity.class,"1");
        System.out.println("课程名称 "+courseEntity.getCname()+" 先修课 "+courseEntity.getCpno());
    }
}
