package parcheggio;

public class Parcheggio {

    // Inserire tutti gli attributi necessari, eventualmente creare altre classi
	
	String indirizzo;
	double costoGiornaliero;
	

	

	Automobile automobili[] = new Automobile[100];
	
	int num=0; 
	
	/**
	* Crea un nuovo Parcheggio (costruttore)
	*/
	public Parcheggio() {
	}

	/**
	* Imposta l'indirizzo del parcheggio
	*/
	public void setIndirizzo(String i) {
		indirizzo = i;
	}

	/**
	* Restituisce l'indirizzo del parcheggio
	*/
	public String getIndirizzo() {
		return indirizzo;
	}

	/**
	* Imposta il costo giornaliero del parcheggio
	*/
	public void setCostoGiornaliero(double c) {
		costoGiornaliero = c;
	}

	/**
	* Restituisce il costo giornaliero del parcheggio
	*/
	public double getCostoGiornaliero() {
		return costoGiornaliero;
	}

	/**
	* Gestisce l'ingresso di una nuova automobile nel parcheggio
	*/  
	public void ingresso(String t, String mm, int p, int ng) {


		
		
		Automobile temp = new Automobile();
		temp.targa = t;
		temp.marca = mm;
		temp.posto = p;
		temp.numeroGiorni = ng;
		
		automobili[num] = temp;
		
		num++;
		
	}

	/**
	* Restituisce le informazioni relative all'ultimo ingresso 
	*/  
	public String ultimo() {

		Automobile temp = automobili[num-1];
		
		return temp.targa+", "+temp.marca+", "+
						temp.posto+", "+temp.numeroGiorni;
		
	}

	/**
	* Restituisce le informazioni relative all'automobile la cui targa e' passata come parametro 
	*/  
	public String automobile(String t) {
		


		for(int i=0;i<num;i++)
		{
			if(automobili[i].targa == t)
				return automobili[i].targa+", "+automobili[i].marca+", "+
						automobili[i].posto+", "+automobili[i].numeroGiorni;
		}
		
		return null;
	}

	/**
	* Restituisce il costo medio della sosta per le automobili parcheggiate 
	*/  
	public double mediaCosti() {
		
	
		
		double somma=0.0;
		
		for(int i=0;i<num;i++)
			somma+=automobili[i].numeroGiorni*costoGiornaliero;
		
		return somma/num;
		
	}	
	
}
