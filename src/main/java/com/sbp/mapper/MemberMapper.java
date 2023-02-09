package com.sbp.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.sbp.model.MemberDTO;

@Mapper
public interface MemberMapper {

	// 회원등록
	public int memberInsert(MemberDTO memberDTO);
	
}
