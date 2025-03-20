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


import com.dao.HaorenhaoshizhengmingDao;
import com.entity.HaorenhaoshizhengmingEntity;
import com.service.HaorenhaoshizhengmingService;
import com.entity.vo.HaorenhaoshizhengmingVO;
import com.entity.view.HaorenhaoshizhengmingView;

@Service("haorenhaoshizhengmingService")
public class HaorenhaoshizhengmingServiceImpl extends ServiceImpl<HaorenhaoshizhengmingDao, HaorenhaoshizhengmingEntity> implements HaorenhaoshizhengmingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HaorenhaoshizhengmingEntity> page = this.selectPage(
                new Query<HaorenhaoshizhengmingEntity>(params).getPage(),
                new EntityWrapper<HaorenhaoshizhengmingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HaorenhaoshizhengmingEntity> wrapper) {
		  Page<HaorenhaoshizhengmingView> page =new Query<HaorenhaoshizhengmingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HaorenhaoshizhengmingVO> selectListVO(Wrapper<HaorenhaoshizhengmingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HaorenhaoshizhengmingVO selectVO(Wrapper<HaorenhaoshizhengmingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HaorenhaoshizhengmingView> selectListView(Wrapper<HaorenhaoshizhengmingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HaorenhaoshizhengmingView selectView(Wrapper<HaorenhaoshizhengmingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
