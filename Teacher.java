package selection;

public class Teacher extends Person{
    public Course course;

    public Teacher() {
    }

    public Teacher(int id,String name,boolean sex) {
        this.id = id;
        this.name =name;
        this.sex = sex;
    }
}
