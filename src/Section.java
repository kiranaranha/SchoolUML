public class Section {

    private Student[] sections = new Student[50];
    private String name;
    private Teacher teacher;
    private int currentSize = 0;

    public Section(String name){
        this.name = name;
    }

    public Teacher getTeacher(){
        return this.teacher;
    }

    public void setTeacher(Teacher t){
        this.teacher = t;
    }

    public Student[] getStudents(){
        return this.sections;
    }

    public void addStudent(Student s){
        this.sections[this.currentSize] = s;
        currentSize++;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        String str = "This " + this.name + " class is taught by " + this.teacher.getName() + " and has " + currentSize + " students: ";
        for(int i = 0; i< this.currentSize; i++){
            str+=this.sections[i].getName() + ", ";
        }
        return str;
    }
}