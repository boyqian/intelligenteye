package com.upsoft.intelligenteye.domain.vo;

import lombok.*;

import java.io.Serializable;

/**
 * @ClassName AreaVO
 * @Description AreaVO
 * @Author Administrator
 * @Date 2018/12/12 16:06
 * @Version 1.0
 */

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AreaVO implements Serializable {

	/**
	 * @Description: 编号
	 */
	private Integer id;

	/**
	 * @Description: 区域名称
	 */
	private String areaName;

	/**
	 * @Description: 优先级
	 */
	private Integer priority;

	/**
	 * @Description: 创建时间
	 */
	private String createTimeString;

}
