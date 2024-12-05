package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobRoleDto {
	
	private int roleId; // 1. 직무 고유 ID
	private String roleName; // 2. 직무 이름 (예: 개발 PM, 게임 개발 등)

}
