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


import com.dao.YiliaoyaopinDao;
import com.entity.YiliaoyaopinEntity;
import com.service.YiliaoyaopinService;
import com.entity.vo.YiliaoyaopinVO;
import com.entity.view.YiliaoyaopinView;

@Service("yiliaoyaopinService")
public class YiliaoyaopinServiceImpl extends ServiceImpl<YiliaoyaopinDao, YiliaoyaopinEntity> implements YiliaoyaopinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiliaoyaopinEntity> page = this.selectPage(
                new Query<YiliaoyaopinEntity>(params).getPage(),
                new EntityWrapper<YiliaoyaopinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiliaoyaopinEntity> wrapper) {
		  Page<YiliaoyaopinView> page =new Query<YiliaoyaopinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiliaoyaopinVO> selectListVO(Wrapper<YiliaoyaopinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiliaoyaopinVO selectVO(Wrapper<YiliaoyaopinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiliaoyaopinView> selectListView(Wrapper<YiliaoyaopinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiliaoyaopinView selectView(Wrapper<YiliaoyaopinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
