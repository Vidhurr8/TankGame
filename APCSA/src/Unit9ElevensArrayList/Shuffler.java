package Unit9ElevensArrayList;
import java.lang.Math;
import java.util.ArrayList;

public class Shuffler 
{ 
	   
	  /**
	   * The number of consecutive shuffle steps to be performed in each call 
	   * to each sorting procedure. Experiment with different values. 
	   */ 
	  private static final int SHUFFLE_COUNT = 8; 
	   
	  /**
	   * The number of values to fill the values array with. Experiment with different values, 
	   * including both even numbers and odd numbers. 
	   */ 
	  private static final int VALUE_COUNT = 52; 
	   
	   
	  /**
	   * Tests shuffling methods. 
	   * @param args is not used. 
	   */ 
	  public static void main(String[] args)
	  { 
	    System.out.println("Results of " + SHUFFLE_COUNT + 
	                       " consecutive perfect shuffles:"); 
	    ArrayList<Integer> values1 = new ArrayList<Integer>(VALUE_COUNT);
	    //int[] values1 = new int[VALUE_COUNT]; 
	    for (int i = 0; i < VALUE_COUNT; i++) 
	    {
	      values1.set(i, i);
	    }
	   
	    for (int j = 1; j <= SHUFFLE_COUNT; j++) 
	    { 
	      perfectShuffle(values1); 
	      System.out.print("  " + j + ":"); 
	      for (int k = 0; k < values1.size(); k++) 
	      { 
	        System.out.print(" " + values1.get(k)); 
	      } 
	      System.out.println(); 
	    } 
	    System.out.println(); 
	     
	    System.out.println("Results of " + SHUFFLE_COUNT + 
	                       " consecutive efficient selection shuffles:"); 
	    
	    ArrayList<Integer> values2 = new ArrayList<Integer>(VALUE_COUNT);
	    //int[] values2 = new int[VALUE_COUNT]; 
	    for (int i = 0; i < VALUE_COUNT; i++) 
	    { 
	    	values2.set(i, i);
	    } 
	     
	    for (int j = 1; j <= SHUFFLE_COUNT; j++) 
	    { 
	      selectionShuffle(values2); 
	      System.out.print("  " + j + ":"); 
	      for (int k = 0; k < values2.size(); k++) 
	      { 
	        System.out.print(" " + values2.get(k)); 
	      } 
	      System.out.println(); 
	    } 
	    System.out.println(); 
	  } 
	   
	   
	  /**
	   * Apply a "perfect shuffle" to the argument. 
	   * The perfect shuffle algorithm splits the deck in half, then interleaves 
	   * the cards in one half with the cards in the other. 
	   * @param values is an array of integers simulating cards to be shuffled. 
	   */ 
	  public static void perfectShuffle(ArrayList<Integer> values) 
	  { 
		ArrayList<Integer> shuffled = new ArrayList<Integer>(VALUE_COUNT);
	    //int[] shuffled = new int[VALUE_COUNT]; 
	    int indexCount = 0; 
	    
	    for (int i=0; i<VALUE_COUNT/2; i++) 
	    { 
	    	shuffled.set(indexCount, values.get(i));
	      //shuffled[indexCount] = values[i]; 
	      indexCount += 2; 
	    } 
	     
	    indexCount = 1; 
	     
	    for (int i=VALUE_COUNT/2; i<shuffled.size(); i++) 
	    { 
	      if (indexCount == shuffled.size()) break; 
	      shuffled.set(indexCount, values.get(i));
	      //shuffled[indexCount] = values[i]; 
	      indexCount += 2; 
	    } 
	     
	    for (int i=0; i<VALUE_COUNT; i++) 
	    { 
	    	values.set(i, (Integer)shuffled.get(i));
	    	//values[i] = shuffled[i]; 
	    } 
	  } 
	   
	   
	  /**
	   * Apply an "efficient selection shuffle" to the argument. 
	   * The selection shuffle algorithm conceptually maintains two sequences 
	   * of cards: the selected cards (initially empty) and the not-yet-selected 
	   * cards (initially the entire deck). It repeatedly does the following until 
	   * all cards have been selected: randomly remove a card from those not yet 
	   * selected and add it to the selected cards. 
	   * An efficient version of this algorithm makes use of arrays to avoid 
	   * searching for an as-yet-unselected card. 
	   * @param values is an array of integers simulating cards to be shuffled. 
	   */ 
	  public static void selectionShuffle(ArrayList<Integer> values) 
	  { 
	    int indexCount = VALUE_COUNT - 1; 
	    int randomInt; 
	    int temp; 
	     
	    for (indexCount=indexCount; indexCount>1; indexCount--) 
	    { 
	      randomInt = (int) (Math.random() * VALUE_COUNT); 
	      temp = values.get(indexCount); 
	      values.set(indexCount, values.get(randomInt)); 
	      values.set(randomInt, temp); 
	    } 
	  } 
	}