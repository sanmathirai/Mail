package com.ustglobal.mailbackend.dao;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import com.ustglobal.mailbackend.dto.MailInfo;

@
public class IndexDaoImpl implements IndoxDAO{

	@Autowired
	private EntityManagerFactory factory;
	
	@Override
	public MailInfo displayMail(int toid, int fromid, String subject) {
		
		
		return null;
	}

}
