package keypairtwo;

import java.util.ArrayList;
import java.util.List;

public class KeyValPairApp {
	public static void main(String[] args)
	{
	
	KeyValPair<String, Integer> p1 = new KeyValPair<String, Integer>("SLC", 189899);
	KeyValPair<String, Integer> p2 = new KeyValPair<String, Integer>("NY", 8244910);
	KeyValPair<String, Integer> p3 = new KeyValPair<String, Integer>("LA", 3819702);
	KeyValPair<String, Integer> p4 = new KeyValPair<String, Integer>("SF", 812826);
	
	//Print p1 and p2
	System.out.println("p1: " + p1);
	System.out.println("p2: " + p2);
	
	//Compare p1 to p2 and print 
	System.out.println("p1.equals(p2): " + p1.equals(p2));
	System.out.println(" ");
	
	//Assign p2 to p1
	p1 = p2;
	
	//print p1 and p2 
	System.out.println("p1: " + p1);
	System.out.println("p2: " + p2);
	
	//Compare p1 to p2 and print
	System.out.println("p1.equals(p2): " + p1.equals(p2));
	System.out.println(" ");
	
	//initialize the list with key value
	List cities=new ArrayList<KeyValPair>();
	cities.add(p1);
	cities.add(p2);
	cities.add(p4);
	cities.add(p3);
	System.out.println("cities before sorting");
	for(int i=0;i<cities.size();i++)
	{
	System.out.println(cities.get(i));
	}
	System.out.println("sorting");
	List cities2=new ArrayList<KeyValPair>();
	KeyValPair kv1,kv2;
	while(cities.size()!=0)
	{
	int l=0;
	kv1=(KeyValPair) cities.get(0);
	for(int k=1;k<cities.size();k++)
	{
	kv2=(KeyValPair) cities.get(k);
	if(kv1.compareTo(kv2)<0)
	{
	l=k; 
	}
	}
	cities2.add(cities.get(l));
	cities.remove(l);
	}
	System.out.println("cities after sorting");
	for(int i=0;i<cities2.size();i++)
	{
	System.out.println(cities2.get(i));
	}
	}
}
