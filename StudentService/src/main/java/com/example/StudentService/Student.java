package com.example.StudentService;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document(collation = "students")
public class Student {

	@Id
	private String id;
	private String studName;
	private int age;
	private String gender;
	private Integer schoolId;
}
