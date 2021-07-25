package cn.shangChen.tofu.utils;

/**
 * @author yudi
 */
public class ObjectCreator {

    public ObjectCreator(){

    }

    public static Byte createByte(String str){
        return StringUtils.isEmpty(str) ? null : Byte.parseByte(str);
    }

    public static Short createShort(String str){
        return StringUtils.isEmpty(str) ? null : Short.parseShort(str);
    }

    public static Integer createInteger(String str){
        return StringUtils.isEmpty(str) ? null : Integer.parseInt(str);
    }

    public static Long createLong(String str){
        return StringUtils.isEmpty(str) ? null : Long.parseLong(str);
    }

    public static Character createCharacter(String str){
        return StringUtils.isEmpty(str) ? null : str.charAt(0);
    }

    public static String createString(String str){
        return StringUtils.isEmpty(str) ? null : str;
    }

    public static Double createDouble(String str){
        return StringUtils.isEmpty(str) ? null : Double.parseDouble(str);
    }

    public static Float createFloat(String str){
        return StringUtils.isEmpty(str) ? null : Float.parseFloat(str);
    }

    public static Boolean createBoolean(String str){
        return StringUtils.isEmpty(str) ? null : Boolean.parseBoolean(str);
    }

}
