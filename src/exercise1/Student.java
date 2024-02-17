package exercise1;

public class Student implements Comparable<Student>
{
	public String name;
	public int age;
	
	public Student( String name, int age )
	{
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student s)
	{
		//compares based on name
		return this.name.compareTo(s.name);
	}
}



