package Threading.Consumer_producer_problem;

class Producer extends Thread
{

	Company c;
	Producer(Company c)
	{
		this.c=c;
	}
	public void run()
	{ 
		int i=1;
		while(true)
		{
			this.produce_item(i);
			try{Thread.sleep(1000);}catch(Exception e){}
			i++;
		}
	}
}