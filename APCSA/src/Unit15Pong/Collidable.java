package Unit15Pong;

public interface Collidable 
{
	public boolean didCollideLeft(Object obj);
	public boolean didCollideRight(Object obj);
	public boolean didCollideTop(Object obj);
	public boolean didCollideBottom(Object obj);

}