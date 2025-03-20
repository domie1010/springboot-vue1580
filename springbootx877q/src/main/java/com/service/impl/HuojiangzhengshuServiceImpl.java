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


import com.dao.HuojiangzhengshuDao;
import com.entity.HuojiangzhengshuEntity;
import com.service.HuojiangzhengshuService;
import com.entity.vo.HuojiangzhengshuVO;
import com.entity.view.HuojiangzhengshuView;

@Service("huojiangzhengshuService")
public class HuojiangzhengshuServiceImpl extends ServiceImpl<HuojiangzhengshuDao, HuojiangzhengshuEntity> implements HuojiangzhengshuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuojiangzhengshuEntity> page = this.selectPage(
                new Query<HuojiangzhengshuEntity>(params).getPage(),
                new EntityWrapper<HuojiangzhengshuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuojiangzhengshuEntity> wrapper) {
		  Page<HuojiangzhengshuView> page =new Query<HuojiangzhengshuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuojiangzhengshuVO> selectListVO(Wrapper<HuojiangzhengshuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuojiangzhengshuVO selectVO(Wrapper<HuojiangzhengshuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuojiangzhengshuView> selectListView(Wrapper<HuojiangzhengshuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuojiangzhengshuView selectView(Wrapper<HuojiangzhengshuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
