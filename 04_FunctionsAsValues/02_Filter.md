# 1

## Aufgabe

Gegeben ist eine Liste von Zahlen: `List(1, 2, 3, 4, 5)`. Wenden Sie die filter-Funktion an, um nur die geraden Zahlen zu behalten.

## Erwartete Ausgabe

`List(2, 4)`

## Lösung

```scala
val zahlen = List(1, 2, 3, 4, 5)
val geradeZahlen = zahlen.filter(zahl => zahl % 2 == 0)

println(geradeZahlen)
```

---

# 2

## Aufgabe

Gegeben ist eine Liste von Namen: `List("Alice", "Bob", "Charlie", "Diana")`. Verwenden Sie `filter`, um Namen auszuwählen, die mehr als vier Buchstaben haben.

## Erwartete Ausgabe

`List("Alice", "Charlie", "Diana")`

## Lösung

```scala
val namen = List("Alice", "Bob", "Charlie", "Diana")
val langeNamen = namen.filter(name => name.length > 4)

println(langeNamen)
```

---

# 3

## Aufgabe

Gegeben ist eine Liste von Zahlen: `List(12, 45, 68, 100)`. Benutzen Sie `filter`, um alle Zahlen zu behalten, die grösser als 50 sind.

## Erwartete Ausgabe

`List(68, 100)`

## Lösung

```scala
val zahlen = List(12, 45, 68, 100)
val groesserAls50 = zahlen.filter(zahl => zahl > 50)

println(groesserAls50)
```

---

# 4

## Aufgabe

Gegeben ist eine Liste von Wörtern: `List("Scala", "ist", "fantastisch")`. Verwenden Sie `filter`, um alle Wörter zu behalten, die mit "S" beginnen.

## Erwartete Ausgabe

`List("Scala")`

## Lösung

```scala
val woerter = List("Scala", "ist", "fantastisch")
val beginnendMitS = woerter.filter(wort => wort.startsWith("S"))

println(beginnendMitS)
```

---

# 5

## Aufgabe

Gegeben: 

```scala
case class Buch(titel: String, autor: String, jahr: Int)

val buecher = List(
  Buch("1984", "George Orwell", 1949),
  Buch("Brave New World", "Aldous Huxley", 1932),
  Buch("Fahrenheit 451", "Ray Bradbury", 1953)
)
```

Verwenden Sie `filter` und `map`, um eine Liste der Titel aller Bücher zu erstellen, die vor 1950 veröffentlicht wurden.

## Erwartete Ausgabe

`List("1984", "Brave New World")`

## Lösung

```scala
case class Buch(titel: String, autor: String, jahr: Int)

val buecher = List(
  Buch("1984", "George Orwell", 1949),
  Buch("Brave New World", "Aldous Huxley", 1932),
  Buch("Fahrenheit 451", "Ray Bradbury", 1953)
)

val titelVor1950 = buecher.filter(buch => buch.jahr < 1950).map(buch => buch.titel)

println(titelVor1950)
```