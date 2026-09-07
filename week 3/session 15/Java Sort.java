import java.util.*;

class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Student> students =
            new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            students.add(
                new Student(id, name, cgpa)
            );
        }

        Collections.sort(students, (a, b) -> {

            // Higher CGPA first
            if (a.cgpa != b.cgpa) {
                return Double.compare(b.cgpa, a.cgpa);
            }

            // Alphabetical name
            int nameCompare =
                a.name.compareTo(b.name);

            if (nameCompare != 0) {
                return nameCompare;
            }

            // Lower ID first
            return Integer.compare(a.id, b.id);
        });

        for (Student s : students) {
            System.out.println(s.name);
        }

        sc.close();
    }
}

Input
5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76
Output
Ashis
Fahim
Samara
Samiha
Rumpa
