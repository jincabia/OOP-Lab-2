package exercise1;

import java.util.*;

public class Driver
{

	public static void main( String[] args )
	{

		ArrayList<Student> studs = new ArrayList<>();
		studs.add( new Student( "Smith", 34 ) );
		studs.add( new Student( "Johnson", 21 ) );
		studs.add( new Student( "Williams", 67 ) );
		studs.add( new Student( "Brown", 53 ) );
		studs.add( new Student( "Jones", 48 ) );
		studs.add( new Student( "Miller", 36 ) );
		studs.add( new Student( "Davis", 44 ) );
		studs.add( new Student( "Wilson", 52 ) );
		studs.add( new Student( "Anderson", 34 ) );
		studs.add( new Student( "Moore", 33 ) );

		System.out.println("\nThis is unsorted");
		for (Student s: studs)
		{
			System.out.println(s.name + " " +
                               s.age);
		}
		


		Collections.sort(studs);

		System.out.println("\nSorted by Name");
		for (Student s: studs)
		{
			
			System.out.println(s.name + " " +
                               s.age);
		}

		

		System.out.println("\nSorted by Age");
		AgeCompare ac = new AgeCompare();
		Collections.sort(studs, ac);
		for (Student s: studs)
		{
			
			System.out.println(s.name + " " +
                               s.age);
		}

	}

}
