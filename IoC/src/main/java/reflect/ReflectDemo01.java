package reflect;


import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by 张文旭 on 2019/3/5.
 */
//通过反射获取类
public class ReflectDemo01 {
    public static void Demo01(){
        //获取反射对象（反射入口）1.Class.forname(全类名) 2.类名.Class  3.对象.getclass()
//        1.Class.forName(全类名)
        try {
            Class<?> perclass = Class.forName("reflect.Person");
            System.out.println(perclass);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        2.类名.Class
        Class<?> perclass2 = Person.class;
        System.out.println(perclass2);

//        3.对象.getclass();
        Person person = new Person();
        Class<?> perclass3 = person.getClass();
        System.out.println(perclass3);
    }
    //获取方法
    public  static  void Demo02(){
        //获得反射接口
        Class<?> perclass = null;
        try {
            perclass = Class.forName("reflect.Person");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        //获取所有的公共方法（1.本类以及父类中以及接口中所有的方法，2.符合访问修饰符规律 public  private不行）
        Method[] methods = perclass.getMethods();
        for (Method method:methods){
            System.out.println(method);
        }
        System.out.println("==================");
        //获取当前类的所有方法(1.忽略访问修饰符规律 2.只限当前类)
        Method[] methods1 = perclass. getDeclaredMethods();
        for (Method method:methods1){
            System.out.println(method);
        }
    }
    //获得所有的反射接口
    public  static  void Demo03(){

        Class<?> perclass = null;
        try {
            perclass = Class.forName("reflect.Person");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
       Class<?>[] interfaces = perclass.getInterfaces();
        for (Class<?> inter:interfaces){
            System.out.println(inter);
        }
    }
//    获得父类
    public static void Demo04(){
        Class<?> perclass = null;
        try {
            perclass = Class.forName("reflect.Person");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Class<?> superclass = perclass.getSuperclass() ;
        System.out.println(superclass);
    }
    //获取所有的构造方法
    public static  void Demo05(){
        Class<?> perclass = null;
        try {
            perclass = Class.forName("reflect.Person");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Constructor<?>[]  constructors= perclass.getConstructors() ;
        for (Constructor<?> constructor:constructors){
            System.out.println(constructor);
        }
    }
    //获得所有的公共属性
    public static  void Demo06(){
        Class<?> perclass = null;
        try {
            perclass = Class.forName("reflect.Person");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Field[]  fields= perclass.getFields();
        for (Field field:fields){
            System.out.println(field);
        }
        System.out.println("=========");
        //所有的属性
        Field[] fields1 = perclass.getDeclaredFields();
        for (Field field:fields1){
            System.out.println(field);
        }
    }
    //获取对象
    public static void Demo07() throws IllegalAccessException, InstantiationException {
        Class<?> perclass = null;
        try {
            perclass = Class.forName("reflect.Person");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
         Object instance = perclass.newInstance();
        Person person = (Person) instance;
        person.interfaceMethod();

    }
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
//      Demo01();
   Demo02();
        //Demo03();
//        Demo04();
//        Demo05();
//        Demo06();
//          Demo07();
    }
}
