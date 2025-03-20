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


import com.dao.JilvtongbaoDao;
import com.entity.JilvtongbaoEntity;
import com.service.JilvtongbaoService;
import com.entity.vo.JilvtongbaoVO;
import com.entity.view.JilvtongbaoView;

@Service("jilvtongbaoService")
public class JilvtongbaoServiceImpl extends ServiceImpl<JilvtongbaoDao, JilvtongbaoEntity> implements JilvtongbaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JilvtongbaoEntity> page = this.selectPage(
                new Query<JilvtongbaoEntity>(params).getPage(),
                new EntityWrapper<JilvtongbaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JilvtongbaoEntity> wrapper) {
		  Page<JilvtongbaoView> page =new Query<JilvtongbaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JilvtongbaoVO> selectListVO(Wrapper<JilvtongbaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JilvtongbaoVO selectVO(Wrapper<JilvtongbaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JilvtongbaoView> selectListView(Wrapper<JilvtongbaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JilvtongbaoView selectView(Wrapper<JilvtongbaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
