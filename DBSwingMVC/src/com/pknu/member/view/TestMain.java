package com.pknu.member.view;

import java.util.List;

import com.pknu.member.dao.MemberDao;
import com.pknu.member.vo.MemberVO;

public class TestMain {

	public static void main(String[] args) {
		// 개인 조회
		MemberDao mDao = new MemberDao();
		MemberVO  mem  = mDao.getmember("sea1");
		System.out.println(mem.info());
		
		// 목록 조회
		List<MemberVO> mList = mDao.getmemberList(""); 
	}

}
