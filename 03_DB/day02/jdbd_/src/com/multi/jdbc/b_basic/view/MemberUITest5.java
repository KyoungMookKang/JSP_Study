package com.multi.jdbc.b_basic.view;

import com.multi.jdbc.b_basic.model.dao.MemberDao;
import com.multi.jdbc.b_basic.model.dto.MemberDto;

import javax.swing.*;

public class MemberUITest5 {
    public static void main(String[] args) { // 로그인

        String id = JOptionPane.showInputDialog("아이디 입력");
        String pw = JOptionPane.showInputDialog("패스워드를 입력하라우");

        MemberDao dao = new MemberDao();
        MemberDto memberDto = new MemberDto();
        memberDto.setId(Integer.parseInt(id));
        memberDto.setPw(pw);
        MemberDto rsDto = dao.login(memberDto);

        System.out.println(rsDto);

        // 어떤 경우에 "로그인 실패" 로 출력
        if(rsDto == null){
            System.out.println("로그인 실패");
        } else { // else " 로그인 성공 "
            System.out.println("로그인 성공");
        }
    }
}
