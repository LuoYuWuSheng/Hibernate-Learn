package site.luoyu.entity;

/**
 * Created by luoyu on 2016/10/18 0018.
 */
public class ScEntity {
    private String sno;
    private String cno;
    private Short grade;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public Short getGrade() {
        return grade;
    }

    public void setGrade(Short grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScEntity scEntity = (ScEntity) o;

        if (sno != null ? !sno.equals(scEntity.sno) : scEntity.sno != null) return false;
        if (cno != null ? !cno.equals(scEntity.cno) : scEntity.cno != null) return false;
        if (grade != null ? !grade.equals(scEntity.grade) : scEntity.grade != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sno != null ? sno.hashCode() : 0;
        result = 31 * result + (cno != null ? cno.hashCode() : 0);
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        return result;
    }
}
