package reflect;

/**
 * Created by 张文旭 on 2019/3/5.
 */
public class Person implements Myinterface {
    private String id;
    private String nama;
    private int age;
    public String hobby;

    public  Person(){

    }

    public Person(String nama){
        this.nama = nama;
    }
    private Person(int age){
        this.age = age ;
    }
    public Person(String id, String nama, int age) {
        this.id = id;
        this.nama = nama;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getAge() {
        return age;
    }

    private void privateMethod(){
        System.out.println("this is privateMethod");
    }
    private void  privateMethod2(String name){
        System.out.println("this is privatemethod"+ name);
    }

    public void setAge(int age) {
        this.age = age;
    }
     public  static  void staticmethod(){
         System.out.println("staticmethod");
     }
    @Override
    public void interfaceMethod() {
        System.out.println("hello");
    }
}
