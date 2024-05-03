package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiliaoyaopinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiliaoyaopinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiliaoyaopinView;


/**
 * 医疗药品
 *
 * @author 
 * @email 
 * @date 2020-12-29 17:16:24
 */
public interface YiliaoyaopinService extends IService<YiliaoyaopinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiliaoyaopinVO> selectListVO(Wrapper<YiliaoyaopinEntity> wrapper);
   	
   	YiliaoyaopinVO selectVO(@Param("ew") Wrapper<YiliaoyaopinEntity> wrapper);
   	
   	List<YiliaoyaopinView> selectListView(Wrapper<YiliaoyaopinEntity> wrapper);
   	
   	YiliaoyaopinView selectView(@Param("ew") Wrapper<YiliaoyaopinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiliaoyaopinEntity> wrapper);
   	
}

