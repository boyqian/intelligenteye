package com.upsoft.intelligenteye.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.upsoft.intelligenteye.constant.Constants;
import com.upsoft.intelligenteye.domain.po.Area;
import com.upsoft.intelligenteye.domain.vo.AreaVO;
import com.upsoft.intelligenteye.domain.vo.BaseResult;
import com.upsoft.intelligenteye.domain.vo.PageListVO;
import com.upsoft.intelligenteye.exception.BaseException;
import com.upsoft.intelligenteye.exception.ValidateException;
import com.upsoft.intelligenteye.service.AreaService;
import com.upsoft.intelligenteye.utils.BaseResultUtil;
import com.upsoft.intelligenteye.utils.DateUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;

/**
 * @ClassName AreaController
 * @Description Area Restful API接口
 * @Author Administrator
 * @Date 2018/12/6 17:49
 * @Version 1.0
 */
@Validated
@RestController
@RequestMapping("/area")
@Api(value = "区域管理接口")
public class AreaController {

	/**
	 * @Description: 日志记录器
	 */
	Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * @Description: 注入AreaService
	 */
	@Autowired
	private AreaService areaService;

	/**
	 * @Author weiwei
	 * @Description 新增Area
	 * @Date 17:55 2018/12/6
	 * @Params [Area area]
	 * @return TODO
	 **/
	@PostMapping("/addArea")
	@ApiOperation(value = "新增区域信息", notes = "这里写需要注意的点")
	public void insertArea(@RequestBody @Validated Area area, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			for (ObjectError objectError: bindingResult.getAllErrors()){
				throw new ValidateException(Constants.INVALID_PARAMETER_CODE, objectError.getDefaultMessage());
			}
		}
		areaService.insertArea(area);
	}

	/**
	 * @Author weiwei
	 * @Description 通过主键ID获取Area
	 * @Date 17:55 2018/12/6 
	 * @Params [Integer Id]
	 * @return com.upsoft.intelligenteye.domain.po.Area
	 **/
	@GetMapping("/{id}")
	@ApiOperation(value = "根据id查询信息", notes = "这里写需要注意的点")
	public BaseResult getAreaById(@PathVariable("id") Integer id) {
		logger.debug("这是debug日志...");
		logger.info("这是info日志...3");
		logger.warn("这是warn日志...");
		logger.error("这是error日志...");
		Area area = areaService.getAreaById(id);
		if(area != null) {
			AreaVO areaVO = new AreaVO();
			areaVO.setId(area.getId());
			areaVO.setAreaName(area.getAreaName());
			areaVO.setPriority(area.getPriority());
			Date createTime = area.getCreateTime();
			String areaTimeString = DateUtil.dateToString(createTime, "yyyy-MM-dd HH:mm:ss");
			areaVO.setCreateTimeString(areaTimeString);
			return BaseResultUtil.success(areaVO);
		}
		throw new BaseException(Constants.INVALID_PARAMETER_CODE, "参数错误,查询无结果");
	}

	/**
	 * @Author weiwei
	 * @Description 分页查找Area
	 * @Date 17:55 2018/12/6
	 * @Params [Integer pageNumber, Integer pageSize]
	 * @return com.upsoft.intelligenteye.domain.po.Area
	 **/
	@PostMapping("/listAreasByPage")
	@ApiOperation(value = "分页查询区域信息", notes = "这里写需要注意的点")
	@ApiImplicitParams({
			@ApiImplicitParam(value = "当前页数", name = "pageNumber", dataType = "Integer", required = true, paramType = "query"),
			@ApiImplicitParam(value = "每页数量", name = "pageSize", dataType = "Integer", required = true, paramType = "query")
	})
	public BaseResult listAreasByPage(Integer pageNumber, Integer pageSize) {
		Page<Area> page = new Page<Area>(pageNumber, pageSize);
		IPage<Area> pageArea = areaService.listAreaByPage(page);
		return BaseResultUtil.success(pageArea);
	}

}
