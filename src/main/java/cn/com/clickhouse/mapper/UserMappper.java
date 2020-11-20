package cn.com.clickhouse.mapper;

import cn.com.clickhouse.pojo.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wanqh29264
 * @version TODO
 * @date 2020/11/9 16:54
 */
@Mapper
public interface UserMappper {

	int countUsers();

	List<Users> selctUserList();
}
