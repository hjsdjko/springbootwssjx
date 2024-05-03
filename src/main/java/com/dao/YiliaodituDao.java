package com.dao;

import com.entity.YiliaodituEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiliaodituVO;
import com.entity.view.YiliaodituView;


/**
 * 医疗地图
 * 
 * @author 
 * @email 
 * @date 2020-12-29 17:16:24
 */
public interface YiliaodituDao extends BaseMapper<YiliaodituEntity> {
	
	List<YiliaodituVO> selectListVO(@Param("ew") Wrapper<YiliaodituEntity> wrapper);
	
	YiliaodituVO selectVO(@Param("ew") Wrapper<YiliaodituEntity> wrapper);
	
	List<YiliaodituView> selectListView(@Param("ew") Wrapper<YiliaodituEntity> wrapper);

	List<YiliaodituView> selectListView(Pagination page,@Param("ew") Wrapper<YiliaodituEntity> wrapper);
	
	YiliaodituView selectView(@Param("ew") Wrapper<YiliaodituEntity> wrapper);
	
}
