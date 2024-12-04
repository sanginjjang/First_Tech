package com.example.demo.dto;

import lombok.Data;

@Data
public class CertificateDto {

	private int certificateNum;        // 자격증 넘버
    private String certificateName;    // 자격증 이름
    private String certificateBy;      // 발행처 (기관명)
	
	
}
