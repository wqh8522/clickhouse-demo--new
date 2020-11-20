package cn.com.clickhouse.service;

import cn.com.clickhouse.pojo.Users;

import java.util.List;

/**
 * @author wanqh29264
 * @version TODO
 * @date 2020/11/9 16:57
 */
public interface UserService {


	int countUsers();

	List<Users> selctUserList();
}
