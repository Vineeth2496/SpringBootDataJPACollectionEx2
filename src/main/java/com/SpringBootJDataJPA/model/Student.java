package com.SpringBootJDataJPA.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student_tab")
public class Student {
	/*
	 sid
	sname
	sfee
	marks: List<Integer>
	subnames: Set<String>
 	grades: Map<String, String>

	 */
	@Id
	@Column(name = "sid")
	private Integer stdId;
	@Column(name = "sname")
	private String stdName;
	@Column(name = "sfee")
	private Double stdFee;
	//Collection variables
	
	@ElementCollection
	@CollectionTable(
					name = "std_marks",
					joinColumns = @JoinColumn(name="sid")
					)
	@OrderColumn(name = "stdM")
	@Column(name = "smarks")
	private List<Integer> stdMarks;
	
	@ElementCollection
	@CollectionTable(
					name = "sub_name",
					joinColumns = @JoinColumn(name="sid")
					)
	@Column(name = "submarks")
	private Set<String> subjNames;
	
	@ElementCollection
	@CollectionTable(
					name = "std_grade",
					joinColumns = @JoinColumn(name="sid")
					)
	@OrderColumn(name = "stdg")
	@Column(name = "sgrades")
	private Map<String, String> grades;
	
	
	
}
