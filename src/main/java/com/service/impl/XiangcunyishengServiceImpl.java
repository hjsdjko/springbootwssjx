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


import com.dao.XiangcunyishengDao;
import com.entity.XiangcunyishengEntity;
import com.service.XiangcunyishengService;
import com.entity.vo.XiangcunyishengVO;
import com.entity.view.XiangcunyishengView;

@Service("xiangcunyishengService")
public class XiangcunyishengServiceImpl extends ServiceImpl<XiangcunyishengDao, XiangcunyishengEntity> implements XiangcunyishengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangcunyishengEntity> page = this.selectPage(
                new Query<XiangcunyishengEntity>(params).getPage(),
                new EntityWrapper<XiangcunyishengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangcunyishengEntity> wrapper) {
		  Page<XiangcunyishengView> page =new Query<XiangcunyishengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangcunyishengVO> selectListVO(Wrapper<XiangcunyishengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangcunyishengVO selectVO(Wrapper<XiangcunyishengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangcunyishengView> selectListView(Wrapper<XiangcunyishengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangcunyishengView selectView(Wrapper<XiangcunyishengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
