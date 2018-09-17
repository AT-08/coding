

public enum PriceCode {
	
	//Aqui se definen los precios.
	CHILDRENS   (1.5),
	REGULAR 	(2.0),
	NEW_RELEASE	(3.0);
	
	private final double price;
	
	private PriceCode(double prCd)
	{
		this.price=prCd;
	}
	
	double getValue()
	{
		return this.price;
	}
}
