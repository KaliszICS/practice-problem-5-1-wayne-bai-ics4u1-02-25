import java.util.*;
public class Parent extends Person {

    private Parent spouse = null;
    private Child[] children = new Child[0];

    private static Table<Child> table;

    public Parent(String name, int age, Parent spouse) {
        super(name, age);
        this.spouse = spouse;
    }

    public Parent(String name, int age) {
        super(name, age);
    }

    public void addChild(Child child) {
        table.insert(children, child);
    }

    public Parent getSpouse() {
        return spouse;
    }

    public void setSpouse(Parent spouse) {
        this.spouse = spouse;
    }

    public void setChildren(Child[] children) {
        this.children = children;
    }

    public Child[] getChildren() {
        return children;
    }


}