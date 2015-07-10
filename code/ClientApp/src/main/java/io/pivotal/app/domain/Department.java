package io.pivotal.app.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.Region;

@Region("departments")
public class Department
{	
	@Id
	private int deptno;
	private String name;
	
	public Department() 
	{
	}

	public Department(int deptno, String name) {
		super();
		this.deptno = deptno;
		this.name = name;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", name=" + name + "]";
	}

	
}
