package com.dao;

import com.entity.XiangcunzhenshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangcunzhenshiVO;
import com.entity.view.XiangcunzhenshiView;


/**
 * 乡村诊室
 * 
 * @author 
 * @email 
 * @date 2020-12-29 17:16:24
 */
public interface XiangcunzhenshiDao extends BaseMapper<XiangcunzhenshiEntity> {
	
	List<XiangcunzhenshiVO> selectListVO(@Param("ew") Wrapper<XiangcunzhenshiEntity> wrapper);
	
	XiangcunzhenshiVO selectVO(@Param("ew") Wrapper<XiangcunzhenshiEntity> wrapper);
	
	List<XiangcunzhenshiView> selectListView(@Param("ew") Wrapper<XiangcunzhenshiEntity> wrapper);

	List<XiangcunzhenshiView> selectListView(Pagination page,@Param("ew") Wrapper<XiangcunzhenshiEntity> wrapper);
	
	XiangcunzhenshiView selectView(@Param("ew") Wrapper<XiangcunzhenshiEntity> wrapper);
	
}
