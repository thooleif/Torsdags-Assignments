void main() {

        Student student1 = new Student("Thor", 28);
        Student student2 = new Student("Philip", 32);
        Student student3 = new Student("Max", 27);

        Student[] students = {student1, student2, student3};

        System.out.println("All students: ");
        for (Student s : students) {
            s.printInfo();
        }
    System.out.println();

        Student oldest = findOldest(students);
        System.out.println("The oldest student is: ");
        oldest.printInfo();

    }

    Student findOldest(Student[] students) {
        Student oldest = students[0];
        for (Student s : students) {
            if (s.age > oldest.age) {
                oldest = s;
            }
        }
        return oldest;
    }
class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void printInfo(){
        System.out.println(name + " is " + age + " years old");
    }

}
