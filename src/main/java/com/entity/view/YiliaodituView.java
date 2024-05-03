package com.entity.view;

import com.entity.YiliaodituEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 医疗地图
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-29 17:16:24
 */
@TableName("yiliaoditu")
public class YiliaodituView  extends YiliaodituEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YiliaodituView(){
	}
 
 	public YiliaodituView(YiliaodituEntity yiliaodituEntity){
 	try {
			BeanUtils.copyProperties(this, yiliaodituEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
