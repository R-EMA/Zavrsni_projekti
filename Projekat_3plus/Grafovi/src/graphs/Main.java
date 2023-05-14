package graphs;

/**
 * 
 * @author emma
 * 
 * Teorija grafova - samo teorija
 *
 */

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Samo malo teorije o grafovima.");
		System.out.println("jednostavna primena: graphs3_dots/ConnectDots (Processing in JAVA)");
	}

}

/*
 * Teorija GRAFOVA
 * 
 * grafovi su matematički objekti koji se često sreću u realnom svetu
 * grafovi čine objekti i veze između objekata
 * tako, graf bi bio skup gradova i puteva (veze) između njih
 * graf je skup ljudi koji se međusobno povezuju
 * 
 * grafovi imaju veliku primenu u rešavanju problema razbibrige.
 * takozvane tangram igre gde je cilj povezati tačke tako da se linije ne ukrštaju
 * uparivanje objekata bez ukrštanja linija
 * određivanje najkraćeg puta
 * provera da li figura može biti iscrtana bez podizanja olovke ali tako da se ne prođe
 *    dva puta istim putem (linijom) i/ili iscrtavanje objekta po zadatom kriterijumu
 * 
 * primena grafova je velika i u matematici (kombinatorika, operaciona istraživanja, 
 *    linearna algebra, kompleksne analize, ...) i u računarstvu i u mnogim
 *    drugim nematematičkim obastima (elektrotehnika, fizika, hemija, bilologija, 
 *    sociologija ...)
 * 
 * neke od ozbiljnijih primena grafova
 * - algoritam posećenosti stranice
 * - algoritam širenja virusa (može se primeniti i na biološke viruse)
 * 
 * 
 * Grafovi se sastoje od čvorova (tačaka) i linija koje povezuju te čvorove (grane)
 * Ako je čvor poslednji i iz njega ne ide ni jedna linija, onda se isti označava kao list,
 *	(hm, ovo malo podseća na DOM)
 * Ako se posmatra veza između dva čvora A i B, ...
 * ako se ta veza posmatra kao dvosmerna, onda se radi o neusmerenom grafu,
 * ali ako se ista posmatra kao dve veze AB i BA, onda se radi o usmerenom grafu.
 * 
 * Pojam grafa može se proširiti dodavanjem težine granama - težinski grafovi.
 * Težinski grafovi su zgodni npr. za rešavanje problema transporta. Ukoliko su veze usmerene,
 * onda se takvi grafovi označavaju kao mreže.
 * 
 * Veoma je česta upotreba grafova za opis modela ili struktura podataka. 
 * Struktura jedne veb prezentacije se može predstaviti slikovito upotrebom grafa. 
 * Čvorovi tog grafa su pojedine stranice a grane grafa su veze kojima se može sa 
 * jedne stranice prelaziti na drugu. 
 * Dve (ili više) grane grafa su paralelne ako spajaju dva ista temena. 
 * Grana može da spaja vrh sa samim sobom, i tada se naziva petljom. 
 * Graf koji nema petlje niti paralelne grane se naziva prostim grafom. 
 * Graf je prazan ako nema nijednu granu, a nulti graf nema nijedan vrh. 
 * 
 * 
 */
