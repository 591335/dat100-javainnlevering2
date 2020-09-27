package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		
		System.out.print("[ ");
		for (int tall : tabell) {
			System.out.print(tall + " ");
		}
		
		System.out.print("]");

	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		System.out.print("[");
		
		String tabTxt = "["; 
		for (int tall = 0; tall < tabell.length; tall++) {
			if (tall == 0) {
				tabTxt += tabell[tall];
			} else {
				tabTxt += "," + tabell[tall];
			}
		}
		tabTxt += "]";
		return tabTxt;
	}

	// c)
	public static int summer(int[] tabell) {
		
		// For løkke:
		/*int sum1 = 0;
		*for (int tall = 0; tall < tabell.length; tall++) {
		*	sum1 += tall;
		*}
		*System.out.print("Sum av tall i tabell: " + sum1);
		*
		*While løkke: 
		*int sum3 = 0; int i = 0;
		*while (i < tabell.length) {
		*	sum3 += i;
		*}
		*System.out.print("Sum av tall i tabell: " + sum3);
		*
		*
		*Utvidet for løkke: 
		*/
		int sum2 = 0;
		for (int tall : tabell) {
			sum2 += tall;
		}
		System.out.print("Sum av tall i tabell: " + sum2);
		return sum2;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		boolean funnet = false;
		int pos = 0;
		while (!funnet && pos < tabell.length) {
			if (tall == tabell[pos]) {
				funnet = true;
			}
			pos++;
		}
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for(int i = 0; i < tabell.length; i++) {
			if(tall == tabell[i]) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		int[] nyTabell = new int [tabell.length];
		
		for (int tall = 0; tall < tabell.length; tall++) {
			int nyIndeks = tabell.length - tall - 1;
			nyTabell[nyIndeks] = tabell[tall];
		}
		return nyTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
        for (int tall = 0; tall < tabell.length - 1; tall++) {
            if (tabell[tall] >= tabell[tall + 1]) {
                return false;
            }

        }
        return true;
    }

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		int length = tabell1.length + tabell2.length;
		int[] sammenTabell = new int [length];
		
		int pos = 0;  
		for (int element : tabell1) 
		{  
		sammenTabell[pos] = element;  
		pos++;  
		}  
		for (int element : tabell2)
		{  
		sammenTabell[pos] = element;  
		pos++;  
		}  
		System.out.println(sammenTabell);
		return sammenTabell;
	}
}
