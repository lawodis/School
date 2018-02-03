//Jack Wood

public class GoldPiece extends Currency
{
	private static final String CURRENCY_TYPE = "gold piece";
	
	public GoldPiece()
	{
		this("");
	}
	
	public GoldPiece(String name)
	{
		super(name, CURRENCY_TYPE);
	}
}
