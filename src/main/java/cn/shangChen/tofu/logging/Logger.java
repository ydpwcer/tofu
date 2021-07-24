package cn.shangChen.tofu.logging;

import cn.shangChen.tofu.constants.SysEnum;

/**
 * @author yudi
 */
public class Logger {

    public static void info(String msg){
        System.out.println("info======"+msg);
    }

    public static void error(String msg){
        System.out.println("error======"+msg);
    }

}
