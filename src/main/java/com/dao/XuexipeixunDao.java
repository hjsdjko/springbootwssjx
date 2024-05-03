package com.dao;

import com.entity.XuexipeixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexipeixunVO;
import com.entity.view.XuexipeixunView;


/**
 * 学习培训
 * 
 * @author 
 * @email 
 * @date 2020-12-29 17:16:24
 */
public interface XuexipeixunDao extends BaseMapper<XuexipeixunEntity> {
	
	List<XuexipeixunVO> selectListVO(@Param("ew") Wrapper<XuexipeixunEntity> wrapper);
	
	XuexipeixunVO selectVO(@Param("ew") Wrapper<XuexipeixunEntity> wrapper);
	
	List<XuexipeixunView> selectListView(@Param("ew") Wrapper<XuexipeixunEntity> wrapper);

	List<XuexipeixunView> selectListView(Pagination page,@Param("ew") Wrapper<XuexipeixunEntity> wrapper);
	
	XuexipeixunView selectView(@Param("ew") Wrapper<XuexipeixunEntity> wrapper);
	
}
