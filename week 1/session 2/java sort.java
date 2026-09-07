import java.util.*;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {

        // 1. Higher CGPA first
        if (s1.getCgpa() != s2.getCgpa()) {
            return Double.compare(s2.getCgpa(), s1.getCgpa());
        }

        // 2. If CGPA is same, sort by name
        int nameCompare = s1.getName().compareTo(s2.getName());

        if (nameCompare != 0) {
            return nameCompare;
        }

        // 3. If name is also same, smaller ID first
        return Integer.compare(s1.getId(), s2.getId());
    }
}

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            students.add(new Student(id, name, cgpa));
        }

        Collections.sort(students, new StudentComparator());

        for (Student s : students) {
            System.out.println(s.getName());
        }

        sc.close();
    }
}
Input
5
33 Ramesh 3.68
85 Aakash 3.85
99 Raj 3.68
55 Aakash 3.85
12 Kumar 3.95
Output
12 Kumar
55 Aakash
85 Aakash
33 Ramesh
99 Raj
