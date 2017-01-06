package site.luoyu.entity;

import java.io.Serializable;

/**
 * Computer user xd
 * Created by 张洋 on 2017/1/6.
 */
public class ScEntityPK implements Serializable {
    private String sno;
    private String cno;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScEntityPK that = (ScEntityPK) o;

        if (sno != null ? !sno.equals(that.sno) : that.sno != null) return false;
        if (cno != null ? !cno.equals(that.cno) : that.cno != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sno != null ? sno.hashCode() : 0;
        result = 31 * result + (cno != null ? cno.hashCode() : 0);
        return result;
    }
}
