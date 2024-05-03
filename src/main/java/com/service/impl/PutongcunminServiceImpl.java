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


import com.dao.PutongcunminDao;
import com.entity.PutongcunminEntity;
import com.service.PutongcunminService;
import com.entity.vo.PutongcunminVO;
import com.entity.view.PutongcunminView;

@Service("putongcunminService")
public class PutongcunminServiceImpl extends ServiceImpl<PutongcunminDao, PutongcunminEntity> implements PutongcunminService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PutongcunminEntity> page = this.selectPage(
                new Query<PutongcunminEntity>(params).getPage(),
                new EntityWrapper<PutongcunminEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PutongcunminEntity> wrapper) {
		  Page<PutongcunminView> page =new Query<PutongcunminView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PutongcunminVO> selectListVO(Wrapper<PutongcunminEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PutongcunminVO selectVO(Wrapper<PutongcunminEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PutongcunminView> selectListView(Wrapper<PutongcunminEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PutongcunminView selectView(Wrapper<PutongcunminEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
