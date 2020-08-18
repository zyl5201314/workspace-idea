package com.ytc.mapper;

import com.ytc.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	/** <pre>queryUserList(这里用一句话描述这个方法的作用)   
	 * 创建人：zyl    
	 * 创建时间：2020年8月10日 下午12:33:27    
	 * 修改人：zyl     
	 * 修改时间：2020年8月10日 下午12:33:27    
	 * 修改备注： 
	 * @param j 
	 * @param i 
	 * @param user 
	 * @return</pre>    
	 */
	List<User> queryUserList(@Param("start") int i, @Param("pagesize") int j, @Param("user") User user);

	/** <pre>addUSer(这里用一句话描述这个方法的作用)   
	 * 创建人：zyl    
	 * 创建时间：2020年8月11日 上午9:23:41    
	 * 修改人：zyl     
	 * 修改时间：2020年8月11日 上午9:23:41    
	 * 修改备注： 
	 * @param user</pre>    
	 */
	void addUSer(User user);

	/** <pre>queryCount(这里用一句话描述这个方法的作用)   
	 * 创建人：zyl    
	 * 创建时间：2020年8月11日 上午9:32:12    
	 * 修改人：zyl     
	 * 修改时间：2020年8月11日 上午9:32:12    
	 * 修改备注： 
	 * @param user 
	 * @return</pre>    
	 */
	long queryCount(@Param("user") User user);

	/** <pre>queryUser(这里用一句话描述这个方法的作用)   
	 * 创建人：zyl    
	 * 创建时间：2020年8月12日 上午11:10:29    
	 * 修改人：zyl     
	 * 修改时间：2020年8月12日 上午11:10:29    
	 * 修改备注： 
	 * @return</pre>    
	 */
	List<User> queryUser();

	/** <pre>queryUserById(这里用一句话描述这个方法的作用)   
	 * 创建人：zyl    
	 * 创建时间：2020年8月13日 上午9:59:48    
	 * 修改人：zyl     
	 * 修改时间：2020年8月13日 上午9:59:48    
	 * 修改备注： 
	 * @param userid
	 * @return</pre>    
	 */
	User queryUserById(@Param("userid") Integer userid);
}