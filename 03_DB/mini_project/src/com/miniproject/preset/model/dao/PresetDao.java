package com.miniproject.preset.model.dao;

import com.miniproject.common.DBConnectionMgr;
import com.miniproject.preset.model.dto.PresetDto;

import javax.swing.*;
import java.sql.Connection;

public class PresetDao {

    Connection con = null;
    DBConnectionMgr dbcp;

    public PresetDao() {

        try {
            dbcp = DBConnectionMgr.getInstance();
            con = dbcp.getConnection();
            con.setAutoCommit(false);
        } catch (Exception e) {
            throw new RuntimeException("PresetDao connection error");
        }
        // PresetDao()

        PresetDao presetDao = new PresetDao();
        PresetDto presetDto = new PresetDto();
        // 실제로 역할 수행 = Dao / dto 역할을 전달해줌
        presetDto.setPresetNum("");
        presetDto.setMemberNum("");
        presetDto.setPresetComport(r11.isSelected());
        presetDto.setPresetWeight(r21.isSelected());
        presetDto.setPresetPassenger(r31.isSelected());

        int result = presetDao.insert(presetDao);
        if(result == 1) JOptionPane.showMessageDialog(f, );


    }
}


