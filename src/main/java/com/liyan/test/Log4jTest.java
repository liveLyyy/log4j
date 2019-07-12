package com.liyan.test;

import org.apache.log4j.Logger;

public class Log4jTest {
    public static void main(String[] args) {
        Logger logger=Logger.getLogger(Log4jTest.class);
        logger.debug("这是一个调试信息");
        logger.info("普通信息");

        try {
            int i=5/0;
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

    }
}
