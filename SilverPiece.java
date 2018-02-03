//Jack Wood

public class SilverPiece extends Currency
{
	private static final String CURRENCY_TYPE = "silver piece";
	
	public SilverPiece()
	{
		this("");
	}
	
	public SilverPiece(String name)
	{
		super(name, CURRENCY_TYPE);
	}
}
