
public class Person implements ComparableContent<Person>
{
   int Alter;
   int Schuhgroesse;
   int koerperhoehe;
   String Name;

   public Person(int pAlter,int pSchuh,int pkoerp,String pName)
   {
       Alter=pAlter;Schuhgroesse=pSchuh;koerperhoehe=pkoerp;Name=pName;
   }
   public boolean isLess(Person P)
   {
       if(P.koerperhoehe>this.koerperhoehe)
           return true;
       else
           return false;
   }
   public boolean isGreater(Person P)
   {
      if(P.koerperhoehe<this.koerperhoehe)
            return true;
       else
           return false;
   }
   public boolean isEqual(Person P)
   {
       if(P.koerperhoehe==this.koerperhoehe)
           return true;
       else
           return false;
   }
}
