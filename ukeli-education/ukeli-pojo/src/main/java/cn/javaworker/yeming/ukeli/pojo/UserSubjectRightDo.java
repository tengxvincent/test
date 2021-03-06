/**
* <p> * Title: 商城管理信息系统 *</p>
* <p> * Description: * </p>
* <p> * Copyright: Copyright (c) 2012-2017* </p>
* <p> * Company: 苏州明翔信息科技有限公司 * </p>
* @author 叶明（开发）
* @version 0.1
*/
package cn.javaworker.yeming.ukeli.pojo;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import cn.javaworker.yeming.pojo.BaseTableEntry;
/**
* 创建日期：2017-09-12 02:28:25
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
@SuppressWarnings("serial")
@JsonIgnoreProperties({"adderid","adder","editer","editerid","addtime"})
public class UserSubjectRightDo  extends BaseTableEntry implements Serializable {				//
	
	private Long userid;   //用户编号|1|1|1
	private Long subjectid;   //例题编号|1|1|1
	private Integer vtype;   //题目类别|1|1|1|1 例题 2 课堂联系 3 自测卷  4 杯赛试题  5 考试试题
	private String isanswer;   //是否答题|1|1|1|0 未回答  1 已经回答
	private String iswrong;   //是否错误|1|1|1| 0 正确  1 错误1
	private String ext_userName;
	private String ext_subjectName;

	public UserSubjectRightDo(){}

	public UserSubjectRightDo(Long id,Long userid,Long subjectid,Integer vtype,String isanswer,String iswrong,Long iorder,Short status,Long adderid,String adder,String editer,Long editerid,String remark1,String remark2,Date addtime,Date edittime,Short slock){
		this.id=id;
		this.userid=userid;
		this.subjectid=subjectid;
		this.vtype=vtype;
		this.isanswer=isanswer;
		this.iswrong=iswrong;
		this.iorder=iorder;
		this.status=status;
		this.adderid=adderid;
		this.adder=adder;
		this.editer=editer;
		this.editerid=editerid;
		this.remark1=remark1;
		this.remark2=remark2;
		this.addtime=addtime;
		this.edittime=edittime;
		this.slock=slock;
	}

	/**
	 * 获取表名称
	 * @return
	 */
	public static String getTable() {
		return "t_user_subject_right";
	}

	/**
	* @return the userid
	*/
	public Long getUserid(){
		return userid;
	}

	/**
	* @param userid the userid to set
	*/
	public void setUserid(Long userid){
		this.userid = userid;
	}
	/**
	* @return the subjectid
	*/
	public Long getSubjectid(){
		return subjectid;
	}

	/**
	* @param subjectid the subjectid to set
	*/
	public void setSubjectid(Long subjectid){
		this.subjectid = subjectid;
	}
	/**
	* @return the vtype
	*/
	public Integer getVtype(){
		return vtype;
	}

	/**
	* @param vtype the vtype to set
	*/
	public void setVtype(Integer vtype){
		this.vtype = vtype;
	}
	/**
	* @return the isanswer
	*/
	public String getIsanswer(){
		return isanswer;
	}

	/**
	* @param isanswer the isanswer to set
	*/
	public void setIsanswer(String isanswer){
		this.isanswer = StringUtils.trim(isanswer);
	}
	/**
	* @return the iswrong
	*/
	public String getIswrong(){
		return iswrong;
	}

	/**
	* @param iswrong the iswrong to set
	*/
	public void setIswrong(String iswrong){
		this.iswrong = StringUtils.trim(iswrong);
	}
	
	
	
    public String getExt_userName() {
		return ext_userName;
	}

	public void setExt_userName(String ext_userName) {
		this.ext_userName = ext_userName;
	}

	public String getExt_subjectName() {
		return ext_subjectName;
	}

	public void setExt_subjectName(String ext_subjectName) {
		this.ext_subjectName = ext_subjectName;
	}

	/* (non-Javadoc)
    * @see cn.javaworker.yeming.pojo.Entry#hashCode()
    */
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, false);
	}

	/* (non-Javadoc)
	* @see cn.javaworker.yeming.pojo.Entry#equals(java.lang.Object)
	*/
	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj, false);
	}
}