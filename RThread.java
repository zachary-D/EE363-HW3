class RThread implements runnable
{
	private Thread myThr;
	
	static int thrNum = -1;
	
	public RThread()
	{
		thrNum++;
		myThr = new Thread(this, Integer.toString(thrNum));
		myThr.start();
	}
	
	public void join()
	{
		myThr.join();
	}
	
	public void run()
	{
		
	}

};
