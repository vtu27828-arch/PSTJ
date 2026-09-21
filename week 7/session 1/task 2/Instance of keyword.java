import java.io.*;
import java.util.*;

class Student {
}

class Rockstar {
}

class Hacker {
}

public class Solution {

    static int count(ArrayList<Object> mylist, String name) {
        int count = 0;

        for (Object obj : mylist) {
            if (name.equals("Student") && obj instanceof Student)
                count++;

            if (name.equals("Rockstar") && obj instanceof Rockstar)
                count++;

            if (name.equals("Hacker") && obj instanceof Hacker)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Object> mylist = new ArrayList<Object>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            if (s.equals("Student"))
                mylist.add(new Student());

            if (s.equals("Rockstar"))
                mylist.add(new Rockstar());

            if (s.equals("Hacker"))
                mylist.add(new Hacker());
        }

        System.out.println(
            count(mylist, "Student") + " " +
            count(mylist, "Rockstar") + " " +
            count(mylist, "Hacker")
        );
    }
}

Sample input
5
Student
Student
Rockstar
Student
Hacker
Output
3 1 1
