package exercise1;

import java.util.Comparator;

/*The compare method, defined by the Comparator interface, compares students based
on their age. If the ages are equal, it then compares based on their name. */
class AgeCompare implements Comparator<Student>
{
    public int compare (Student s1, Student s2)
    {
        int nameCompare;
        if (s1.age < s2.age)
            return -1;
        if (s1.age > s2.age)
            return 1;
        else
        nameCompare= s1.compareTo(s2);
            return nameCompare;
    }
	
}