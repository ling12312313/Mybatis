package ling.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private int id;
    private String name;
    private Teacher teacher;
    public Student(int id,String name,int tid){
        this.name = name;
        this.id = id;
    }
}
