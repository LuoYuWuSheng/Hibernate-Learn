package site.luoyu;

import org.hibernate.Session;
import org.hibernate.Transaction;
import site.luoyu.entity.StudentEntity;

/**
 * Computer user xd
 * Created by 张洋 on 2017/1/18.
 * Hibernate 事务示例
 */
public class myTransaction {
    public static void main(String[] args) {
        Session session = SessionUtil.getSession();
        Transaction tx = session.getTransaction();
        tx.begin();
        StudentEntity student = new StudentEntity();
        student.setSage((short) 18);
        student.setSdept("CS");
        student.setSname("自己");
        student.setSno("1503111");
        student.setSsex("男");
        session.save(student);
        tx.commit();
    }
}
