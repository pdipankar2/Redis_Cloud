package in.ashokIT.entity;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("studentHash")
public class Student {

	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	
}
