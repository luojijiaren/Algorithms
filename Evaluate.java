public class Evaluate
{
	public static void main(String[] args)
	{
		Stack <String> ops=new Stack<String>();
		Stack<Double> vals =new Stack<Double>();
		while(!StdIn.isEmpty())
		{String s=stdIn.readString();
		if (s.equals("("))                ;
		else if(s.equals("+")) ops.push(s);
        else if (s.equals(")")) 
			{
			String op=ops.pop();
			double v=vals.pop();
			if (op.equals("+")) v=vals.pop()+v;
			elif (op.equals("sqrt")) v=Math.sqrt(v);
			vals.push(v);
			}
		else vals.push(Double.parseDoulbe(s));
		}
	    System.out.println(vals.pop());
	}
}