package problem1;

public class Student {
    private String id;
    private String name;
    private int yearOfStudy;

    public Student(){}

    public Student(String name, String id){
        this.id = id;
        this.name = name;
    }

    public void incrementYearOfStudy(){
        this.yearOfStudy += 1;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
}
