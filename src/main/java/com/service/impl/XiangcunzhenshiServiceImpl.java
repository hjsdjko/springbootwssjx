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


import com.dao.XiangcunzhenshiDao;
import com.entity.XiangcunzhenshiEntity;
import com.service.XiangcunzhenshiService;
import com.entity.vo.XiangcunzhenshiVO;
import com.entity.view.XiangcunzhenshiView;

@Service("xiangcunzhenshiService")
public class XiangcunzhenshiServiceImpl extends ServiceImpl<XiangcunzhenshiDao, XiangcunzhenshiEntity> implements XiangcunzhenshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangcunzhenshiEntity> page = this.selectPage(
                new Query<XiangcunzhenshiEntity>(params).getPage(),
                new EntityWrapper<XiangcunzhenshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangcunzhenshiEntity> wrapper) {
		  Page<XiangcunzhenshiView> page =new Query<XiangcunzhenshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangcunzhenshiVO> selectListVO(Wrapper<XiangcunzhenshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangcunzhenshiVO selectVO(Wrapper<XiangcunzhenshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangcunzhenshiView> selectListView(Wrapper<XiangcunzhenshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangcunzhenshiView selectView(Wrapper<XiangcunzhenshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
