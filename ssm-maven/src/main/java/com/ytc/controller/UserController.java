package com.ytc.controller;



import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.ytc.model.User;
import com.ytc.service.UserService;
import com.ytc.util.CheckImgUtil;
import com.ytc.util.Common;
import com.ytc.util.PageUtil;

@Controller
@RequestMapping("/user")
public class UserController {
	
    @Autowired
	private UserService userService;
    
    @Autowired
    private RedisTemplate<String, String> redisTemplete;
    
    @RequestMapping("index")
    public String toIndex(){
    	
    	return "index";
    }
    
    @RequestMapping("addRedis")
    public String addRedis(){
    	//存储string类型
    	//redisTemplete.opsForValue().set("addRedis", "张三");
    	/*String string = redisTemplete.opsForValue().get("addRedis");
    	System.out.println(string);*/
//    	String value = redisTemplete.opsForValue().get(key);
    	//判断当前的key是否在redis中存在
    	/*if(!(redisTemplete.hasKey(Common.REDISKEY))){
    		List<User> list = userService.queryUser();
    		JSONObject json =new JSONObject();
    		String jsStr = json.toJSONStringWithDateFormat(list, "yyyy-mm-dd");
    		redisTemplete.opsForValue().set(Common.REDISKEY, jsStr,30,TimeUnit.MINUTES);
    		
    	}else{
    		String values = redisTemplete.opsForValue().get(Common.REDISKEY);
    		System.out.println(values);
    	}*/
    	//往redis中存储hash类型
    	/*if(!(redisTemplete.hasKey(Common.REDISKEYUSER))){
    		User user =new User();
        	user.setUserbir("1999-11-11");
        	user.setUserid(1);
        	user.setUsername("zhaoliu");
        	user.setUserpassword("12345");
        	user.setUserprice(1000.0);
        	Map<String ,Object> hash =new HashMap<String,Object>();
        	hash.put("username", user.getUsername());
        	hash.put("userid", user.getUserid());
        	hash.put("userbir", user.getUserbir());
        	hash.put("userpassword", user.getUserpassword());
        	hash.put("userprice", user.getUserprice());
        	//redisTemplete.opsForHash().put("user", "username",user.getUsername());
        	redisTemplete.opsForHash().putAll("user", hash);
    	}else{
    		Map<Object, Object> entries = redisTemplete.opsForHash().entries(Common.REDISKEYUSER);
    		Set<Object> keySet = entries.keySet();
    		Iterator<Object> iterator = keySet.iterator();
    		while(iterator.hasNext()){
    			Object next = iterator.next();
    			System.out.println(next);
    			System.out.println(entries.get(next));
    		}
    		Set<Entry<Object, Object>> entrySet = entries.entrySet();
    		Iterator<Entry<Object, Object>> iterator = entrySet.iterator();
    	    while (iterator.hasNext()) {
    	    	Map.Entry en=(Entry) iterator.next();
    			System.out.println("key:"+en.getKey()+",value:"+en.getValue());

			}
    	   
    	}*/
    	
    	  redisTemplete.opsForValue().set("a", "1");
    	  redisTemplete.opsForValue().set("a", "2");
    	  String string = redisTemplete.opsForValue().get("a");
    	  System.out.println(string);
    	 //redisTemplete.opsForList().leftPush("list", "1");
//    	 redisTemplete.opsForSet()
//    	 redisTemplete.opsForZSet()
    	
    	return "success";
    }
    
    @RequestMapping("queryUserList")
    public String queryUserList(Model model,PageUtil<User> page,User user){
    	/*List<User> list=userService.queryUserList();*/
    	page=userService.queryUserList(page,user);
    	
    	model.addAttribute("page", page);
    	return "list";
    }
    
    @RequestMapping("addUSer")
    @ResponseBody
    public void addUSer(User user){
    	redisTemplete.delete(Common.REDISKEY);
    	userService.addUSer(user);
    }
    /**
     * <pre>imgCode(验证码)   
     * 创建人：zyl    
     * 创建时间：2020年8月13日 上午9:16:54    
     * 修改人：zyl     
     * 修改时间：2020年8月13日 上午9:16:54    
     * 修改备注： 
     * @param request
     * @param response
     * @return
     * @throws Exception</pre>
     */
    @RequestMapping("imgCode")
	@ResponseBody	
	public String imgCode(HttpServletRequest request,HttpServletResponse response) throws Exception{
    	String checkImg = CheckImgUtil.checkImg(request, response);
    	HttpSession session = request.getSession();
    	String attribute = (String) session.getAttribute("checkcode");
    	redisTemplete.opsForValue().set(Common.CHECKCODE, attribute,20,TimeUnit.SECONDS);
    	String string = redisTemplete.opsForValue().get(Common.CHECKCODE);
    	System.out.println(string);
//    	System.out.println(checkImg);
    	return checkImg;
	}
    /**
     * <pre>login(登录)   
     * 创建人：zyl    
     * 创建时间：2020年8月13日 上午9:33:06    
     * 修改人：zyl     
     * 修改时间：2020年8月13日 上午9:33:06    
     * 修改备注： 
     * @param user
     * @param imgcode
     * @return</pre>
     */
    @RequestMapping("login")
    @ResponseBody
    public String login(User user,String imgcode){
    	String code = redisTemplete.opsForValue().get(Common.CHECKCODE);
    	if(code ==null){
    		return "1";
    	}else{
    		if(imgcode.equals(code)){
    			return "2";
    		}else{
    			return "3";
    		}
    	}
    	
    }
    /**
     * <pre>queryUser(查询缓存)   
     * 创建人：zyl    
     * 创建时间：2020年8月13日 上午9:42:18    
     * 修改人：zyl     
     * 修改时间：2020年8月13日 上午9:42:18    
     * 修改备注： 
     * @return</pre>
     */
    @RequestMapping("queryUser")
    public String queryUser(Model model){
      
    	List<User> queryUser = userService.queryUser();
    	if(!(redisTemplete.hasKey(Common.REDISKEY))){
    		//数据库查询的结果
    		//把结果转化成json字符串
    		JSONObject json =new JSONObject();
    		String jsonstr = json.toJSONStringWithDateFormat(queryUser, "yyyy-mm-dd");
    		redisTemplete.opsForValue().set(Common.REDISKEY, jsonstr);
    	}else{
    		String string = redisTemplete.opsForValue().get(Common.REDISKEY);
    		/*JSONObject json =new JSONObject();
    		JSONObject parse =  json.parseObject(string);*/
    		System.out.println(string);
    	}
    	model.addAttribute("list", queryUser);
    	
    	
    	
    	return "list";
    }
    
    /**
     * <pre>queryUserById(修改)   
     * 创建人：zyl    
     * 创建时间：2020年8月13日 上午9:57:36    
     * 修改人：zyl     
     * 修改时间：2020年8月13日 上午9:57:36    
     * 修改备注： 
     * @return</pre>
     */
    @RequestMapping("queryUserById")
    public String queryUserById(Model model,Integer userid){
         String key =Common.REDISKEYUSER+userid;
    	if(!(redisTemplete.hasKey(key))){
    		User user = userService.queryUserById(userid);
    		Map<String ,Object> map =new HashMap<String ,Object>();
    		map.put("userid", user.getUserid());
    		map.put("username", user.getUsername());
    		map.put("userpassword", user.getUserpassword());
    		map.put("userbir", user.getUserbir());
    		map.put("userprice", user.getUserprice());
    		//把map存储到redis中
    		redisTemplete.opsForHash().putAll(key, map);
    		model.addAttribute("user", user);
    	}else{
    		User user =new User();
    		Map<Object, Object> entries = redisTemplete.opsForHash().entries(key);
    		Set<Object> keySet = entries.keySet();
    		Iterator<Object> iterator = keySet.iterator();
    		while(iterator.hasNext()){
    			Object next = iterator.next();
    			if(next.equals("userid")){
    				user.setUserid(Integer.parseInt(entries.get(next).toString()));
    			}
    			if(next.equals("username")){
    				user.setUsername(entries.get(next).toString());
    			}
    			if(next.equals("userpassword")){
    				user.setUserpassword(entries.get(next).toString());
    			}
    			if(next.equals("userbir")){
    				user.setUserbir(entries.get(next).toString());
    			}
    			if(next.equals("userprice")){
    				user.setUserprice(Double.parseDouble(entries.get(next).toString()));
    			}
    		}
    		model.addAttribute("user", user);
    	
    	}
    	
    	return "update";
    }
    
    
}
