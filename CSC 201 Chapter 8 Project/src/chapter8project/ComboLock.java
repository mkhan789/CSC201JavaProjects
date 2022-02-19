// Mohammad Khan
// Due Date 7/28/2021
// Chapter 8 Project 8.9
// Declare a class that works like the combination lock in a gym locker.
package chapter8project;

/**
 Declaring the ComboLock class that acts like a lock with three number combinations that ranges from 0 to 39.
 */
public class ComboLock {

	private int keyOne;
	private int keyTwo;
	private int keyThree;
	private int originalPos;
	private int theCurrentpos;
	
	/**
	 This will allow the lock to have the three number combinations.
	 @Param firstSecret, secondSecret, thirdSecret the keys for the lock combination.
	 */
	public ComboLock(int firstSecret, int secondSecret, int thirdSecret) {
		keyOne = firstSecret;
		keyTwo = secondSecret;
		keyThree = thirdSecret;
		originalPos = 0;
	    theCurrentpos = 0;
	}
	
	/**
	 Resets the lock, so it can be used again.
	 */
	public void reset() {
		theCurrentpos = 0;
		originalPos = 0;
	}
	
	/**
	 Allow the user to use numbers from the left turn of the lock.
	 @Param ticks the amount of ticks when turn left of the lock.
	 */
	public void turnLeft(int ticks) {
		theCurrentpos = theCurrentpos - ticks;
		if (theCurrentpos < 0) 
		{
			theCurrentpos = 39 - theCurrentpos;
		}
		if (originalPos == 1 && theCurrentpos == keyTwo) 
		{
			originalPos = 2;
		}
		else
			originalPos = 0;
	}
	
	/**
	 Allow the user to use numbers from the left turn of the lock.
	 @Param ticks the amount of ticks when turn left of the lock.
	 */
	public void turnRight(int ticks) {
		theCurrentpos = theCurrentpos + ticks;
		if (theCurrentpos > 39) 
		{
			theCurrentpos = theCurrentpos - 39;
		}
		if (originalPos == 0 && theCurrentpos == keyOne) 
		{
			originalPos = 1;
		}
		else if (originalPos == 2 && theCurrentpos == keyThree) 
		{
			originalPos = 3;
		}
		else
			originalPos = 0;
	}
	
	/**
	 This allows the user to open the lock which then ends the program.
	 */
	public void open() {
		if (originalPos == 3) 
		{
			originalPos = 4;
			System.out.println("You have open the lock.");
		}
		else 
		{
		originalPos = 0;
		System.out.println("The lock is still closed.");
	    }
	}
	/**
	 When the user turns the lock right, the values are considered positive while turning left the values are considered negative.
	 */
	public static void main(String[] args) {
		ComboLock Lock = new ComboLock(18, 11, 25);
		Lock.reset();
		Lock.turnRight(18);
		Lock.turnLeft(7);
		Lock.turnRight(14);
		Lock.open();
	}
}
