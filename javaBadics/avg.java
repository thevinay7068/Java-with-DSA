class Armstrong
{
public static void main (String a[])
{
int n,sum=0,temp,r;
n=153;
temp=n;
while(n>0)
{
r=n%10;
sum=sum+r*r*r;
n=n%10;
}
if(n==temp)
{
System.out.println("Armstrong number");
}
else
{
System.out.println("not Armstrong number");
}
}
}