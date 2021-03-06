/**
* <p> * Title: 商城管理信息系统 *</p>
* <p> * Description: * </p>
* <p> * Copyright: Copyright (c) 2012-2017* </p>
* <p> * Company: 苏州明翔信息科技有限公司 * </p>
* @author 叶明（开发）
* @version 0.1
*/
package cn.javaworker.yeming.ukeli.service;


import java.util.List;

import cn.javaworker.yeming.core.jdbc.service.BaseService;
import cn.javaworker.yeming.ukeli.pojo.SubjectDo;
import cn.javaworker.yeming.ukeli.pojo.UserDo;
import cn.javaworker.yeming.ukeli.pojo.UserSubjectDo;
import cn.javaworker.yeming.pojo.Page;

/**
* 创建日期：2017-10-24 10:41:59
* 开发者：叶明(MSN:guming123416@hotmail.com,QQ:47043760)
* 修改者：
* 修改时间：
* 程序作用：
* 1、
* 2、
* 修改说明：
* 1、
* 2、
* 版本：@version 0.1
* @author 叶明
*/
public interface UserSubjectService extends BaseService<UserSubjectDo>{

	/**
	 * 获取分页
	 * @param keyword  关键字
	 * @param status 状态
	 * @param slock 锁定标志
	 * @param start 开始数量
	 * @param limit 获取数量
	 * @return
	 */
	//Page<UserSubjectDo> getPage(String keyword,int status,int slock,long start, int limit);
	
	
	/**
	 * 排序使用
	 * @param id
	 * @param type
	 * @return
	 */
	UserSubjectDo getByOrderType(long iorder, int type);
	/**
	 * 处理排序
	 * @param usersubjectDo
	 * @param vusersubjectDo
	 */
	void order(UserSubjectDo usersubjectDo,UserSubjectDo vusersubjectDo);
	
	UserSubjectDo addUsersubject(UserDo user, SubjectDo subject,int type,String isdown);

	UserSubjectDo getUsersubject(long userid, long subjectid);


	List<UserSubjectDo> getListByItem(String itemName, Object itemValue);


	Page<UserSubjectDo> getPage(String username, String subjectname, String isdone, String isadd, int status, int slock,
			long start, int limit);
}