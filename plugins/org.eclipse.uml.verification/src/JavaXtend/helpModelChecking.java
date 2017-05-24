package JavaXtend;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class helpModelChecking {

	private static int ID=-1;
	private static ArrayList <Integer> IDlist = new ArrayList <Integer> ();
	private static int vertex;
	private static int edges;
	private static List <Integer> OutORList = new ArrayList <Integer> ();
	private static List <Integer> OutANDList = new ArrayList <Integer> ();
	private static List <Integer> InORList = new ArrayList <Integer> ();
	private static List <Integer> InANDList = new ArrayList <Integer> ();
	private static Integer offsetIndex;
	private static Integer maxCycle = 0;
	private static Integer clockSize;
	private static List <String> inputList = new ArrayList <String> ();
	private static List <String> outputList = new ArrayList <String> ();
	
	public static void resetInput(){inputList.clear();}
	public static void resetOutput(){outputList.clear();}	
	public static List <String> getInput(){return inputList;}
	public static List <String> getOutput(){return outputList;}
	public static void addInput(String vertex) {inputList.add(vertex);}
	public static void addOutput(String vertex) {outputList.add(vertex);}
	
	
	public static void calculateGCD( List<Integer> cyclesList)
	{
		if (cyclesList.isEmpty())
		{
			maxCycle = 1;
			return;
		}
		maxCycle =  cyclesList.get(0);
		Integer value; 
		
		for (int i = cyclesList.size()-1; i > 0; i--)
		{
			value =cyclesList.get(i);
			maxCycle = GCD(maxCycle, value);
		}
					
	}
	
	public static Integer GCD (Integer a, Integer b){return b == 0 ? a : GCD (b,a%b); }
	
	public static Integer getGCD (){ return maxCycle;}
	
	public static Integer getclockSize (List<Integer> cyclesList){ 
		
		if (cyclesList.isEmpty() || maxCycle == 0)
		{
			return 1;
			
		}
		clockSize =  cyclesList.get(0);

		
		for (int i = cyclesList.size()-1; i > 0; i--)
		{
			clockSize +=cyclesList.get(i);
		}
		
		clockSize /=maxCycle;
		
		if (clockSize == 0)
			return 1;
		
		return clockSize;
		
	}
	
	
	public static void resetInfo()
	{
		vertex = 0;
		edges = 0; 
	}
	
	public static void addVertex(Integer v)
	{
		vertex+=v;
	}
	
	public static void addEdges(Integer e)
	{
		edges+=e;
	}
	public static Integer getVertex()
	{
		return vertex;
	}
	
	public static Integer getEdges()
	{
		return edges;
	}
	
	public static void print (String text)
	{
		
		System.out.println("DAW::"+text);
	}
	
	public static String getID()
	{
		ID++;
		return("id"+ID);
	}
	
	public static void resetID()
	{
		ID=-1;
	}
	
	public static void  setNominatedPriority(Integer ID)
	{
		IDlist.add(ID);
	}
	
	public static Integer  getNominatedPriority (Integer ID)
	{
		Iterator<Integer> iter=IDlist.iterator();
		int i=0;
		while(iter.hasNext())	  {
			i++;
			if (iter.next()==ID)
			return i;			  
		}
		return 0;
	}
	public static void  initNominatedPriority ()
	{
		IDlist.clear();
	}
	
	public static List <Integer>  unique (List <Integer> iList)
	{
		List <Integer> uniqueList = new ArrayList <Integer> ();
		Integer number;
		
		Iterator<Integer> iter=iList.iterator();
		
		while(iter.hasNext())	  
		{
			number = iter.next();
			if(!uniqueList.contains(number))
				uniqueList.add(number);
		}
		

		return uniqueList;
		
	}
	
	public static Integer randomEvent (Integer Events, Integer Size)
	{
		
		return Size % Events;
		
	}

	public static void  setInputList (List <Integer> andList, List <Integer> orList)
	{
		InANDList=andList;
		InORList=orList;
	}
	
	public static void  setOutputList (List <Integer> andList, List <Integer> orList)
	{
		OutANDList=andList;
		OutORList=orList;
	}
	
	public static List <Integer> getOutAndList(){return OutANDList;}
	public static List <Integer> getOutOrList(){return OutORList;}
	public static List <Integer> getInAndList(){return InANDList;}
	public static List <Integer> getInOrList(){return InORList;}
	
	public static List <Integer> temp(){return InANDList;}
	
	public static List <Integer> getIncreasingList (Integer size)
	{
		List <Integer> IncList = new ArrayList <Integer> ();
		
		for(int i=0; i<size; i++)
		{
			IncList.add(i);
		}
		return IncList;

	}
	
	
 	public static void setOffset(Integer offset){
 		offsetIndex=offset;
 	}
	public static Integer getOffset(){return offsetIndex;}	
}
