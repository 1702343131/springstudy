package xml;

/**
 * Created by 张文旭 on 2019/2/25.
 */
public class Student {
    private String name;
    private  int age;
    private Phone phone;
     public  Student(){

     }
    public Student(String name, int age,Phone phone) {
        this.name = name;
        this.age = age;
        this.phone=phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }
}
