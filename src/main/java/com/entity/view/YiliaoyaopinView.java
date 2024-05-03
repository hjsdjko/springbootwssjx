package com.entity.view;

import com.entity.YiliaoyaopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 医疗药品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-29 17:16:24
 */
@TableName("yiliaoyaopin")
public class YiliaoyaopinView  extends YiliaoyaopinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YiliaoyaopinView(){
	}
 
 	public YiliaoyaopinView(YiliaoyaopinEntity yiliaoyaopinEntity){
 	try {
			BeanUtils.copyProperties(this, yiliaoyaopinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
