package com.javashitang._53;

import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author lilimin
 * @since 2021-08-04
 */
public class SolutionTest {

    @Test
    public void maxSubArray() {
        int[] array = {-2, -1};
        Solution solution = new Solution();
        int i = solution.maxSubArray(array);
        System.out.println(i);
    }

    public class Student {
        private int age;
        private String name;
        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    @Test
    public void test() {
        Queue<Student> students = new PriorityQueue<>((t1, t2) -> t1.age - t2.age);
        students.add(new Student(2, "1"));
        students.add(new Student(1, "1"));
        students.add(new Student(1, "2"));
        students.add(new Student(1, "3"));
        while (!students.isEmpty()) {
            System.out.println(students.poll());
        }

    }
}