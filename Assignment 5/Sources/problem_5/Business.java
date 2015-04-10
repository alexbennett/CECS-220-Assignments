package problem_5;

public class Business
{
	public static void main(String... args)
	{
		// Create new documents and display information
		Document doc1, doc2, doc3;

		try
		{
			doc1 = new Document("Document #1", "This is the description of document 1.", "U-4522");
			doc2 = new Document("Document #2", "This is the description of document 2.", "P-3789");
			doc3 = new Document("Document #3", "This is the description of document 3.", "X-0102");
		}
		catch(InvalidDocumentCodeException exception)
		{
			// Print error
			System.out.println("ERROR: " + exception.getMessage());

			// Terminate
			return;
		}
	}
}
