package com.example.demo.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

	private String userId;          // 사용자 고유 ID
    private String userPassword;    // 비밀번호 (해시 값)
    private String userEmail;       // 이메일 (로그인 ID)
    private String userName;        // 사용자 이름
    private String userNickname;    // 사용자 별명
    private String userSsn;         // 주민번호
    private String userPhone;       // 휴대폰번호
    private String userAddress;     // 주소
    private int userPostalCode;     // 우편번호
    private Timestamp userRegistDate;  // 계정 생성일 (가입 일자)

	
}
