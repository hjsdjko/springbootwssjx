package com.dao;

import com.entity.PutongcunminEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PutongcunminVO;
import com.entity.view.PutongcunminView;


/**
 * 普通村民
 * 
 * @author 
 * @email 
 * @date 2020-12-29 17:16:24
 */
public interface PutongcunminDao extends BaseMapper<PutongcunminEntity> {
	
	List<PutongcunminVO> selectListVO(@Param("ew") Wrapper<PutongcunminEntity> wrapper);
	
	PutongcunminVO selectVO(@Param("ew") Wrapper<PutongcunminEntity> wrapper);
	
	List<PutongcunminView> selectListView(@Param("ew") Wrapper<PutongcunminEntity> wrapper);

	List<PutongcunminView> selectListView(Pagination page,@Param("ew") Wrapper<PutongcunminEntity> wrapper);
	
	PutongcunminView selectView(@Param("ew") Wrapper<PutongcunminEntity> wrapper);
	
}
