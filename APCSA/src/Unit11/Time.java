package Unit11;

public class Time 
{
	private int hour;
	private int minute;
	private int second;
	
	public void Time(int h, int m, int s)
	{
		hour = h;
		minute = m;
		second = s;
	}
	
	public void createTime()
	{
		Time(hour, minute, second);
	}
	
	public void timeSince1970(int h, int m, int s)
	{
		long totalMilliseconds = System.currentTimeMillis();
	}
	
	public int getHour()
	{
		return hour;
	}
	
	public int getMinute()
	{
		return minute;
	}
	
	public int getSecond()
	{
		return second;
	}
	
	public String setTime(long elapsedTime)
	{
		long totalSeconds = elapsedTime / 1000;
	    
	    long currentSecond = totalSeconds % 60; 
	    
	    long totalMinutes = totalSeconds / 60;
	    
	    long currentMinute = totalMinutes % 60; 
	    
	    long totalHours = totalMinutes / 60; 
	    
	    long currentHour = totalHours % 24; 
	    
	    return "Current time is " + currentHour +":" 
	       + currentMinute +":" + currentSecond + " GMT";
	}

	public static void main(String[] args) 
	{
		
	}

}
