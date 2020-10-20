import java.util.*;
class description
{
    private int age;
    public  int getAge() {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }

}
class getters_Setters
{
    // private static int age;
    // public static int getAge() {
    //     return age;
    // }
    // public static void setAge(int age)
    // {
    //     this.age=age;
    // }
    // public String getName()
    // {
    //     this.Name=Name;
    // }
    public static void main(String args[])
    {
        description obj=new description();
        obj.setAge(20);
        System.out.println(obj.getAge());
        //obj.setName("samiksha");
     // System.out.println(obj.getName());
  
    }
}
