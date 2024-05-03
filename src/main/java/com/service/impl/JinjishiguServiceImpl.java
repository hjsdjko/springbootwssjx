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


import com.dao.JinjishiguDao;
import com.entity.JinjishiguEntity;
import com.service.JinjishiguService;
import com.entity.vo.JinjishiguVO;
import com.entity.view.JinjishiguView;

@Service("jinjishiguService")
public class JinjishiguServiceImpl extends ServiceImpl<JinjishiguDao, JinjishiguEntity> implements JinjishiguService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JinjishiguEntity> page = this.selectPage(
                new Query<JinjishiguEntity>(params).getPage(),
                new EntityWrapper<JinjishiguEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JinjishiguEntity> wrapper) {
		  Page<JinjishiguView> page =new Query<JinjishiguView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JinjishiguVO> selectListVO(Wrapper<JinjishiguEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JinjishiguVO selectVO(Wrapper<JinjishiguEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JinjishiguView> selectListView(Wrapper<JinjishiguEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JinjishiguView selectView(Wrapper<JinjishiguEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
