package reflect;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Properties;

/**
 * Created by 张文旭 on 2019/3/5.
 */
public class ReflectDemo02 {
    public static void  Demo01() throws IllegalAccessException, InstantiationException {
        Class<?> perclass = null;
        try {
           perclass = Class.forName("reflect.Person");
            System.out.println(perclass);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Person person = (Person)perclass.newInstance();
        person.setNama("zhangsan");
        person.setAge(22);
        System.out.println(person.getNama()+person.getAge());

    }
    public static void  Demo02() throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<?> perclass = null;
        try {
            perclass = Class.forName("reflect.Person");
            System.out.println(perclass);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Person person = (Person)perclass.newInstance();
        Field idField = perclass.getDeclaredField("id");
        //访问的是private修饰的id，但是private是私有的 只能本类访问
        //修改属性访问权限 ，  使用反射时如果因为访问修饰符造成异常 可以通过Field/Method.setAccessible(true)
        //idField.setAccessible(true);
        idField.set(person,"1");//person.setid(1)
        System.out.println(person.getId());

     System.out.println("=========");

       Method method = perclass.getDeclaredMethod("privateMethod",null);
      method.setAccessible(true);
       method.invoke(person,null);//方法的调用invoke()
      //person.say(xxx)

     System.out.println("=====");
    Method method1 = perclass.getDeclaredMethod("privateMethod2",String.class);
      method1.setAccessible(true);
      method1.invoke(person,"zhangsan");
    }
    public static  void Demo03() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> perclass = null;
        try {
            perclass = Class.forName("reflect.Person");
            System.out.println(perclass);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        Constructor<?>[] constructors = perclass.getConstructors();
//        for (Constructor constructor:constructors){
//            System.out.println(constructor);
//        }
//        System.out.println("====");
//        Constructor<?>[] constructors02 = perclass.getDeclaredConstructors();
//        for (Constructor constructor:constructors02) {
//            System.out.println(constructor);
//        }
        //获取指定的构造方法
        Constructor<?> constructor = perclass.getConstructor(String.class) ;
        System.out.println(constructor);

//       Constructor<?> constructor1 = perclass.getDeclaredConstructor(int.class);
//        System.out.println(constructor1);

       Person person = (Person)constructor.newInstance("za");
        System.out.println(person);

        Constructor<?> constructor02 = perclass.getConstructor() ;
        Person person1 = (Person) constructor02.newInstance();
        System.out.println(person1);

        Constructor<?> constructor03 = perclass.getDeclaredConstructor(int.class) ;
        constructor03.setAccessible(true);
        Person person2 = (Person)constructor03.newInstance(22);
        System.out.println(person2);
    }
    //动态加载类名和方法
    public static void  Demo04() throws IOException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Properties prop = new Properties();
        prop.load( new FileReader("class.txt"));
        String classname = prop.getProperty("classname");//获得类名
        String methodname = prop.getProperty("methodname");
        Class<?> perclass = null;
        try {
            perclass = Class.forName(classname);
            System.out.println(perclass);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Method method = perclass.getMethod(methodname);
        method.invoke(perclass.newInstance());


    }
    //反射可以越过泛型检查
    //虽然可以通过反射可以访问private等访问修饰符不允许访问的属性和方法，也可以忽略泛型的约束 但实际开发不建议
    public static void Demo05() throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(14);
        list.add(15);

        Class<?> listClass = list.getClass();
        Method method = listClass.getMethod("add",Object.class);
        method.invoke(listClass.newInstance(),"zs");
        System.out.println(list);
    }
    public static void Demo06() throws NoSuchFieldException, IllegalAccessException {
     Person person = new Person();
     PropertyUtil.setProperty(person,"nama","zs");
        System.out.println(person.getNama());
    }
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException, IOException {
     //Demo01();
     //Demo02();
//        Demo03();
//          Demo04();
   Demo05();
//    Demo06();
    }
}
