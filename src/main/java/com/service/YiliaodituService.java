package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiliaodituEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiliaodituVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiliaodituView;


/**
 * 医疗地图
 *
 * @author 
 * @email 
 * @date 2020-12-29 17:16:24
 */
public interface YiliaodituService extends IService<YiliaodituEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiliaodituVO> selectListVO(Wrapper<YiliaodituEntity> wrapper);
   	
   	YiliaodituVO selectVO(@Param("ew") Wrapper<YiliaodituEntity> wrapper);
   	
   	List<YiliaodituView> selectListView(Wrapper<YiliaodituEntity> wrapper);
   	
   	YiliaodituView selectView(@Param("ew") Wrapper<YiliaodituEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiliaodituEntity> wrapper);
   	
}

