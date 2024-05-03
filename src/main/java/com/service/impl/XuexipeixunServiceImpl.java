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


import com.dao.XuexipeixunDao;
import com.entity.XuexipeixunEntity;
import com.service.XuexipeixunService;
import com.entity.vo.XuexipeixunVO;
import com.entity.view.XuexipeixunView;

@Service("xuexipeixunService")
public class XuexipeixunServiceImpl extends ServiceImpl<XuexipeixunDao, XuexipeixunEntity> implements XuexipeixunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexipeixunEntity> page = this.selectPage(
                new Query<XuexipeixunEntity>(params).getPage(),
                new EntityWrapper<XuexipeixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexipeixunEntity> wrapper) {
		  Page<XuexipeixunView> page =new Query<XuexipeixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexipeixunVO> selectListVO(Wrapper<XuexipeixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexipeixunVO selectVO(Wrapper<XuexipeixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexipeixunView> selectListView(Wrapper<XuexipeixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexipeixunView selectView(Wrapper<XuexipeixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
