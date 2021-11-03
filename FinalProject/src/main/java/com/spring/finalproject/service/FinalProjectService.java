package com.spring.finalproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.spring.finalproject.model.InterFinalProjectDAO;

// 트랜잭션 처리 담당, DB담당
@Service
public class FinalProjectService implements InterFinalProjectService {
	
	@Autowired
	private InterFinalProjectDAO dao; // 의존객체 주입
	
	
	// DB연결 테스트용 (이순신 select)
	@Override
	public List<String> getName() {
		
		List<String> nameList = dao.getName();
		
		return nameList;
	}

	
	
}
