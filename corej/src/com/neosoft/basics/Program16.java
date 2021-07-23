package com.neosoft.basics;
import java.util.ArrayList;
import java.util.Iterator;

class Trainer{
int tr_id;
String name;
String course;
int salary;
public Trainer(int tr_id, String name, String course, int salary) {
super();
this.tr_id = tr_id;
this.name = name;
this.course = course;
this.salary = salary;
}

}

public class Program16 {

public static void main(String[] args) {
Trainer t1=new Trainer(1,"Guru","python",20000);
Trainer t2=new Trainer(2,"Meera","Java",50000);
Trainer t3=new Trainer(3,"Preeta","C++",30000);
Trainer t4=new Trainer(4,"Smith","python",20000);
Trainer t5=new Trainer(5,"John","Java",60000);

ArrayList<Trainer> list=new ArrayList<Trainer>();
list.add(t1);
list.add(t2);
list.add(t3);
list.add(t4);
list.add(t5);
Iterator itr=list.iterator();
while(itr.hasNext()) {

Trainer t=(Trainer)itr.next();
if(t.salary>20000 && t.course=="Java")
System.out.println(t.tr_id+" "+t.name+" "+t.course+" "+t.salary);
}



}

}


