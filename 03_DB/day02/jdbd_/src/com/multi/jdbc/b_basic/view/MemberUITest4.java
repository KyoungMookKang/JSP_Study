package com.multi.jdbc.b_basic.view;

import com.multi.jdbc.b_basic.model.dao.MemberDao;
import com.multi.jdbc.b_basic.model.dto.MemberDto;

import javax.swing.*;

public class MemberUITest4 {
    public static void main(String[] args) { // 회원 1명 검색기능

        String id = JOptionPane.showInputDialog("아이디 입력");

        MemberDao dao = new MemberDao();
        MemberDto memberDto = dao.selectOne(id);

        JOptionPane.showMessageDialog(null, memberDto);
    }
}
