package ibs.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DomainCourse {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private Integer id;
	private String course;
	private String domain;
	
	protected DomainCourse() {
		// TODO Auto-generated constructor stub
	}
	
	
	public DomainCourse(Integer id, String course, String domain) {
		super();
		this.id = id;
		this.course = course;
		this.domain = domain;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	

}
