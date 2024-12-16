package com.myshop.react1.vo;

import lombok.Data;

@Data
public class UserVO {

    public UserVO(String string, String string2, String string3, String string4, String string5, String string6,
                  String string7, String string8, String string9, String string10, String string11, String string12,
                  String string13) {
        // TODO Auto-generated constructor stub
    }
//new UserVO("chunkind", "김땡땡", "1", "19880420", "chunkind@naver.com", "01012341244", "경기도 부천시 소사구", "괴안동 11", "12345", "경인로 122", "1동", "12345", "system")

    private long usrBaseSeq;
    private String usrId;
    private String usrNm;
    private String passWd;
    private String usrBirth;
    private String emailAddr;
    private String cellNo;
    private String landAddrBase;
    private String landAddrDtl;
    private String landPostNo;
    private String loadAddrBase;
    private String loadAddrDtl;
    private String loadPostNo;
    private String passWdChgDate; //Date -> String으로 받음
    private String lockYn;
    private String rgstId;
    private String rgstDate; //Date -> String으로 받음
    private String updtId;
    private String updtDate; //Date -> String으로 받음
    private String useYn;

    private String userSequence; // 리스트 순서

    private String searchType;
    private String searchText;
    private String searchGradeUpperType;
    private String searchGradeUnderType;
    private String searchStartRgstDate;
    private String searchEndRgstDate;

}
