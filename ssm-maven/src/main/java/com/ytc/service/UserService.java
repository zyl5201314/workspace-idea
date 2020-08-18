/** 
 * <pre>项目名称:ssm-maven 
 * 文件名称:UserService.java 
 * 包名:com.ytc.service 
 * 创建日期:2020年8月10日下午12:20:00 
 * Copyright (c) 2020,  All Rights Reserved.</pre> 
 */  
package com.ytc.service;

import com.ytc.model.User;
import com.ytc.util.PageUtil;

import java.util.List;

/** 
 * <pre>项目名称：ssm-maven    
 * 类名称：UserService    
 * 类描述：    
 * 创建人：zyl   
 * 创建时间：2020年8月10日 下午12:20:00    
 * 修改人：zyl 
 * 修改时间：2020年8月10日 下午12:20:00    
 * 修改备注：       
 * @version </pre>    
 */
public interface UserService {

	/** <pre>queryUserList(这里用一句话描述这个方法的作用)   
	 * 创建人：zyl    
	 * 创建时间：2020年8月10日 下午12:33:12    
	 * 修改人：zyl     
	 * 修改时间：2020年8月10日 下午12:33:12    
	 * 修改备注： 
	 * @param page 
	 * @param user 
	 * @return</pre>    
	 */
	PageUtil<User> queryUserList(PageUtil<User> page, User user);

	/** <pre>addUSer(这里用一句话描述这个方法的作用)   
	 * 创建人：zyl    
	 * 创建时间：2020年8月11日 上午9:23:19    
	 * 修改人：zyl     
	 * 修改时间：2020年8月11日 上午9:23:19    
	 * 修改备注： 
	 * @param user</pre>    
	 */
	void addUSer(User user);

	/** <pre>queryUser(这里用一句话描述这个方法的作用)   
	 * 创建人：zyl    
	 * 创建时间：2020年8月12日 上午11:10:06    
	 * 修改人：zyl     
	 * 修改时间：2020年8月12日 上午11:10:06    
	 * 修改备注： 
	 * @return</pre>    
	 */
	List<User> queryUser();

	/** <pre>queryUserById(这里用一句话描述这个方法的作用)   
	 * 创建人：zyl    
	 * 创建时间：2020年8月13日 上午9:59:25    
	 * 修改人：zyl     
	 * 修改时间：2020年8月13日 上午9:59:25    
	 * 修改备注： 
	 * @param userid
	 * @return</pre>    
	 */
	User queryUserById(Integer userid);

}
