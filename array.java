package shuzhi;

import java.util.ArrayList;

public class array {
public static void main(String[] args)
{
ArrayList al=new ArrayList();
int[] a = new int[]{11,2,9,15,13,18,14,7,12,18,9,3,1};
int max=0;
for(int i=1;i<a.length;i++)
if(a[max]<=a[i]){
max=i;
if(!al.isEmpty()&&a[(Integer)al.get(0)]==a[max])
al.add(max);
else
{
al.clear();
al.add(max);
}
}
System.out.print("最大数是:"+a[(Integer)al.get(0)]+" 下标是:");
for(int i=0;i<al.size();i++)
System.out.print(al.get(i)+" ");
}
}
