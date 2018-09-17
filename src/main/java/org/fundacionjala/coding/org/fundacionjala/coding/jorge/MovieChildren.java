

public class MovieChildren extends Movie{

	public MovieChildren(String title) {
		super(title);
		set_priceCode(PriceCode.CHILDRENS);
	}

	@Override
	public double calculateAmount(int nDays) {
		
		double Amount=getPriceCode().getValue();
		if (nDays > 3)
            Amount += (nDays - 3) * 1.5;
		return Amount;		
	}

}
