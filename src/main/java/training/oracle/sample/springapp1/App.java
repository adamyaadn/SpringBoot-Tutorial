package training.oracle.sample.springapp1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.trg.beans.Department;
import training.trg.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx 
        = new ClassPathXmlApplicationContext("beans.xml");
        Department d = (Department) ctx.getBean("dept1");
        System.out.println(d);
        
        Employee e = ctx.getBean("emp1",Employee.class); //Singleton
        System.out.println(e);
        
        Employee eDouble = ctx.getBean("emp1",Employee.class); //Singleton
        eDouble.setName("Dup Name");
        System.out.println(e);
        System.out.println(eDouble);
        
        Employee e2 = ctx.getBean("emp2",Employee.class); //Prototype
        System.out.println(e2);
        
        Employee e2Dup = ctx.getBean("emp2",Employee.class); //Prototype
        e2Dup.setSalary(89000);
        System.out.println(e2);
        System.out.println(e2Dup);
        
        System.out.println("");
        System.out.println("Autowiring");
        System.out.println("");
        
//        Employee e3 = ctx.getBean("emp3",Employee.class); //Singleton
//        System.out.println(e3);
        
        ctx.close();
    }
}

//lazy-init : control the lifecycle of bean based on its existence. Only create bean when asked for it.
//Singleton bean : gets created whether or not used
//Prototype : Only gets created when asked for it
//Singleton beans are mutable. Prototype beans are immutable.
//init-method : method called at creation of a bean
//detroy-method : method called at destruction of a bean
//autowire : automatically map the type of bean needed to be referenced - byType or byName

