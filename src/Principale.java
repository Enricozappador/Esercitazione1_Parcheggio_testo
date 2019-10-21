import parcheggio.Parcheggio;

/**
 * Classe con un metodo main() di esempio
 */

public class Principale {

    /**
     * Esempio d'uso della classe Parcheggio
     */
	
	public static void main(String[] args) {

		// PRIMA PARTE - Questa parte serve per familiarizzare con il metodo main() e con la sintassi del linguaggio

		System.out.println("*************************************************************************************");
		System.out.println("*                                   Prima parte                                     *");
		System.out.println("*        Far stampare qui sotto le informazioni sulle automobili parcheggiate       *");
	    System.out.println("*                    interagendo solo con la classe Principale                      *");
		System.out.println("*************************************************************************************\n");
		
		// Operando solo sulla classe Principale contenente il main(), memorizzare le informazioni relative a due automobili

		// Prima automobile: targa AB123CD, marca/modello Fiat Panda, posto assegnato 12, numero di giorni 3
		// Seconda automobile: targa EF456GH, marca/modello Alfa Romeo Giulietta, posto assegnato 45, numero di giorni 6

		String targa1 = "AB123CD";
		String marca1 = "Fiat Panda";
		int posto1 = 12;
		int numeroGiorni1 = 3;
		
		String targa2 = "EF456GH";
		String marca2 = "Alfa Romeo Giuletta";
		int posto2 = 45;
		int numeroGiorni2 = 6;
		
		// Stampare le informazioni relative alle automobili parcheggiate una per riga, nel formato targa, 
		// marca/modello, posto e numero di giorni, separate da una virgola seguita da uno spazio, ad esempio:

		// AB123CD, Fiat Panda, 12, 3
		// EF456GH, Alfa Romeo Giulietta, 45, 6 

		System.out.println(targa1+", "+marca1+", "+posto1+", "+numeroGiorni1);
		System.out.println(targa2+", "+marca2+", "+posto2+", "+numeroGiorni2);
		
		// Facendo riferimento alle conoscenze già possedute relative alla programmazione procedurale (es. in linguaggio C), 
		// creare una struttura dati in grado di memorizzare le informazioni relative a più automobili e la si stampi con il 
		// suddetto formato
		
		String arrayTarghe[] = new String[100];
		String arrayMarche[] = new String[100];
		int arrayPosti[] = new int[100];
		int arrayGiorni[] = new int[100];
		
		int num = 0;
		
		arrayTarghe[0] = "AB123CD"; // [num]
		arrayMarche[0] = "Fiat Panda";
		arrayPosti[0] = 12;
		arrayGiorni[0] = 3;
		
		num++;
		
		arrayTarghe[1] = "EF456GH"; // [num]
		arrayMarche[1] = "Alfa Romeo Giulietta";
		arrayPosti[1] = 45;
		arrayGiorni[1] = 6;
		
		num++;
		
		for(int i = 0; i < num; i++) {
			System.out.println(arrayTarghe[i]+", "+arrayMarche[i]+", "
					+ arrayPosti[i]+", "+arrayGiorni[i]);
		}
		
		calcolaPercentualePostiOccupati(num);
		
		
		// Si assuma che il parcheggio disponga di 100 posti e che quello sia pertanto il numero massimo di automobili ospitabili 
		
		// Creare una funzione, fuori dal main(), che calcoli la percentuale di posti occupati, e stampare il valore ottenuto (es. 2.0%)
		

		// SECONDA PARTE - Iniziare a ragionare in termini di classi e oggetti
		
		System.out.println("");
		System.out.println("*************************************************************************************");
		System.out.println("*                                   Seconda parte                                   *");
		System.out.println("*   Modificando la classe Parcheggio (ed eventualmente aggiungendo altre classi),   *");
		System.out.println("*    di seguito verranno mostrate le altre informazioni memorizzate dal sistema     *");
		System.out.println("*************************************************************************************\n");
		
		// Viene creato un nuovo parcheggio, e se ne imposta l'indirizzo ed il costo giornaliero con i metodi setIndirizzo()
		// e setCostoGiornaliero()
		
		Parcheggio p = new Parcheggio();
		p.setIndirizzo("Via dei Parcheggi 01");
		p.setCostoGiornaliero(10.0);
		
		// L'indirizzo ed il costo giornaliero del particolare parcheggio sono accessibili tramite i metodi getIndirizzo() 
		// e getcostoGiornaliero()

		String indirizzo = p.getIndirizzo();
		double costoGiornaliero = p.getCostoGiornaliero();
		
		System.out.println("Creato parcheggio in "+indirizzo+", costo giornaliero "+costoGiornaliero);
		
		// L'ingresso di un'automobile viene gestito tramite il metodo ingressoAutomobile() che riceve quattro parametri:
		// targa, marca/modello, posto assegnato e numero di giorni
		
		p.ingresso("AB123CD", "Fiat Panda", 12, 3);
		p.ingresso("EF456GH", "Alfa Romeo Giulietta", 45, 6);
		
		// Per accedere alle informazioni relative all'ultimo ingresso si utilizza il metodo ultimo(), che restituisce 
		// una stringa contenente targa, marca/modello, posto e numero di giorni nel formato precedentemente descritto

		System.out.println("");
		System.out.println("Ultimo ingresso:");
		String ultimoIngresso = p.ultimo();
		System.out.println(ultimoIngresso);
		
		// Per accedere alle informazioni relative ad una qualsiasi delle automobili parcheggiate data la targa si 
		// utilizza il metodo automobile(), che riceve come parametro il numero di targa e restituisce una stringa 
		// con lo stesso formato utilizzato dal metodo precedente.  

		System.out.println("");
		System.out.println("Automobile con targa AB123CD:");
		String automobileCercata = p.automobile("AB123CD");
		System.out.println(automobileCercata);
	
		// Il metodo mediaCosti() restituisce un valore di tipo double relativo alla media dei costi di parcheggio, 
		// calcolata considerando il costo giornaliero ed il numero di giorni per le automobili parcheggiate

		System.out.println("");
		System.out.println("Media costi:");
		double valoreMedio = p.mediaCosti();
		System.out.println(valoreMedio);
	
	}
	
	public static void calcolaPercentualePostiOccupati(int num) {
		System.out.println(num+"%");
	}
	

}
