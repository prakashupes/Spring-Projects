package test1package;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contex = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach aCoach =contex.getBean("myCoach",Coach.class);
		System.out.println(aCoach.Mytasks());
		System.out.println(aCoach.myFortune());
		contex.close();
		
		/*Dependency injection:
		1.Constructor injection: Consider a problem, what if the class for which we are defining, having a argument constructor,
		For that if we assign a simple bean then that will give error beacuse now constuvtor have the argument. 
		So we need to do assign the constructor injection:
		
		lets say now coach interface will return now one more function called myFortune();
			Now coach is dependent on other interface to complete this task.
			Step: 1. Define the dependency interface and class
			Interface: FortuneService have method public string get fortune.
			class: FortuneHelper implements FortuneService.
			
			step 2. Add constructor to our class
			 BaseballCoach(FortuneService obj) {fortuneservice=obj}
			 
			 step 3: add dependency in xml file
			 <bean id="fortune"
          		class="test1package.FortuneHelper">
    		</bean>
			 <bean id="myCoach"
          		class="test1package.BaseballCoach">
          		<constructor-arg ref="fortune"/>
    		</bean>
    		
    		name="fortuneService" ref="fortune"
    		Behind the scene:
    		Spring: does the following for the xml:
    		 FortuneHelper fObj=new FortuneHelper();
    		 BaseballCoach coach=new BaseballCoach(fObj);
    		 
    		     <bean id="myCoach"
          class="test1package.CricketCoach">
          <constructor-arg ref="fortune"/> 
          </bean>	public String getEmail()
	{
		
		return this.email;
	}
	public String getTeam()
	{
		
		return this.team;
	}
       
          
           		 
		2. setter injection:
			Let say we have setters, So instead of writing code for them, We can use spring functionality to set the values through 
			the setters.
		 	1.Create setter method in class to injection
		 	2.Configure the dependency in spring config file
		 
		*/
		

	}

}
