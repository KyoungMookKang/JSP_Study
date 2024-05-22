package com.miniproject.preset.model.dto;

public class PresetDto {


//    PRESET_NUM VARCHAR2(100) PRIMARY KEY,
//    MEMBER_NUM VARCHAR2(100) REFERENCES MEMBERS(MEMBER_NUM),
//    PRESET_COMFORT NUMBER NOT NULL,
//    PRESET_WEIGHT NUMBER NOT NULL,
//    PRESET_PASSENGER NUMBER NOT NULL


    private String presetNum;
    private String memberNum;
    private boolean presetComfort;
    private boolean presetWeight;
    private boolean presetPassenger;

    public PresetDto(String presetNum, String memberNum, boolean presetComfort, boolean presetWeight, boolean presetPassenger) {
        this.presetNum = presetNum;
        this.memberNum = memberNum;
        this.presetComfort = presetComfort;
        this.presetWeight = presetWeight;
        this.presetPassenger = presetPassenger;
    }

    public String getPresetNum() {
        return presetNum;
    }

    public void setPresetNum(String presetNum) {
        this.presetNum = presetNum;
    }

    public String getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(String memberNum) {
        this.memberNum = memberNum;
    }

    public boolean isPresetComport() {
        return presetComfort;
    }

    public void setPresetComport(boolean presetComport) {
        this.presetComfort = presetComport;
    }

    public boolean isPresetWeight() {
        return presetWeight;
    }

    public void setPresetWeight(boolean presetWeight) {
        this.presetWeight = presetWeight;
    }

    public boolean isPresetPassenger() {
        return presetPassenger;
    }

    public void setPresetPassenger() {
        this.presetPassenger = presetPassenger;
    }

    @Override
    public String toString() {
        return "PresetDto{" +
                "memberNum='" + memberNum + '\'' +
                ", presetNum='" + presetNum + '\'' +
                '}';
    }
}
