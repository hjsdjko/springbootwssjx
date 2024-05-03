package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PutongcunminEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PutongcunminVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PutongcunminView;


/**
 * 普通村民
 *
 * @author 
 * @email 
 * @date 2020-12-29 17:16:24
 */
public interface PutongcunminService extends IService<PutongcunminEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PutongcunminVO> selectListVO(Wrapper<PutongcunminEntity> wrapper);
   	
   	PutongcunminVO selectVO(@Param("ew") Wrapper<PutongcunminEntity> wrapper);
   	
   	List<PutongcunminView> selectListView(Wrapper<PutongcunminEntity> wrapper);
   	
   	PutongcunminView selectView(@Param("ew") Wrapper<PutongcunminEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PutongcunminEntity> wrapper);
   	
}

