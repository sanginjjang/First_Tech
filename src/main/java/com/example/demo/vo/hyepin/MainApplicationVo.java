package com.example.demo.vo.hyepin;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.Data;

@Data
public class MainApplicationVo {
	
	private String companyName;
	private String applicationName;
	private Timestamp deadlineDate;
	private int day;
	
}
