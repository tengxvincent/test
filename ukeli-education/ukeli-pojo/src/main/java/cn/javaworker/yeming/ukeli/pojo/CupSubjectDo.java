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

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import cn.javaworker.yeming.pojo.BaseTableEntry;
/**
* 创建日期：2017-09-08 02:05:56
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
public class CupSubjectDo  extends BaseTableEntry implements Serializable {				//
	
	private Long cupid;   //杯赛编号|1|1|1
	private Long subjectid;   //试题编号|1|1|1
	private Integer serial;   //序号
	private Integer score; //分数

	public CupSubjectDo(){}

	public CupSubjectDo(Long id,Long cupid,Long subjectid,Integer serial,Integer score,Long iorder,Short status,Long adderid,String adder,String editer,Long editerid,String remark1,String remark2,Date addtime,Date edittime,Short slock){
		this.id=id;
		this.cupid=cupid;
		this.subjectid=subjectid;
		this.serial=serial;
		this.score=score;
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
		return "t_cup_subject";
	}

	/**
	* @return the cupid
	*/
	public Long getCupid(){
		return cupid;
	}

	/**
	* @param cupid the cupid to set
	*/
	public void setCupid(Long cupid){
		this.cupid = cupid;
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
	* @return the serial
	*/
	public Integer getSerial(){
		return serial;
	}

	/**
	* @param serial the serial to set
	*/
	public void setSerial(Integer serial){
		this.serial = serial;
	}
	
	
    public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
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