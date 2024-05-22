package com.multi.jdbc.b_basic.model.dto;

import java.sql.Date;

public class MemberDto {

    private int id;
    private String pw;
    private String name;
    private String tel;
    private Date createdate;

    public MemberDto(){

    }

    public MemberDto(int id, String pw, String name, String tel) {
        this.id = id;
        this.tel = tel;
        this.name = name;
        this.pw = pw;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public int getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public Date getCreatedate() {
        return createdate;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "id=" + id +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", createdate=" + createdate +
                '}';
    }
}
