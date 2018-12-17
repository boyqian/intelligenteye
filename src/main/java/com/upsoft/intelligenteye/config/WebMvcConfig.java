package com.upsoft.intelligenteye.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @ClassName WebMvcConfig
 * @Description 将swagger-ui中的界面配置至spring-boot环境
 * @Author Wei Wei
 * @Date 2018/12/14 8:37
 * @Version 1.0
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	/**
	 * @Author weiwei
	 * @Description 将swagger-ui的Handler配置至spring-boot环境
	 * @Date 8:41 2018/12/14
	 * @Params [ResourceHandlerRegistry registry]
	 * @return void
	 **/
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/js/**").addResourceLocations("classpath:/js/");
		registry.addResourceHandler("swagger-ui.html")
				.addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**")
				.addResourceLocations("classpath:/META-INF/resources/webjars/");
	}

}
