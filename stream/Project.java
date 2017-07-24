package com.kgfsl.stream;
import java.util.*;
public class Project {
private int projectid;
private String name;
private List<Integer> tid;
Project(int projectid,String name,List<Integer> tid)
{
    this.projectid=projectid;
    this.name=name;
    this.tid=tid;
}
public int getProjectid()
{
    return projectid;
}
public String getName()
{
    return name;
}
public List<Integer> getTid()
{
    return tid;
}
public String toString()
{
    return "Projectid: "+projectid+" \tName: "+name+ "\tTid:" +tid+"\n";   
}
}