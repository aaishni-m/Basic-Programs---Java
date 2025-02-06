class PopulationCensus 
{
	public static void main(String[] args) 
	{
		// based on the following data: one birth every 7 sec, one death every 13 secs, one immigrant every 45 secs, find the population after 5 years assume each year has 365 days
		long currentPopulation = 312032486;
		final long seconds = (365*24*60*60)*5;
		long birth = seconds/7;
		long death = seconds/13;
		long immigrants = seconds/45;

		long newPopulation = currentPopulation + birth + immigrants - death;
		System.out.println("Current Population: "+ currentPopulation);
		System.out.println("New Population: "+ newPopulation);
	}
}
