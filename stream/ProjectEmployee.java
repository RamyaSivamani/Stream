package com.kgfsl.stream;
import java.util.*;
public class ProjectEmployee {
private List<Integer> eid;;
private List<Integer> pid;
ProjectEmployee(List<Integer> eid,List<Integer> pid)
{
 this.eid=eid;
 this.pid=pid;
}
public List<Integer> getEid()
{
    return eid;
}
public List<Integer> getPid()
{
    return pid;
}
public String toString()
{
    return "empid: " +eid+  "\tproid:"+pid+"\n";
}
}