package com.entity.model;

import com.entity.XuexipeixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 学习培训
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-12-29 17:16:24
 */
public class XuexipeixunModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 培训项目
	 */
	
	private String peixunxiangmu;
		
	/**
	 * 培训对象
	 */
	
	private String peixunduixiang;
		
	/**
	 * 培训内容
	 */
	
	private String peixunneirong;
		
	/**
	 * 培训时间
	 */
	
	private String peixunshijian;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
	/**
	 * 设置：培训项目
	 */
	 
	public void setPeixunxiangmu(String peixunxiangmu) {
		this.peixunxiangmu = peixunxiangmu;
	}
	
	/**
	 * 获取：培训项目
	 */
	public String getPeixunxiangmu() {
		return peixunxiangmu;
	}
				
	
	/**
	 * 设置：培训对象
	 */
	 
	public void setPeixunduixiang(String peixunduixiang) {
		this.peixunduixiang = peixunduixiang;
	}
	
	/**
	 * 获取：培训对象
	 */
	public String getPeixunduixiang() {
		return peixunduixiang;
	}
				
	
	/**
	 * 设置：培训内容
	 */
	 
	public void setPeixunneirong(String peixunneirong) {
		this.peixunneirong = peixunneirong;
	}
	
	/**
	 * 获取：培训内容
	 */
	public String getPeixunneirong() {
		return peixunneirong;
	}
				
	
	/**
	 * 设置：培训时间
	 */
	 
	public void setPeixunshijian(String peixunshijian) {
		this.peixunshijian = peixunshijian;
	}
	
	/**
	 * 获取：培训时间
	 */
	public String getPeixunshijian() {
		return peixunshijian;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
			
}
