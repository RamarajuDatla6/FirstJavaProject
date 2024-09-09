package com.my.programs;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Stream1{
    String name;
    int id;
    float percent;

    public Stream1(String name, int id, float percent) {
        this.name = name;
        this.id = id;
        this.percent = percent;
    }
}


public class StreamMain {
    public static void main(String[] args) {

        List<Stream1> studentData = new ArrayList<Stream1>();
        studentData.add(new Stream1("A",1,55.21f));
        studentData.add(new Stream1("A",1,54.45f));
        studentData.add(new Stream1("A",1,95.21f));
        studentData.add(new Stream1("A",1,65.22f));
        studentData.add(new Stream1("A",1,63.78f));


        List<Float> studentDataCopy = studentData.stream()
                .filter(p -> p.percent > 50)                         // filtering data
                .map(p -> p.percent)                                // fetching data
                .collect(Collectors.toList());                      // collecting the student data to thelist studentDataCopy

        System.out.println(studentDataCopy);
    }
}
