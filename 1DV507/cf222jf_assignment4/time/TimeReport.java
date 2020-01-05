package cf222jf_assignment4.time;

public class TimeReport {

}

/* Samtliga tester mäts i Milisekunder via en while-loop och en iterationmätare.
 * Alla dessa körs 10 gånger, och sedan beräknas ett medeltal. Iterationerna räknas i en sekund och sparas i
 * en variabel som sedan skrivs ut när körningen är färdig.
 * 
 * Resultat utav testerna:
 * Konkatinering med korta strängar:
 * Average = 33021 iterations.
 * String length = 33021
 * 
 * Stringbuilder med korta strängar:
 * averaged out to 19724280 iterations
 * String Length = 19724280 
 * 
 * 
 * 
 * Konkatinering av långa strängar:
 * 
 * Averaged 2570
 * 2570 * 80 = 205600 characters
 * 
 * Stringbuilder långa strängar:
 * averaged 2149582
 *	4880 * 80 = 390400 characters.
 *
 *
 *Task 3!
 *Sorteringen av arrayer.
 *Den första algorithmen:
 *Averages to 4105 times sorted
 *410500 integers sorted.
 *
 *
 *Sorteringen av Slumpade textsträngar i en array med 100 strängar:
 *
 *Average 785 sortings
 *Sorts about 785000 strings.
 * 
 * 
 * 
 * Resultatet visar att StringBuilder är uppenbart mycket snabbare än att konkatinera strängar med + operatorn.
 * 
 * StringBuilder är snabbare eftersom att den fungerar lite som ArrayList i och med att den börjar på ett 
 * ursprungligt värde som längd. Det innebär att man kan lägga till lite utan att den ska resiza, vilket
 * spar en massa tid. En vanlig textsträng har sin fasta längd, och varje gång den lägger till något, så måste
 * den resiza, vilket tar en massa onödig tid. Om man inte jobbar med så stora projekt så går det så fort så 
 * att man inte märker av det, men i stora projekt och med stora strängar märker man stora skillnader.
 * 
 * Eftersom att StringBuilder har "tomma platser" behöver den inte återskapa String-objektet varje gång.
 * 
 * Fördelen är att StringBuilder dubblar sig själv i storleken, och behöver därför inte kopiera sitt innehåll
 * hela tiden om man ska lägga till flera bokstäver, vilket en vanlig sträng gör. Detta är ett smidigt sätt
 * att spara prestanda.
 * 
 */ 
