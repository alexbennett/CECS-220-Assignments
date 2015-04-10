package problem_5;

public class Document
{
	String name, description, designation;

	public Document(String name, String description, String designation) throws InvalidDocumentCodeException
	{
		if(designation.startsWith("U") || designation.startsWith("C") || designation.startsWith("P"))
		{
			this.name = name;
			this.description = description;
			this.designation = designation;
		}
		else
		{
			throw new InvalidDocumentCodeException("No valid document designation found for document named \"" + name + "\".");
		}
	}

	public String getName()
	{
		return name;
	}

	public String getDescription()
	{
		return description;
	}

	public String getDesignation()
	{
		return designation;
	}
}
