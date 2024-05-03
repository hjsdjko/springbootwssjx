package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangcunzhenshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangcunzhenshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangcunzhenshiView;


/**
 * 乡村诊室
 *
 * @author 
 * @email 
 * @date 2020-12-29 17:16:24
 */
public interface XiangcunzhenshiService extends IService<XiangcunzhenshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangcunzhenshiVO> selectListVO(Wrapper<XiangcunzhenshiEntity> wrapper);
   	
   	XiangcunzhenshiVO selectVO(@Param("ew") Wrapper<XiangcunzhenshiEntity> wrapper);
   	
   	List<XiangcunzhenshiView> selectListView(Wrapper<XiangcunzhenshiEntity> wrapper);
   	
   	XiangcunzhenshiView selectView(@Param("ew") Wrapper<XiangcunzhenshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangcunzhenshiEntity> wrapper);
   	
}

