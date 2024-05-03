package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaohexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaohexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaohexinxiView;


/**
 * 考核信息
 *
 * @author 
 * @email 
 * @date 2020-12-29 17:16:24
 */
public interface KaohexinxiService extends IService<KaohexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaohexinxiVO> selectListVO(Wrapper<KaohexinxiEntity> wrapper);
   	
   	KaohexinxiVO selectVO(@Param("ew") Wrapper<KaohexinxiEntity> wrapper);
   	
   	List<KaohexinxiView> selectListView(Wrapper<KaohexinxiEntity> wrapper);
   	
   	KaohexinxiView selectView(@Param("ew") Wrapper<KaohexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaohexinxiEntity> wrapper);
   	
}

