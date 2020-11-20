package cn.com.clickhouse.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author wanqh29264
 * @version TODO
 * @date 2020/11/9 16:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Users {

	private String id;
	private String name;
	private Integer age;
}
