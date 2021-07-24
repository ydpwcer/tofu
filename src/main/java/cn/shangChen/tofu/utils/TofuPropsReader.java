package cn.shangChen.tofu.utils;

import cn.shangChen.tofu.constants.SysEnum;
import cn.shangChen.tofu.logging.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

/**
 * @author yudi
 */
public class TofuPropsReader {

    private Properties properties = null;

    public TofuPropsReader(String fileName){
        try {
            if(!fileName.trim().startsWith(SysEnum.PATH_CHARACTER)){
                fileName = SysEnum.PATH_CHARACTER + fileName.trim();
            }

            properties = new Properties();
            InputStream in = TofuPropsReader.class.getResourceAsStream(fileName);
            properties.load(in);
        } catch (IOException e) {
            Logger.error(" In TofuPropsReader Not Found the File :"+fileName);
            Logger.error("Cause By"+e.getMessage());
            e.printStackTrace();
        }
    }

    public String getValue(String key){
        return properties.getProperty(key);
    }

    public String getValueText(String key){
        return properties.getProperty(key, "");
    }

    public String getValueByDefault(String key, String defaultString){
        return properties.getProperty(key, defaultString);
    }

    public Set<String> getKeySet(){
        return properties.stringPropertyNames();
    }

}
