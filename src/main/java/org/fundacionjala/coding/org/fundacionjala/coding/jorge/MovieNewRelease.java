

public class MovieNewRelease extends Movie {

	public MovieNewRelease(String title) {
		super(title);
		set_priceCode(PriceCode.NEW_RELEASE);
	}

	@Override
	public double calculateAmount(int nDays) {
		return nDays*(getPriceCode().getValue());		
	}
	
	@Override
	public int getFrequentPoints(int nDays)
	{
		int resp=0;
		if(nDays>1)
		{
			resp = 1;
		}
		return resp;
	}
}
