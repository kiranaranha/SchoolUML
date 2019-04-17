public class Runner {
    public static void main(String[] args){
        School berkeleyHigh = new School("Berkeley High");

        Section math = new Section("Math");
        Section biology = new Section("Biology");
        Section computerScience = new Section("Computer Science");

        Teacher albinson = new Teacher("Albinson", 1, "Computer Science");
        Teacher teacher2 = new Teacher("Teacher2", 1, "Biology");
        Teacher teacher3 = new Teacher("Teacher3", 1, "Math");

        Student me = new Student("Me",1, 5);
        Student Friend1 = new Student("Me",1, 5);
        Student Friend2 = new Student("Friend2",1, 5);
        Student Friend3 = new Student("Friend3",1, 4);
        Student Friend4 = new Student("Friend4",1, 3);
        Student Friend5 = new Student("Friend5",1, 2);

        computerScience.addStudent(me);
        computerScience.addStudent(Friend3);
        biology.addStudent(Friend1);
        biology.addStudent(Friend4);
        math.addStudent(Friend2);
        math.addStudent(Friend5);

        computerScience.setTeacher(albinson);
        biology.setTeacher(teacher2);
        math.setTeacher(teacher3);

        System.out.println(math.toString());
        System.out.println(computerScience.toString());
        System.out.println(biology.toString());

    }
}