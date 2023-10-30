package com.chunjae.test03.domain;

import lombok.Data;

@Data
public class UserInfo {
    private int no;
    private String id;
    private String pw;
    private String name;
    private String email;
    private String tel;
    private String regdate;
    private int point;
    private boolean act;
    private int lev;
}
