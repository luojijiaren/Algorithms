import java.io.*;
import java.util.Scanner;
import java.util.Iterator;

public class Stats
{
  public static void main(String[] args)
  {
    Bag<Double> numbers=new Bag<Double>();
	Iterator<double> i=collection.iterator();

    while (i.hasNext())
		numbers=i.next();
	int N= numbers.size();
	
	double sum=0.0;
	for(double x:numbers)
		sum+=x;
	double mean =sum/N;

	sum=0.0;
	for(double x:numbers)
		sum += (x-mean)*(x-mean);
	double std=Math.sqrt(sum/(N-1));
	System.out.printf("Mean:%.2f\n",mean);
  }
}

    