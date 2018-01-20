package com.springboot.quickstart;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

@SpringBootApplication
//指定被扫描的mapper所在的包路径
@MapperScan(basePackages = "com.springboot.quickstart.mapper")
public class QuickstartApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickstartApplication.class, args);
	}

    @Bean//这个bean的作用就是new 一个对象交给spring容器
    public MapperScannerConfigurer create(){
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
        configurer.setBasePackage("com.springboot.quickstart.mapper");
        Properties properties = new Properties();
        properties.setProperty("mappers","tk.mybatis.mapper.common.Mapper");
        configurer.setProperties(properties);
        return configurer;
    }
}
