package com.entity.view;

import com.entity.XuexipeixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学习培训
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-29 17:16:24
 */
@TableName("xuexipeixun")
public class XuexipeixunView  extends XuexipeixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuexipeixunView(){
	}
 
 	public XuexipeixunView(XuexipeixunEntity xuexipeixunEntity){
 	try {
			BeanUtils.copyProperties(this, xuexipeixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
