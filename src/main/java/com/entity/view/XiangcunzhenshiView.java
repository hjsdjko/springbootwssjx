package com.entity.view;

import com.entity.XiangcunzhenshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 乡村诊室
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-29 17:16:24
 */
@TableName("xiangcunzhenshi")
public class XiangcunzhenshiView  extends XiangcunzhenshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiangcunzhenshiView(){
	}
 
 	public XiangcunzhenshiView(XiangcunzhenshiEntity xiangcunzhenshiEntity){
 	try {
			BeanUtils.copyProperties(this, xiangcunzhenshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
