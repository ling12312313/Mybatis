package ling.pojo;

import lombok.*;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter@Setter
public class Blog {

        private String id;
        private String title;
        private String author;
        private Date createTime;
        private int views;
}
