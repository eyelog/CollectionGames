package javaset.model;

import java.util.Objects;

public class TestBoxMode {

    int id;
    String name;

    public TestBoxMode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TestBoxMode)) return false;
        TestBoxMode that = (TestBoxMode) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "TestBoxMode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
