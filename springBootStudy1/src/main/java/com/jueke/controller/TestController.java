package com.jueke.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/2/28.
 */
@RestController
public class TestController {
    Logger logger = Logger.getLogger(this.getClass());
    @RequestMapping("/ttttt")
    public String index(String tt,String ttt){

        logger.info("测试日志测试日志测试日志测试日志"+tt);
        return "你好23饿33";
    }

}
