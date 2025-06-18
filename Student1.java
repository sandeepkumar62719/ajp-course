public class Student1 {
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    private int id;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String name ;
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    private String course; 
    public static void main(String[] args) {
        Student1 student = new Student1();
        student.id = 33;
        student.name = "sandeep";
        student.course = "MCA";
        
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Course: " + student.getCourse());
    }
}