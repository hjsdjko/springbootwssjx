package com.dao;

import com.entity.YiliaoyaopinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiliaoyaopinVO;
import com.entity.view.YiliaoyaopinView;


/**
 * 医疗药品
 * 
 * @author 
 * @email 
 * @date 2020-12-29 17:16:24
 */
public interface YiliaoyaopinDao extends BaseMapper<YiliaoyaopinEntity> {
	
	List<YiliaoyaopinVO> selectListVO(@Param("ew") Wrapper<YiliaoyaopinEntity> wrapper);
	
	YiliaoyaopinVO selectVO(@Param("ew") Wrapper<YiliaoyaopinEntity> wrapper);
	
	List<YiliaoyaopinView> selectListView(@Param("ew") Wrapper<YiliaoyaopinEntity> wrapper);

	List<YiliaoyaopinView> selectListView(Pagination page,@Param("ew") Wrapper<YiliaoyaopinEntity> wrapper);
	
	YiliaoyaopinView selectView(@Param("ew") Wrapper<YiliaoyaopinEntity> wrapper);
	
}
