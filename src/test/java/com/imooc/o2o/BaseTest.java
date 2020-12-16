package com.imooc.o2o;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring和junit整合,junit启动加载spring容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring文件在哪里
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class BaseTest {

    @Test
    public void test() {
        System.out.println("baseTest");
    }
}
