import java.util.*;
class Time
{
int hh;
int mm;
int ss;
public Time(int h,int m,int s)
{
hh=h;
mm=m;
ss=s;
}
public void add(Time obj1)
{
this.hh=this.hh+obj1.hh;
this.mm=this.mm+obj1.mm;
this.ss+=obj1.ss;
if(this.ss>60)
{
this.ss=this.ss-60;
this.mm+=1;
}
if(this.mm>60)
{
this.mm=this.mm-60;
this.hh+=1;
}
}
void display()
{
System.out.println(this.hh+":"+this.mm+":"+this.ss);
}
public static void main(String [] args)
{
Time obj=new Time(1,50,50);
Time obj1=new Time(2,20,30);
obj.add(obj1);
System.out.println("the addition is:");
obj.display();
}
}