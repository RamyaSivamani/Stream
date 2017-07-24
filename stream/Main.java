package com.kgfsl.stream;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.function.Predicate;
import java.lang.*;
import java.util.stream.*;
import java.util.Date;
 import java.text.DateFormatSymbols;
 import java.lang.IllegalArgumentException;
class Main
{
public static void main(String[] args)throws ParseException {
 List<Team> team = new ArrayList<Team>();

Team t1 = new Team(001,"developing");
Team t2 = new Team(001,"developing");

team.add(t1);
team.add(t2);

List<Integer> tid1 = team.stream().map(Team::getTeamid).collect(Collectors.toList());

Project p1 = new Project(1,"ntrust",tid1);

List<Project> pro=new ArrayList<Project>();
pro.add(p1);
List<Integer> proid = pro.stream().map(Project::getProjectid).collect(Collectors.toList());

// Instantiate a Date object by invoking its constructor


    SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");
Date dt_1 =objSDF.parse("20-03-1981");
 Date dt_2 = objSDF.parse("10-08-1981");
 Date dt_3 = objSDF.parse("20-08-1995");
 Date dt_4 = objSDF.parse("9-11-1981");
 
LocalDate currentDate = LocalDate.now(); // 2016-06-17
int dom = currentDate.getDayOfMonth(); 
System.out.println(dom);
Employee e1 = new Employee(1,"ramya","developing",dt_1,"ramya@gmail.com",60000,3);
Employee e2 = new Employee(2,"preti","testing",dt_2,"preti@gmail.com",20000,8);
Employee e3 = new Employee(3,"poov","developing",dt_3,"poov@gmail.com",10000,8);
Employee e4 = new Employee(4,"santhosh","testing",dt_4,"santhosh@gmail.com",90000,11);

//String[] month={new SimpleDateFormat("mm").format(e1.getDoj()};
 //System.out.println(n);
List<Employee> emp=new ArrayList<Employee>();
emp.add(e1);
emp.add(e2);
emp.add(e3);
emp.add(e4);

List<String> n=new ArrayList<String>();

List<Integer> empid = emp.stream().map(Employee::getId).collect(Collectors.toList());

ProjectEmployee pe = new ProjectEmployee(empid,proid);

System.out.println(pe.getEid());
System.out.println("All employees details:");
for(Employee e : emp)
{
System.out.println(e);
}
}
}
