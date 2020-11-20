package cn.com.clickhouse.controller;

import cn.com.clickhouse.pojo.Users;
import cn.com.clickhouse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wanqh29264
 * @version TODO
 * @date 2020/11/9 16:59
 */
@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/countUsers")
	public int countUsers() {
		return userService.countUsers();
	}

	@GetMapping("/selctUserList")
	public List<Users> selctUserList() {
		return userService.selctUserList();
	}

}
