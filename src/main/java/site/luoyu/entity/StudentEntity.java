package site.luoyu.entity;

/**
 * Computer user xd
 * Created by 张洋 on 2017/1/6.
 */
public class StudentEntity {
    private String sno;
    private String sname;
    private String ssex;
    private Short sage;
    private String sdept;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public Short getSage() {
        return sage;
    }

    public void setSage(Short sage) {
        this.sage = sage;
    }

    public String getSdept() {
        return sdept;
    }

    public void setSdept(String sdept) {
        this.sdept = sdept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (sno != null ? !sno.equals(that.sno) : that.sno != null) return false;
        if (sname != null ? !sname.equals(that.sname) : that.sname != null) return false;
        if (ssex != null ? !ssex.equals(that.ssex) : that.ssex != null) return false;
        if (sage != null ? !sage.equals(that.sage) : that.sage != null) return false;
        if (sdept != null ? !sdept.equals(that.sdept) : that.sdept != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sno != null ? sno.hashCode() : 0;
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        result = 31 * result + (ssex != null ? ssex.hashCode() : 0);
        result = 31 * result + (sage != null ? sage.hashCode() : 0);
        result = 31 * result + (sdept != null ? sdept.hashCode() : 0);
        return result;
    }
}
