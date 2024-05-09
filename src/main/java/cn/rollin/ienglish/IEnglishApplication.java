package cn.rollin.ienglish;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * i英语启动类
 *
 * @author rollin
 * @since 2024-05-05 15:52:45
 */
@SpringBootApplication
@MapperScan("cn.rollin.ienglish.mapper")
public class IEnglishApplication {
    public static void main(String[] args) {
        SpringApplication.run(IEnglishApplication.class, args);
    }
}
