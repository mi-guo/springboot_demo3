package fun.miguo.boot.bean;

/**
 * ClassName: Pet
 * Description:
 * date: 2021/12/11 16:12
 *
 * @author lf
 * @since JDK 1.8
 */
public class Pet {

    private String name;

    public Pet() {
    }

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
