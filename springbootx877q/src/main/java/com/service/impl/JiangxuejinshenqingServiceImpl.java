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


import com.dao.JiangxuejinshenqingDao;
import com.entity.JiangxuejinshenqingEntity;
import com.service.JiangxuejinshenqingService;
import com.entity.vo.JiangxuejinshenqingVO;
import com.entity.view.JiangxuejinshenqingView;

@Service("jiangxuejinshenqingService")
public class JiangxuejinshenqingServiceImpl extends ServiceImpl<JiangxuejinshenqingDao, JiangxuejinshenqingEntity> implements JiangxuejinshenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiangxuejinshenqingEntity> page = this.selectPage(
                new Query<JiangxuejinshenqingEntity>(params).getPage(),
                new EntityWrapper<JiangxuejinshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiangxuejinshenqingEntity> wrapper) {
		  Page<JiangxuejinshenqingView> page =new Query<JiangxuejinshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiangxuejinshenqingVO> selectListVO(Wrapper<JiangxuejinshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiangxuejinshenqingVO selectVO(Wrapper<JiangxuejinshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiangxuejinshenqingView> selectListView(Wrapper<JiangxuejinshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiangxuejinshenqingView selectView(Wrapper<JiangxuejinshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
