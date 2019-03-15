package reflect;

import java.lang.reflect.Field;

/**
 * Created by 张文旭 on 2019/3/6.
 */
public class PropertyUtil {
    //per.setXxx(value)
    public static void setProperty(Object obj, String propertyName, Object value) throws NoSuchFieldException, IllegalAccessException {
        Class<?> perclass = obj.getClass();
        Field field = perclass.getDeclaredField( propertyName);
        field.setAccessible(true);
        field.set(obj,value);
    }
}
