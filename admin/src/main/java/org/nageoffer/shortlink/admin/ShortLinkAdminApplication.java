package org.nageoffer.shortlink.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author aree
 * 2025/2/5
 */
@SpringBootApplication
@MapperScan("org.nageoffer.shortlink.admin.dao.mapper")
public class ShortLinkAdminApplication {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(ShortLinkAdminApplication.class, args);
    }
}
