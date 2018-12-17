package com.upsoft.intelligenteye.domain.po;

import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Area
 * @Description 区域
 * @Author wei wei
 * @Date 2018/12/6 16:20
 * @Version 1.0
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Area implements Serializable {

	/**
	 * @Description: 编号
	 */
	@Min(value = 7, message = "ID已存在")
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
	private Date createTime;

}
