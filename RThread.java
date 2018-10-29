import java.lang.Math;

class RThread implements Runnable
{
	private Thread myThr;
	String name;
	private int start;
	private int end;
	
	double average;
	
	public RThread(String threadName, int _start, int _end)
	{
		name = threadName;
		start = _start;
		end = _end;
		myThr = new Thread(this, threadName);
		myThr.start();
	}
	
	public void join() throws InterruptedException
	{
		myThr.join();
	}
	
	public void run()
	{
		double sum = 0;
		
		for(int i = start; i <= end; i++)
		{
			sum += Math.sqrt(i);
		}
		
		average = sum / (end - start);
		
		System.out.println("[" + name + "]: Average of square roots (" + ((start < 10) ? "0" : "") +start + " to " + end + ") = " + average);
	}

};
