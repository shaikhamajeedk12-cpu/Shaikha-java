class Department{
void run(){
 System.out.println("Department is running");
 }
}
class BCA extends Department{
void run(){
 System.out.println("BCA is running smoothly");
}
}
public class MethodOverridingDemo1
{
public static void main(String[] args)
{
Department d=new Department();
d.run();
BCA b=new BCA();
b.run();
Department obj=new BCA();
obj.run();
}
}