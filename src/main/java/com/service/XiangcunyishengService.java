package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangcunyishengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangcunyishengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangcunyishengView;


/**
 * 乡村医生
 *
 * @author 
 * @email 
 * @date 2020-12-29 17:16:24
 */
public interface XiangcunyishengService extends IService<XiangcunyishengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangcunyishengVO> selectListVO(Wrapper<XiangcunyishengEntity> wrapper);
   	
   	XiangcunyishengVO selectVO(@Param("ew") Wrapper<XiangcunyishengEntity> wrapper);
   	
   	List<XiangcunyishengView> selectListView(Wrapper<XiangcunyishengEntity> wrapper);
   	
   	XiangcunyishengView selectView(@Param("ew") Wrapper<XiangcunyishengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangcunyishengEntity> wrapper);
   	
}

