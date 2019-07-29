package com.bksuns.zzdljc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @Author wujp
 * @Date 2019/7/29 13:12
 */
@EnableSwagger2
@RestController
@MapperScan("com.bksuns.zzdljc.**.dao")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Application{

    @RequestMapping("/")
    public String getHome(){
        return  "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

