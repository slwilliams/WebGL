public class UniqueLevels
{
	public static void main(String[] args)
	{
		int[] levels = new int[256];
		
		for(int i = 0; i < levels.length; i ++)
		{
			int level = (int)(Math.pow(i/255.0, (1.0/2.2))*255.0);
			levels[level] ++;
		} 
			
	  int cnt = 0;
		for(int i = 0; i < levels.length; i ++)
			if(levels[i] != 0)
				cnt ++;
	
		System.out.println("Unique levels: " + cnt);
	}
	
}