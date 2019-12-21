package com.ustglobal.mailbackend.dao;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.ustglobal.mailbackend.dto.MailInfo;

@Repository
public interface DeletemailDAO {
	
	public boolean deletemail(int id);
	

}
