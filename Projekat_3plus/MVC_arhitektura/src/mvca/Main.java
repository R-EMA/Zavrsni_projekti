package mvca;

/**
 * 
 * @author emma
 * 
 * MVC arhitektura - primena
 * 
 * jednostavan "digitron"
 * 4 osnovne operacije: na znak + se menjaju.
 * 
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("unused")
		Korisnik k1 = new Korisnik();
	
	}

}

/*
 * 
 * MVC (енгл. Model-view-controller) arhitektura je projektni uzorak (енгл. pattern) 
 * koji se obično koristi za razvoj korisiničkih interfejsa. 
 * Počiva na ideji o ponovnoj upotrebi već postojećeg softverskog koda, 
 * olakšavanju razvoja i kasnijem održavanju aplikacionog softvera metodom razdvajanja na posebne komponente: 
 * model, prikaz podataka (pogled) i kontrolor (upravljač), pri čemu je komponenta za 
 * prikaz informacija odvojena od interakcije korisnika sa tim informacijama. 
 * 
 * Norveški informatičar Trigvi Riensku (норв. Trygve Reenskaug) je tokom posete Ziroksu sedamdesetih godina prvi put 
 * predstavio MVC arhitekturu primenjenu na Smalltalk-76.
 * On je MVC kao apstraktni prikaz arhitekture softvera definisao na sledeći način:

    Model predstavlja podatke. Podaci mogu biti samo jedan objekat ili struktura objekata. Veza između modela i onoga što vidi korisnik trebala bi da bude 1 na 1. Komunikacija između modela i spoljašnjeg sveta bi trebao da se obavlja uz pomoć kontrolora.
    Pogled ili vizualna prezentacija modela, je povezana sa modelom ili jednim njegovim delom. Ponaša se kao filter, koji iz modela naglašava određene vrednosti koji opisuju podatke (atributi), dok neke druge potiskuje i tako filtrirane podatke prikazuje korisniku. Takođe, ima mogućnost ažuriranja modela, slanjem odgovarajućih zahteva korisnika.
    Kontrolor je veza između korisnika i podataka. On korisniku, u zavisnosti od njegovog zahteva prikazuje podatke.
 * 
 */
