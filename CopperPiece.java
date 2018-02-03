//Jack Wood

public class CopperPiece extends Currency
{
	private static final String CURRENCY_TYPE = "copper piece";
	
	public CopperPiece()
	{
		this("");
	}
	
	public CopperPiece(String name)
	{
		super(name, CURRENCY_TYPE);
	}
}
