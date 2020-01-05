package cf222jf_assignment4.time;

public class TimeReport {

}

/* Samtliga tester m�ts i Milisekunder via en while-loop och en iterationm�tare.
 * Alla dessa k�rs 10 g�nger, och sedan ber�knas ett medeltal. Iterationerna r�knas i en sekund och sparas i
 * en variabel som sedan skrivs ut n�r k�rningen �r f�rdig.
 * 
 * Resultat utav testerna:
 * Konkatinering med korta str�ngar:
 * Average = 33021 iterations.
 * String length = 33021
 * 
 * Stringbuilder med korta str�ngar:
 * averaged out to 19724280 iterations
 * String Length = 19724280 
 * 
 * 
 * 
 * Konkatinering av l�nga str�ngar:
 * 
 * Averaged 2570
 * 2570 * 80 = 205600 characters
 * 
 * Stringbuilder l�nga str�ngar:
 * averaged 2149582
 *	4880 * 80 = 390400 characters.
 *
 *
 *Task 3!
 *Sorteringen av arrayer.
 *Den f�rsta algorithmen:
 *Averages to 4105 times sorted
 *410500 integers sorted.
 *
 *
 *Sorteringen av Slumpade textstr�ngar i en array med 100 str�ngar:
 *
 *Average 785 sortings
 *Sorts about 785000 strings.
 * 
 * 
 * 
 * Resultatet visar att StringBuilder �r uppenbart mycket snabbare �n att konkatinera str�ngar med + operatorn.
 * 
 * StringBuilder �r snabbare eftersom att den fungerar lite som ArrayList i och med att den b�rjar p� ett 
 * ursprungligt v�rde som l�ngd. Det inneb�r att man kan l�gga till lite utan att den ska resiza, vilket
 * spar en massa tid. En vanlig textstr�ng har sin fasta l�ngd, och varje g�ng den l�gger till n�got, s� m�ste
 * den resiza, vilket tar en massa on�dig tid. Om man inte jobbar med s� stora projekt s� g�r det s� fort s� 
 * att man inte m�rker av det, men i stora projekt och med stora str�ngar m�rker man stora skillnader.
 * 
 * Eftersom att StringBuilder har "tomma platser" beh�ver den inte �terskapa String-objektet varje g�ng.
 * 
 * F�rdelen �r att StringBuilder dubblar sig sj�lv i storleken, och beh�ver d�rf�r inte kopiera sitt inneh�ll
 * hela tiden om man ska l�gga till flera bokst�ver, vilket en vanlig str�ng g�r. Detta �r ett smidigt s�tt
 * att spara prestanda.
 * 
 */ 
