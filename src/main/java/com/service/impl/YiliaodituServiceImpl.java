package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YiliaodituDao;
import com.entity.YiliaodituEntity;
import com.service.YiliaodituService;
import com.entity.vo.YiliaodituVO;
import com.entity.view.YiliaodituView;

@Service("yiliaodituService")
public class YiliaodituServiceImpl extends ServiceImpl<YiliaodituDao, YiliaodituEntity> implements YiliaodituService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiliaodituEntity> page = this.selectPage(
                new Query<YiliaodituEntity>(params).getPage(),
                new EntityWrapper<YiliaodituEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiliaodituEntity> wrapper) {
		  Page<YiliaodituView> page =new Query<YiliaodituView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiliaodituVO> selectListVO(Wrapper<YiliaodituEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiliaodituVO selectVO(Wrapper<YiliaodituEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiliaodituView> selectListView(Wrapper<YiliaodituEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiliaodituView selectView(Wrapper<YiliaodituEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
