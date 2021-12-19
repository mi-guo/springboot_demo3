package fun.miguo.boot.bean;

/**
 * ClassName: User
 * Description:
 * date: 2021/12/11 15:29
 *
 * @author lf
 * @since JDK 1.8
 */
public class User {
    private String name;
    private Integer age;
    private Pet pet;
    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }
}
