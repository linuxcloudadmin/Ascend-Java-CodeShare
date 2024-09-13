<?xml version="1.0" encoding="UTF-8"?>


<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xmlns:context = "http://www.springframework.org/schema/context"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
   http://www.springframework.org/schema/context
   http://www.springframework.org/schema/context/spring-context-3.0.xsd">
  
   <context:annotation-config></context:annotation-config>
 
  


<bean id="emp" class="com.walmart.FirstSpringCoreDemo.model.Employee" >
<property name="id" value="10">               </property>
<property name="name" value="ben">               </property>

</bean>
</beans>


--------------------------------------------------------------------
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.walmart.FirstSpringCoreDemo.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
       Employee c=ctx.getBean("emp",Employee.class);//Object
       
       System.out.println(c);
    }
}
