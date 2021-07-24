package cn.shangChen.tofu.core;

import cn.shangChen.tofu.utils.TofuPropsReader;

/**
 * @author yudi
 */
public class TofuProps {
    private static TofuPropsReader tofuProps = new TofuPropsReader("/tofu.properties");

    public static String getValue(String key){
        return  tofuProps.getValue(key);
    }

}
