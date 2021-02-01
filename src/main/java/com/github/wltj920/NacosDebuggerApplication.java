package com.github.wltj920;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 认证服务应用入口
 *
 * @author ZhuKun
 */
@EnableScheduling
@EnableAsync
@ServletComponentScan
@SpringBootApplication
public class NacosDebuggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDebuggerApplication.class, args);
    }
}
