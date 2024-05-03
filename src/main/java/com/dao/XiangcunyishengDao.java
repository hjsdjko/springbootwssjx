package com.dao;

import com.entity.XiangcunyishengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangcunyishengVO;
import com.entity.view.XiangcunyishengView;


/**
 * 乡村医生
 * 
 * @author 
 * @email 
 * @date 2020-12-29 17:16:24
 */
public interface XiangcunyishengDao extends BaseMapper<XiangcunyishengEntity> {
	
	List<XiangcunyishengVO> selectListVO(@Param("ew") Wrapper<XiangcunyishengEntity> wrapper);
	
	XiangcunyishengVO selectVO(@Param("ew") Wrapper<XiangcunyishengEntity> wrapper);
	
	List<XiangcunyishengView> selectListView(@Param("ew") Wrapper<XiangcunyishengEntity> wrapper);

	List<XiangcunyishengView> selectListView(Pagination page,@Param("ew") Wrapper<XiangcunyishengEntity> wrapper);
	
	XiangcunyishengView selectView(@Param("ew") Wrapper<XiangcunyishengEntity> wrapper);
	
}
