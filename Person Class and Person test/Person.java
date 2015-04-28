/* person class
Steven Croft LE4 */

public class Person
{
   // fields
   protected String name;
   protected String dateOfBirth;
   protected float salary;
   
   // constructor   
   public Person ( String n, String dob, float s )
   {
      name = n;
      dateOfBirth = dob;
      salary = s;
   }
   
   // accessors   
   public String getName () { return name; }
   public String getDateOfBirth () { return dateOfBirth; }
   public float getSalary () { return salary; }
   
   // mutators   
   public void setName ( String n) { name = n; }
   public void setDateOfBirth ( String dob) { dateOfBirth = dob; }
   public void setSalary (float s) { salary = s; }
   
   // methods
   public String toString ()
   {
      return "name: " + name + "Date of Birth: " + dateOfBirth + "Salary: " + salary ;
   }
      
}