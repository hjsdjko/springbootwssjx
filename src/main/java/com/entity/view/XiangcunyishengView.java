package com.entity.view;

import com.entity.XiangcunyishengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 乡村医生
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-29 17:16:24
 */
@TableName("xiangcunyisheng")
public class XiangcunyishengView  extends XiangcunyishengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiangcunyishengView(){
	}
 
 	public XiangcunyishengView(XiangcunyishengEntity xiangcunyishengEntity){
 	try {
			BeanUtils.copyProperties(this, xiangcunyishengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
