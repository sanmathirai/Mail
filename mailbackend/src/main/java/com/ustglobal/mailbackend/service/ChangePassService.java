package com.ustglobal.mailbackend.service;

import com.ustglobal.mailbackend.dto.UserBean;

public interface ChangePassService {
	
	public boolean changePassword(String email,String password);


}
