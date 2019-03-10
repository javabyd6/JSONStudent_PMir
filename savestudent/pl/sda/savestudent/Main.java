package pl.sda.savestudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ObjectMapper students = new ObjectMapper();

        File studentListFile = new File ("studentList.json");
            List<Student> studentList = Arrays.asList(new Student("Paweł", "M", 1), new Student
                    ("Adam", "G", 2), new Student("Andrzej", "K", 3), new Student
                    ("Michał", "D", 4));
        try {
            students.writeValue(studentListFile,studentList);
        } catch (IOException e) {
            //e.printStackTrace();
        }


    }
}
