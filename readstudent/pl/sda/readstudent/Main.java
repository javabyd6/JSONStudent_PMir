package pl.sda.readstudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        try {

            Student[] students = mapper.readValue(new File("studentsList.json"),Student[].class);
            List<Student> studentList = Arrays.asList(students);
            studentList.stream().forEach(s-> System.out.println(students));
            

        } catch (IOException e) {
            //e.printStackTrace();
        }
    }
}
