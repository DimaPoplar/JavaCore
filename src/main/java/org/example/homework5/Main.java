package org.example.homework5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        List<Student> students = Arrays.asList(
                new Student("Saska", Arrays.asList(4.5, 5.0, 4.0), "Информатика"),
                new Student("Nautro", Arrays.asList(4.0, 4.5, 4.8), "Информатика"),
                new Student("Sasura", Arrays.asList(3.5, 4.0, 3.8), "Физика"),
                new Student("Kakasha", Arrays.asList(4.7, 2.0, 4.5), "Информатика"),
                new Student("Ryka", Arrays.asList(4.2, 4.3, 4.6), "Информатика"),
                new Student("Lotca", Arrays.asList(4.8, 4.7, 4.9), "Физика")
        );

        List<Student> result = students.stream()
                .filter(student -> student.getSpecialty().equals("Информатика")) // фильтруем по специальности "Информатика"
                .filter(student -> student.getAverageGrade() > 4.5) // фильтруем по среднему баллу выше 4.5
                .sorted(Comparator.comparingDouble(Student::getAverageGrade).reversed()) // сортируем по убыванию среднего балла
                .limit(5) // ограничиваем количество элементов до 5
                .toList();
        result.forEach(student -> System.out.println(student.getName()));
    }

    static class Student {
        private String name;
        private List<Double> grades;
        private String specialty;

        public Student(String name, List<Double> grades, String specialty) {
            this.name = name;
            this.grades = grades;
            this.specialty = specialty;
        }

        public double getAverageGrade() {
            double result = 0;
            for (Double grade : grades) {
                result += grade;
            }
            return result;
        }


        public Object getSpecialty() {
            return specialty;
        }

        public void setSpecialty(String specialty) {
            this.specialty = specialty;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


}
