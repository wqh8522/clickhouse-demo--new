package cn.com.clickhouse.service.imp;

import cn.com.clickhouse.mapper.UserMappper;
import cn.com.clickhouse.pojo.Users;
import cn.com.clickhouse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wanqh29264
 * @version TODO
 * @date 2020/11/9 16:57
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMappper userMappper;


	@Override
	public int countUsers() {
		return userMappper.countUsers();
	}

	@Override
	public List<Users> selctUserList() {
		return userMappper.selctUserList();
	}
}
