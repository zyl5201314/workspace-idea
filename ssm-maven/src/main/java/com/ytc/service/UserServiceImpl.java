/** 
 * <pre>项目名称:ssm-maven 
 * 文件名称:UserServiceImpl.java 
 * 包名:com.ytc.service 
 * 创建日期:2020年8月10日下午12:20:11 
 * Copyright (c) 2020,  All Rights Reserved.</pre> 
 */  
package com.ytc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ytc.mapper.UserMapper;
import com.ytc.model.User;
import com.ytc.util.PageUtil;

/** 
 * <pre>项目名称：ssm-maven    
 * 类名称：UserServiceImpl    
 * 类描述：    
 * 创建人：zyl   
 * 创建时间：2020年8月10日 下午12:20:11    
 * 修改人：zyl 
 * 修改时间：2020年8月10日 下午12:20:11    
 * 修改备注：       
 * @version </pre>    
 */

@Service
public class UserServiceImpl implements UserService{


	@Autowired
	private UserMapper userMapper;

	/* (non-Javadoc)    
	 * @see com.ytc.service.UserService#queryUserList()    
	 */
	@Override
	public PageUtil<User> queryUserList(PageUtil<User> page,User user) {
		
		long count = userMapper.queryCount(user);
		
		
		page  = new PageUtil<User>(page.getCpage(),count,page.getPageSize());
		
		List<User> list=userMapper.queryUserList(page.getStart(),page.getPageSize(),user);
		
		page.setList(list);
		return page;
	}

	/* (non-Javadoc)    
	 * @see com.ytc.service.UserService#addUSer(com.ytc.model.User)    
	 */
	@Override
	public void addUSer(User user) {
		userMapper.addUSer(user);
	}

	/* (non-Javadoc)    
	 * @see com.ytc.service.UserService#queryUser()    
	 */
	@Override
	public List<User> queryUser() {
		return userMapper.queryUser();
	}

	/* (non-Javadoc)    
	 * @see com.ytc.service.UserService#queryUserById(java.lang.Integer)    
	 */
	@Override
	public User queryUserById(Integer userid) {
		return userMapper.queryUserById(userid);
	}
}
