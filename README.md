# Programming –opdracht Math enmethodes 3 - Methoden

## Beschrijving
In deze serie opdrachten ga je verschillende methodes schrijven. Elke methode kun je testen door in de main() methode de methode aan te roepen. Dit kan soms rechtstreeks, als de methode zelf iets print. Dit kan binnen een println() methode om het resultaat te tonen. Het kan ook door de returnwaarde van de methode eerst op te slaan in een variabele en dan die variabele in een println() methode te gebruiken.

Elke opdracht beschrijft wat je moet doen. Je ziet ook een voorbeeld van input en output. Input die de gebruiker invoert is schuin en onderstreept.

## Sterrenvierkant (basis)
Schrijf een methode die een vierkant van vier bij vier asterisken print. De methode heeft als signature public static void toonSterrenVierkant(). Roep de methode aan in je main methode en run je project.

```
* * * *
* * * *
* * * *
* * * *
```

## Woord rij van vijf (basis)
Schrijf een methode die een rij van vijf woorden print. Je moet aan de methode het woord meegeven. De signature van de methode is public static void toonWoordVijfKeer(String mpWoord). Vraag in de main methode de gebruiker om een woord en toon dit vijf keer achter elkaar.

```
Welke woord wil je vijf keer zien? hup
huphuphuphuphup
```

## Eerlijk delen (gevorderd)
Schrijf een methode die een geheel aantal euromunten eerlijk verdeelt over een aantal personen. Er is geen wisselgeld, dus er kan een rest over blijven. Als je 35 euromunten verdeelt over 8 personen, dan krijgt ieder er 4 (en er blijft 3 in de pot). Vraag de gebruiker in de main methode om het aantal euro's en het aantal personen en druk onderstaand resultaat af.

```
Hoeveel euromunten wil je verdelen? 35
Met hoeveel personen? 8
Als je 35 euromunten verdeeld over 8 mensen dan krijgt ieder 4 munten en blijven er 3 over.
```

## Wisselgeld (basis)
Schrijf een methode die wisselgeld berekent op basis van het te betalen bedrag en het bedrag dat gegeven wordt. De methode heeft signatuur public static double berekenWisselgeld(double mpTeBetalen, double mpBetaald). Bedenk zelf hoe je de methode wilt testen.

## Wisselgeld (gevorderd)
Schrijf nog een methode die wisselgeld berekent, maar rekening houdt met het feit dat je altijd afrondt naar een veelvoud van 5 eurocent, omdat 1 en 2 cents munten niet meer in omloop zijn.

```
Hoeveel moet je betalen? 36,87
Hoeveel heb je gegeven? 40
Je krijgt 3.15 terug
```

## Richtlijnen bij coderen (zie ook MIW code conventions)
- Zorg dat je naam en het doel van het programma bovenin staan (ICC #1).
- Gebruik de juiste inspringing (indentation) bij de lay-out (ICC #2).
- Let op juist gebruik hoofdletters en kleine letters (ICC #3).
- Gebruik goede namen (ICC #4).
- Voeg waar nodig commentaar toe dat inzicht geeft in je code (ICC#7)