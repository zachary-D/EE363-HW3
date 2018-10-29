import java.lang.Math

class RThread implements runnable
{
	private Thread myThr;
	private int start;
	private int end;
	
	double average;
	
	public RThread(String threadName, int start, int end)
	{
		this->name = threadName;
		this->start = start;
		this->end = end;
		myThr = new Thread(this, threadName);
		myThr.start();
	}
	
	public void join()
	{
		myThr.join();
	}
	
	public void run()
	{
		int sum = 0;
		
		for(int i = start, i <= end; i++)
		{
			sum += sqrt(i)
		}
		
		average = sum / (end - start);
		
		System.out.print("[" + name + "]: Average of square roots (" + start + " to " + end + ") = " average);
	}

};
