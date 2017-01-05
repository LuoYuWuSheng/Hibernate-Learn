package site.luoyu.entity;

/**
 * Created by luoyu on 2016/10/18 0018.
 */
public class CourseEntity {
    private String cno;
    private String cname;
    private Integer ccredit;

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

    public Integer getCcredit() {
        return ccredit;
    }

    public void setCcredit(Integer ccredit) {
        this.ccredit = ccredit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseEntity that = (CourseEntity) o;

        if (cno != null ? !cno.equals(that.cno) : that.cno != null) return false;
        if (cname != null ? !cname.equals(that.cname) : that.cname != null) return false;
        if (ccredit != null ? !ccredit.equals(that.ccredit) : that.ccredit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cno != null ? cno.hashCode() : 0;
        result = 31 * result + (cname != null ? cname.hashCode() : 0);
        result = 31 * result + (ccredit != null ? ccredit.hashCode() : 0);
        return result;
    }
}
