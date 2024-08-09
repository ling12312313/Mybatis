package ling.pojo;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class Student  implements Serializable {
    int id ;
    String name;
    int tid;
}
