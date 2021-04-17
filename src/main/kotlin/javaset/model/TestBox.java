package javaset.model;

public class TestBox {

    int id;
    String name;

    public TestBox(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestBox{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
