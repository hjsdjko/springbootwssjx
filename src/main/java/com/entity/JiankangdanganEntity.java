package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 健康档案
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-29 17:16:24
 */
@TableName("jiankangdangan")
public class JiankangdanganEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiankangdanganEntity() {
		
	}
	
	public JiankangdanganEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 档案编号
	 */
					
	private String danganbianhao;
	
	/**
	 * 档案名称
	 */
					
	private String danganmingcheng;
	
	/**
	 * 档案类型
	 */
					
	private String danganleixing;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 目前状况
	 */
					
	private String muqianzhuangkuang;
	
	/**
	 * 病史
	 */
					
	private String bingshi;
	
	/**
	 * 就诊医院
	 */
					
	private String jiuzhenyiyuan;
	
	/**
	 * 档案文件
	 */
					
	private String danganwenjian;
	
	/**
	 * 日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：档案编号
	 */
	public void setDanganbianhao(String danganbianhao) {
		this.danganbianhao = danganbianhao;
	}
	/**
	 * 获取：档案编号
	 */
	public String getDanganbianhao() {
		return danganbianhao;
	}
	/**
	 * 设置：档案名称
	 */
	public void setDanganmingcheng(String danganmingcheng) {
		this.danganmingcheng = danganmingcheng;
	}
	/**
	 * 获取：档案名称
	 */
	public String getDanganmingcheng() {
		return danganmingcheng;
	}
	/**
	 * 设置：档案类型
	 */
	public void setDanganleixing(String danganleixing) {
		this.danganleixing = danganleixing;
	}
	/**
	 * 获取：档案类型
	 */
	public String getDanganleixing() {
		return danganleixing;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：目前状况
	 */
	public void setMuqianzhuangkuang(String muqianzhuangkuang) {
		this.muqianzhuangkuang = muqianzhuangkuang;
	}
	/**
	 * 获取：目前状况
	 */
	public String getMuqianzhuangkuang() {
		return muqianzhuangkuang;
	}
	/**
	 * 设置：病史
	 */
	public void setBingshi(String bingshi) {
		this.bingshi = bingshi;
	}
	/**
	 * 获取：病史
	 */
	public String getBingshi() {
		return bingshi;
	}
	/**
	 * 设置：就诊医院
	 */
	public void setJiuzhenyiyuan(String jiuzhenyiyuan) {
		this.jiuzhenyiyuan = jiuzhenyiyuan;
	}
	/**
	 * 获取：就诊医院
	 */
	public String getJiuzhenyiyuan() {
		return jiuzhenyiyuan;
	}
	/**
	 * 设置：档案文件
	 */
	public void setDanganwenjian(String danganwenjian) {
		this.danganwenjian = danganwenjian;
	}
	/**
	 * 获取：档案文件
	 */
	public String getDanganwenjian() {
		return danganwenjian;
	}
	/**
	 * 设置：日期
	 */
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}

}
