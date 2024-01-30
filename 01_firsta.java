// Java program that takes a number as input and prints its multiplication table upto 10.
class firsta
{
public static void main(String a[])
{
int no,i,mul;
no=Integer.parseInt(a[0]);
i=1;
do{
mul=no*i;
System.out.println(no+" X " +i+" = "+mul);
i=i+1;
}
while(i<=10);
}
}
