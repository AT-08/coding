

public class MovieRegular extends Movie{

	public MovieRegular(String title) {
		super(title);
		set_priceCode(PriceCode.REGULAR);
	}

	@Override
	public double calculateAmount(int nDays) {
		
		double Amount = getPriceCode().getValue();
		if (nDays > 2)
            Amount += (nDays - 2) * 1.5;
		return Amount;		
	}

}
