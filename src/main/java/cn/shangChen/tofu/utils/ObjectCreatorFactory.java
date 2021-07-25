package cn.shangChen.tofu.utils;

/**
 * @author yudi
 */
public class ObjectCreatorFactory {

    public ObjectCreatorFactory(){

    }

    public static Object create(Class c,String value){
        if(c == null ){
            return null;
        }else{
            value = value.trim();
            if(c.equals(Byte.TYPE)||c.equals(Byte.class)){
                return ObjectCreator.createByte(value);
            }
            else if(c.equals(Short.TYPE)||c.equals(Short.class)){
                return ObjectCreator.createShort(value);
            }
            else if(c.equals(Integer.TYPE)||c.equals(Integer.class)){
                return ObjectCreator.createInteger(value);
            }
            else if(c.equals(Long.TYPE)||c.equals(Long.class)){
                return ObjectCreator.createLong(value);
            }
            else if(c.equals(Character.TYPE)||c.equals(Character.class)){
                return ObjectCreator.createCharacter(value);
            }
            else if(c.equals(String.class)){
                return ObjectCreator.createString(value);
            }
            else if(c.equals(Double.TYPE)||c.equals(Double.class)){
                return ObjectCreator.createDouble(value);
            }
            else if(c.equals(Float.TYPE)||c.equals(Float.class)){
                return ObjectCreator.createFloat(value);
            }
            else {
                return ObjectCreator.createBoolean(value);
            }

        }
    }

}
