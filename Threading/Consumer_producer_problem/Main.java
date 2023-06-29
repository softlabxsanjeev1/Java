package Threading.Consumer_producer_problem;
class Main
{
	public static void main(String[] args) {		
		Company comp=new Company();
		Producer p=new Producer(comp);
		Consumer c=new Consumer(comp);
		p.start();
		c.start();

	}
}
