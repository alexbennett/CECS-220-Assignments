//********************************************************************
// DVDCollection.java Author: Lewis/Loftus
//
// Represents a collection of DVD movies.
//********************************************************************
package problem_4;

import java.text.NumberFormat;
import java.util.TreeMap;

public class DVDCollection
{
	private DVD[] collection;
	private int count;
	private double totalCost;

	// -----------------------------------------------------------------
	// Constructor: Creates an initially empty collection.
	// -----------------------------------------------------------------
	public DVDCollection()
	{
		collection = new DVD[100];
		count = 0;
		totalCost = 0.0;
	}

	// -----------------------------------------------------------------
	// Adds a DVD to the collection, increasing the size of the
	// collection array if necessary.
	// -----------------------------------------------------------------
	public void addDVD(String title, String director, int year, double cost, boolean bluray)
	{
		if(count == collection.length) increaseSize();
		collection[count] = new DVD(title, director, year, cost, bluray);
		totalCost += cost;
		count++;

		// Sort array
		TreeMap<String, DVD> movies = new TreeMap<String, DVD>();

		for(int i = 0; i < count; i++)
		{
			movies.put(collection[i].getTitle(), collection[i]);
		}

		for(int i = 0; i < count; i++)
		{
			collection[i] = (DVD) movies.values().toArray()[i];
		}
	}

	// -----------------------------------------------------------------
	// Returns a report describing the DVD collection.
	// -----------------------------------------------------------------
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
		report += "My DVD Collection\n\n";
		report += "Number of DVDs: " + count + "\n";
		report += "Total cost: " + fmt.format(totalCost) + "\n";
		report += "Average cost: " + fmt.format(totalCost / count);
		report += "\n\nDVD List:\n\n";
		for(int dvd = 0; dvd < count; dvd++)
			report += collection[dvd].toString() + "\n";
		return report;
	}

	// -----------------------------------------------------------------
	// Increases the capacity of the collection by creating a
	// larger array and copying the existing collection into it.
	// -----------------------------------------------------------------
	private void increaseSize()
	{
		DVD[] temp = new DVD[collection.length * 2];
		for(int dvd = 0; dvd < collection.length; dvd++)
			temp[dvd] = collection[dvd];
		collection = temp;
	}
}