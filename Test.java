class Test {
	public static void main(String[] args) {
		ProbabilityMap<String> pm = new ProbabilityMap<>();
		
		int a = 0, b = 0, c = 0, d = 0, e = 0;
		int totalSelects = 1000;
		
		pm.add("A", 50);
		pm.add("B", 50);
		pm.add("C", 25);
		pm.add("D", 5);
		pm.add("RareAF", 1);
		
		for(int i = 0; i < totalSelects; i++) {
			String random = pm.get();
			if(random.equals("A")) a++;
			else if(random.equals("B")) b++;
			else if(random.equals("C")) c++;
			else if(random.equals("D")) d++;
			else if(random.equals("RareAF")) e++;
		}
		
		System.out.printf("A had a probability of %.2f%% and was selected %.2f%% \n", 
				(50.0 / (double) pm.getTotalProbability()),
				(double) a / (double) totalSelects);
		
		System.out.printf("B had a probability of %.2f%% and was selected %.2f%% \n", 
				(50.0 / (double) pm.getTotalProbability()),
				(double) b / (double) totalSelects);
		
		System.out.printf("C had a probability of %.2f%% and was selected %.2f%% \n", 
				(25.0 / (double) pm.getTotalProbability()),
				(double) c / (double) totalSelects);
		
		System.out.printf("D had a probability of %.2f%% and was selected %.2f%% \n", 
				(5 / (double) pm.getTotalProbability()),
				(double) d / (double) totalSelects);
		
		System.out.printf("RareAF had a probability of %.2f%% and was selected %.2f%% \n", 
				(1.0 / (double) pm.getTotalProbability()),
				(double) e / (double) totalSelects);
	}	
}
