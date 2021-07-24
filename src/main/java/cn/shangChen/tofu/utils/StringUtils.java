package cn.shangChen.tofu.utils;

/**
 * @author yudi
 */
public class StringUtils {

    public static Boolean isEmpty(String str){
        if(str == null || str.trim().equals("")){
            return true;
        }else{
            return false;
        }
    }

}
