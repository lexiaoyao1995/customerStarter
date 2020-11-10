package com.example.hello;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ChengJianSheng
 * @date 2019-05-26
 */
@Data
@ConfigurationProperties("my.hello")
public class HelloProperties {

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 家乡
     */
    private String hometown;

}
