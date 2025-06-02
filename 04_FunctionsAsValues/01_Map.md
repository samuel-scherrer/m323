# 1

## Aufgabe

Gegeben ist eine Liste von Zahlen: `List(1, 2, 3, 4, 5)`. Wenden Sie die `map`-Funktion an, um jede Zahl zu verdoppeln.

## Erwartete Ausgabe

`List(2, 4, 6, 8, 10)`

## Lösung

```scala
val zahlen = List(1, 2, 3, 4, 5)
val verdoppelt = zahlen.map(zahl => zahl * 2)

println(verdoppelt)
```

---

# 2

## Aufgabe

Gegeben ist eine Liste von Namen: `List("Alice", "Bob", "Charlie")`. Verwenden Sie map, um jeden Namen in Grossbuchstaben umzuwandeln.

## Erwartete Ausgabe

`List("ALICE", "BOB", "CHARLIE")`

## Lösung

```scala
val namen = List("Alice", "Bob", "Charlie")
val grossbuchstaben = namen.map(name => name.toUpperCase)

println(grossbuchstaben)
```

---

# 3

## Aufgabe

Gegeben ist eine Liste von Zahlen: `List(12, 45, 68, 100)`. Benutzen Sie `map`, um die Hälfte jeder Zahl zu berechnen.

## Erwartete Ausgabe

`List(6, 22.5, 34, 50)`

## Lösung

```scala
val zahlen = List(12, 45, 68, 100)
val haelften = zahlen.map(zahl => zahl / 2.0)

println(haelften)
```

---

# 4

## Aufgabe

Gegeben:

```scala
case class Adresse(strasse: String, hausnummer: Int, postleitzahl: String, stadt: String)

val adressen = List(
  Adresse("Hauptstrasse", 10, "12345", "Musterstadt"),
  Adresse("Nebenstrasse", 5, "23456", "Beispielburg")
)
```

Verwenden Sie `map`, um eine Liste von formatierten Adressstrings zu erstellen (z.B. "Hauptstrasse 10, 12345 Musterstadt").

## Erwartete Ausgabe

`List("Hauptstrasse 10, 12345 Musterstadt", "Nebenstrasse 5, 23456 Beispielburg")`

## Lösung

```scala
case class Adresse(strasse: String, hausnummer: Int, postleitzahl: String, stadt: String)

val adressen = List(
  Adresse("Hauptstrasse", 10, "12345", "Musterstadt"),
  Adresse("Nebenstrasse", 5, "23456", "Beispielburg")
)

val formatierteAdressen = adressen.map { adresse =>
  s"${adresse.strasse} ${adresse.hausnummer}, ${adresse.postleitzahl} ${adresse.stadt}"
}

println(formatierteAdressen)
```

---

# 5

## Aufgabe

Gegeben: `val namen = List("Max Mustermann", "Erika Mustermann")`

Verwenden Sie `map`, um eine Liste der Vornamen in Grossbuchstaben zu erstellen.

## Erwartete Ausgabe

`List("MAX", "ERIKA")`

## Lösung

```scala
val namen = List("Max Mustermann", "Erika Mustermann")
val vornamenGross = namen.map { fullName =>
  fullName.split(" ")(0).toUpperCase
}

println(vornamenGross)
```