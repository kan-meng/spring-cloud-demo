package com.chinasofti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.mapper.UserMapper;
import com.chinasofti.pojo.User;
import com.chinasofti.pojo.UserExample;

@Service
// @Transactional
public class UserService {

	@Autowired
	private UserMapper userMapper;

	// 查
	public List<User> findUser() {
		UserExample userExample = new UserExample();
		return userMapper.selectByExample(userExample);
	}

	// 增
	public int addUser(User user) {
		return userMapper.insertSelective(user);
	}

	// 改
	public int updateUser(User user) {
		UserExample userExample = new UserExample();
		return userMapper.updateByExampleSelective(user, userExample);
	}

	// 删
	public int deleteUser(Integer id) {
		UserExample userExample = new UserExample();
		userExample.createCriteria().andIdEqualTo(id);
		return userMapper.deleteByExample(userExample);
	}

}
