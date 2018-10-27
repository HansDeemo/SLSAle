package org.slsale.service.user;

import javax.annotation.Resource;

import org.slsale.dao.user.UserMapper;
import org.slsale.pojo.user.User;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImple implements UserService{

	@Resource
	private UserMapper userMapper;
	public int addUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.addUser(user);
	}

	public User getLoginUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.getLoginUser(user);
	}

}
