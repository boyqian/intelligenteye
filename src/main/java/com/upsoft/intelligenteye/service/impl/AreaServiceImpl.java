package com.upsoft.intelligenteye.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.upsoft.intelligenteye.dao.AreaMapper;
import com.upsoft.intelligenteye.domain.po.Area;
import com.upsoft.intelligenteye.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName AreaServiceImpl
 * @Description AreaService实现类
 * @Author Administrator
 * @Date 2018/12/6 17:21
 * @Version 1.0
 */
@Service
public class AreaServiceImpl implements AreaService {

	/**
	 * @Description: 注入AreaMapper
	 */
	@Autowired
	private AreaMapper areaMapper;

	/**
	 * @Title: insertArea
	 * @Description: 新增Area
	 * @param: Area area
	 * @return: TODO
	 * @throws: TODO
	 */
	@Override
	@Transactional
	public void insertArea(Area area) {
		areaMapper.insertArea(area);
	}

	/**
	 * @Title: getAreaById
	 * @Description: 通过主键ID查找Area
	 * @param: Integer id
	 * @return: Area
	 * @throws: TODO
	 */
	@Override
	public Area getAreaById(Integer id) {
		return areaMapper.getAreaById(id);
	}

	/**
	 * @Title: listAreaByPage
	 * @Description: 分页查找Area
	 * @param: [Page page]如果有多个参数，第一个参数必须是Page
	 * @return: IPage<Area>
	 * @throws: TODO
	 */
	@Override
	public IPage<Area> listAreaByPage(Page<Area> page) {
		return areaMapper.listAreaByPage(page);
	}
}
