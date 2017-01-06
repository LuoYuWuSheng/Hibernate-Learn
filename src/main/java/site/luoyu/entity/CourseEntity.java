package site.luoyu.entity;

/**
 * Computer user xd
 * Created by 张洋 on 2017/1/6.
 */
public class CourseEntity {
    private String cno;
    private String cname;
    private String cpno;
    private Short ccredit;

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCpno() {
        return cpno;
    }

    public void setCpno(String cpno) {
        this.cpno = cpno;
    }

    public Short getCcredit() {
        return ccredit;
    }

    public void setCcredit(Short ccredit) {
        this.ccredit = ccredit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseEntity that = (CourseEntity) o;

        if (cno != null ? !cno.equals(that.cno) : that.cno != null) return false;
        if (cname != null ? !cname.equals(that.cname) : that.cname != null) return false;
        if (cpno != null ? !cpno.equals(that.cpno) : that.cpno != null) return false;
        if (ccredit != null ? !ccredit.equals(that.ccredit) : that.ccredit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cno != null ? cno.hashCode() : 0;
        result = 31 * result + (cname != null ? cname.hashCode() : 0);
        result = 31 * result + (cpno != null ? cpno.hashCode() : 0);
        result = 31 * result + (ccredit != null ? ccredit.hashCode() : 0);
        return result;
    }
}
