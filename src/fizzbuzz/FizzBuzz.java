package fizzbuzz;

public class FizzBuzz {
	private static final int[] numSpeciaux = {3,5};
	private static final String[] traduction= {"FIZZ","BUZZ"};
	
	public String fizzbuzz (int numero) {
		StringBuilder sb=new StringBuilder();
		for (int i=0;i<numSpeciaux.length;i++) {
			if (numero%numSpeciaux[i]==0)
				sb.append( traduction[i]);
		}
		
		if(sb.length()==0)
			return Integer.toString(numero);
		return sb.toString();
	}

}
