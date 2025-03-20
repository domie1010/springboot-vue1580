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


import com.dao.XinxiyiyifankuiDao;
import com.entity.XinxiyiyifankuiEntity;
import com.service.XinxiyiyifankuiService;
import com.entity.vo.XinxiyiyifankuiVO;
import com.entity.view.XinxiyiyifankuiView;

@Service("xinxiyiyifankuiService")
public class XinxiyiyifankuiServiceImpl extends ServiceImpl<XinxiyiyifankuiDao, XinxiyiyifankuiEntity> implements XinxiyiyifankuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinxiyiyifankuiEntity> page = this.selectPage(
                new Query<XinxiyiyifankuiEntity>(params).getPage(),
                new EntityWrapper<XinxiyiyifankuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinxiyiyifankuiEntity> wrapper) {
		  Page<XinxiyiyifankuiView> page =new Query<XinxiyiyifankuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinxiyiyifankuiVO> selectListVO(Wrapper<XinxiyiyifankuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinxiyiyifankuiVO selectVO(Wrapper<XinxiyiyifankuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinxiyiyifankuiView> selectListView(Wrapper<XinxiyiyifankuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinxiyiyifankuiView selectView(Wrapper<XinxiyiyifankuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
