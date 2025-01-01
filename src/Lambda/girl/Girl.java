package Lambda.girl;

import java.util.Objects;

public class Girl {
    private String name;
    private int age;
    private Double height;

    public Girl() {
    }

    public Girl(String name, int age, Double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return height
     */
    public Double getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Girl girl = (Girl) o;
        return age == girl.age && Objects.equals(name, girl.name) && Objects.equals(height, girl.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }

    public String toString() {
        return "Girl{name = " + name + ", age = " + age + ", height = " + height + "}";
    }
}
