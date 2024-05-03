package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JinjishiguEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JinjishiguVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JinjishiguView;


/**
 * 紧急事故
 *
 * @author 
 * @email 
 * @date 2020-12-29 17:16:24
 */
public interface JinjishiguService extends IService<JinjishiguEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JinjishiguVO> selectListVO(Wrapper<JinjishiguEntity> wrapper);
   	
   	JinjishiguVO selectVO(@Param("ew") Wrapper<JinjishiguEntity> wrapper);
   	
   	List<JinjishiguView> selectListView(Wrapper<JinjishiguEntity> wrapper);
   	
   	JinjishiguView selectView(@Param("ew") Wrapper<JinjishiguEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JinjishiguEntity> wrapper);
   	
}

