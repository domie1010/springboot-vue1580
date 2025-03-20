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


import com.dao.JiangxuejinhuodeqingkuangDao;
import com.entity.JiangxuejinhuodeqingkuangEntity;
import com.service.JiangxuejinhuodeqingkuangService;
import com.entity.vo.JiangxuejinhuodeqingkuangVO;
import com.entity.view.JiangxuejinhuodeqingkuangView;

@Service("jiangxuejinhuodeqingkuangService")
public class JiangxuejinhuodeqingkuangServiceImpl extends ServiceImpl<JiangxuejinhuodeqingkuangDao, JiangxuejinhuodeqingkuangEntity> implements JiangxuejinhuodeqingkuangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiangxuejinhuodeqingkuangEntity> page = this.selectPage(
                new Query<JiangxuejinhuodeqingkuangEntity>(params).getPage(),
                new EntityWrapper<JiangxuejinhuodeqingkuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiangxuejinhuodeqingkuangEntity> wrapper) {
		  Page<JiangxuejinhuodeqingkuangView> page =new Query<JiangxuejinhuodeqingkuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiangxuejinhuodeqingkuangVO> selectListVO(Wrapper<JiangxuejinhuodeqingkuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiangxuejinhuodeqingkuangVO selectVO(Wrapper<JiangxuejinhuodeqingkuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiangxuejinhuodeqingkuangView> selectListView(Wrapper<JiangxuejinhuodeqingkuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiangxuejinhuodeqingkuangView selectView(Wrapper<JiangxuejinhuodeqingkuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
