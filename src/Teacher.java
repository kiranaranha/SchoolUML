public class Teacher extends Person{
    private Section[] sections = new Section[50];
    private String subject;
    private int sectionCount;

    public Teacher(String name, int id, String subject){
        super(name,id);
        this.subject = subject;
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String n){
        this.subject = n;
    }

    public Section[] getSections(){
        return this.sections;
    }

    public void addSection(Section s){
        sections[sectionCount] = s;
        sectionCount++;
    }
}