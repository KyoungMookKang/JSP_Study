package com.multi.jdbc.b_basic.view;

import com.multi.jdbc.b_basic.model.dao.MemberDao;

import javax.swing.*;

public class MemberUITest2 {
    public static void main(String[] args) { // 회원탈퇴

        String id = JOptionPane.showInputDialog("아이디 입력");
        String pw = JOptionPane.showInputDialog("패스워드 입력");
        String name = JOptionPane.showInputDialog("이름 입력");
        String tel = JOptionPane.showInputDialog("전화번호 입력");

        MemberDao dao = new MemberDao();



    }
}
