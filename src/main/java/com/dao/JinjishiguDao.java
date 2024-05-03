package com.dao;

import com.entity.JinjishiguEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JinjishiguVO;
import com.entity.view.JinjishiguView;


/**
 * 紧急事故
 * 
 * @author 
 * @email 
 * @date 2020-12-29 17:16:24
 */
public interface JinjishiguDao extends BaseMapper<JinjishiguEntity> {
	
	List<JinjishiguVO> selectListVO(@Param("ew") Wrapper<JinjishiguEntity> wrapper);
	
	JinjishiguVO selectVO(@Param("ew") Wrapper<JinjishiguEntity> wrapper);
	
	List<JinjishiguView> selectListView(@Param("ew") Wrapper<JinjishiguEntity> wrapper);

	List<JinjishiguView> selectListView(Pagination page,@Param("ew") Wrapper<JinjishiguEntity> wrapper);
	
	JinjishiguView selectView(@Param("ew") Wrapper<JinjishiguEntity> wrapper);
	
}
