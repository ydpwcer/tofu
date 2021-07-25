package cn.shangChen.tofu.utils;

import cn.shangChen.tofu.core.TofuProps;
import cn.shangChen.tofu.core.annotation.SysValue;

import java.lang.reflect.Field;

import cn.shangChen.tofu.utils.ObjectCreatorFactory;
import cn.shangChen.tofu.utils.StringUtils;

/**
 * @author yudi
 */
public class SysValueInject {
    /**
     * 知识点：获取类的所有成员变量
     * 1.getFields这个方法是用来获取一个类和其所有父类中被public修饰符修饰的成员变量的。
     * 2.getDeclaredFields这个方法是用来获取一个类中的所有成员变量的，即包括被public、protected、defautl和private修饰符修饰的所有成员变量。
     * 但是这个方法，不会获取其子类的成员变量。
     * 3.isAnnotationPresent 返回true如果当前的元素是是特定指定的注解，不是返回false。
     * Returns true if an annotation for the specified type is present on this element, else false.
     * @param object 需要进行变量注入的tofuconfig类
     * @param <T> 泛型
     */
    public static  <T> void inject(T object){
        Field[] fields = object.getClass().getDeclaredFields();

        for(Field field : fields){
            if(field.isAnnotationPresent(SysValue.class)){
                SysValue sysValue = field.getAnnotation(SysValue.class);
                String value = sysValue.value();
                if(!StringUtils.isEmpty(value)){
                    if(value.endsWith("}")&&value.startsWith("${")){
                        value = value.substring(1,value.length()-1);
                        String  propsValue = TofuProps.getValue(value);
                        if(propsValue == null){
                            continue;
                        }
                        value = propsValue;
                    }

                    try {
                        Class c = field.getType();
                        field.setAccessible(true);
                        field.set(object, ObjectCreatorFactory.create(c,value));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }

                }

            }

        }

    }

}
