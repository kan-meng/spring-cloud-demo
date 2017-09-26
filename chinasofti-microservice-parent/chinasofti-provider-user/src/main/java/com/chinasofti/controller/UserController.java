package com.chinasofti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasofti.pojo.User;
import com.chinasofti.service.UserService;



@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "你好";
	}

	// 查询用户
	@RequestMapping("queryUser")
	public String queryUser(ModelMap map) {
		 List<User> userList = userService.findUser();
		 map.put("userList", userList);
		 return "index";	 
	}

	// 添加一个用户
	@RequestMapping("addUser")
	@ResponseBody
	public String addUser() {
		String result = "";
		User user = new User();
		user.setUsername("小明");
		user.setPassword("1111");
		user.setAge(10);
		int row = userService.addUser(user);
		if (row > 0) {
			result = "添加成功";
		} else {
			result = "添加失败";
		}
		return result;
	}
	// 修改一个用户
	@RequestMapping("update")
	@ResponseBody
	public String updateUser() {
		String result = "";
		User user = new User();
		user.setId(4);
		user.setUsername("大明");
		user.setPassword("2222");
		user.setAge(10);
		int row = userService.updateUser(user);
		if (row > 0) {
			result = "更新成功";
		} else {
			result = "更新失败";
		}
		return result;
	}
	// 根据id删除一个用户
		@RequestMapping("deleteUser/{id}")
		@ResponseBody
		public String deleteUser(@PathVariable Integer id) {
			String result = "";
			int row = userService.deleteUser(id);
			if (row > 0) {
				result = "删除成功";
			} else {
				result = "删除失败";
			}
			return result;
		}
}
