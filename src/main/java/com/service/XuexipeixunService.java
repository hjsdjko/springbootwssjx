package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexipeixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexipeixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexipeixunView;


/**
 * 学习培训
 *
 * @author 
 * @email 
 * @date 2020-12-29 17:16:24
 */
public interface XuexipeixunService extends IService<XuexipeixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexipeixunVO> selectListVO(Wrapper<XuexipeixunEntity> wrapper);
   	
   	XuexipeixunVO selectVO(@Param("ew") Wrapper<XuexipeixunEntity> wrapper);
   	
   	List<XuexipeixunView> selectListView(Wrapper<XuexipeixunEntity> wrapper);
   	
   	XuexipeixunView selectView(@Param("ew") Wrapper<XuexipeixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexipeixunEntity> wrapper);
   	
}

