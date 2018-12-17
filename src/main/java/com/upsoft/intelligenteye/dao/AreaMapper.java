package com.upsoft.intelligenteye.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.upsoft.intelligenteye.domain.po.Area;

/**
 * @ClassName:	AreaMapper
 * @Description: Area对象数据库操作接口
 * @author:	 wei wei
 * @date:	2018/12/6 16:20
 * @Version 1.0
 */

public interface AreaMapper extends BaseMapper<Area> {

	/**
	 * @Title: insertArea
	 * @Description: 新增Area
	 * @param: Area area
	 * @return: TODO
	 * @throws: TODO
	 */
	void insertArea(Area area);

	/**
	 * @Title: getAreaById
	 * @Description: 通过主键ID查找Area
	 * @param: Integer id
	 * @return: Area
	 * @throws: TODO
	 */
	Area getAreaById(Integer id);

	/**
	 * @Title: listAreaByPage
	 * @Description: 分页查找Area
	 * @param: [Page page]如果有多个参数，第一个参数必须是Page
	 * @return: IPage<Area>
	 * @throws: TODO
	 */
	IPage<Area> listAreaByPage(Page<Area> page);
}
