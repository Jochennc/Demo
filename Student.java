public class Student {
    private String id;
    private String name;
    private String email;
    private double gpa;
    public Student(){

    }
    public Student ( String id, String name){
        this.id = id;
        this.name = name;
    }
    public Student (String id, String name, String email, double gpa){
        this.id = id;
        this.name = name;
        this.email = email;
        setGpa(gpa);
    }
    public Student (Student other){
        this.id = other.id;
        this.name = other.name;
        this.email = other.email;
        this.gpa = other.gpa;
    }
    public void setGpa(double gpa) {
        if (gpa < 0.0 || gpa > 4.0) {
            System.out.println("Error");
        }
        else{
            this.gpa = gpa;
        }
    }
    public void printInformation(){
        System.out.println(id + " " + name + " " + email + " " + gpa);
    }
    public static void main (String[] args){
        Student s1= new Student();
        Student s2= new Student("25023179", "Buoi", "bbuoi812@gmail.com", -1);
        Student s3= new Student("25023179", "Buoi");
        Student s4 = new Student (s2);
        s1.printInformation();
        s3.printInformation();
        s4.printInformation();
    }

}
