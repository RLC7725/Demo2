class Rectangle
{
int length,breadth;
Rectangle(int l,int b)
{
length=l;
breadth=b;
}
int area()
{
int area=(length*breadth);
System.out.println("Area of rectangle="+area);
return area;
}
}
class Rectbox extends Rectangle
{
int height;
Rectbox(int h)
{
super(4,3);
height=h;
}
void Rect1()
{
int vol=(area()*height);
System.out.println("Volume of rectangle"+vol);
}
}
class Area
{
public static void main(String[] str)
{
Rectbox ob=new Rectbox(6);
ob.Rect1();
}
}