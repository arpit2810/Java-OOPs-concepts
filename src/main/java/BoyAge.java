public class BoyAge {
    private int age;
    public BoyAge(int age)
    {
       if(age>=0) this.age=age;
       else age=-1;
    }
    public void incrementAge(int addYear)
    {
        if(addYear>0) this.age=age+addYear;
    }

}
