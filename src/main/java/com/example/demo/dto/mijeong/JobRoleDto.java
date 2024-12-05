package com.example.demo.dto.mijeong;

import java.util.List;

import lombok.Data;

@Data
public class JobRoleDto {
	private int roleId; // 1. 직무 고유 ID
	private String roleName; // 2. 직무 이름 (예: 개발 PM, 게임 개발 등)

}
