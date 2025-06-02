# 1

## Aufgabe

Gegeben:

```scala
case class Mitarbeiter(name: String, abteilung: String, gehalt: Int)

val mitarbeiter = List(
  Mitarbeiter("Max Mustermann", "IT", 50000),
  Mitarbeiter("Erika Musterfrau", "Marketing", 45000),
  Mitarbeiter("Klaus Klein", "IT", 55000),
  Mitarbeiter("Julia Gross", "HR", 40000)
)
```

Erstellen Sie eine Liste aller Mitarbeiter in der "IT"-Abteilung, deren Gehalt bei 50000 oder darüber liegt. Zusätzlich sollen alle Vornamen in Grossbuchstaben umgewandelt und der Nachname entfernt werden (z.B. "MAX").

## Erwartete Ausgabe

`List("MAX", "KLAUS")`

## Lösung

```scala
case class Mitarbeiter(name: String, abteilung: String, gehalt: Int)

val mitarbeiter = List(
  Mitarbeiter("Max Mustermann", "IT", 50000),
  Mitarbeiter("Erika Musterfrau", "Marketing", 45000),
  Mitarbeiter("Klaus Klein", "IT", 55000),
  Mitarbeiter("Julia Gross", "HR", 40000)
)

val ergebnis = mitarbeiter
  .filter(m => m.abteilung == "IT" && m.gehalt >= 50000)
  .map(m => m.name.split(" ")(0).toUpperCase)

println(ergebnis)
```

---

# 2

In dieser Übung werden wir eine Liste von Kursnamen bearbeiten und sortieren.

Gegeben ist eine Liste von Kursnamen:

```scala
val kurse = List(
  "Programmierung in Scala",
  "Datenbanken",
  "Webentwicklung mit JavaScript",
  "Algorithmen und Datenstrukturen"
)
```

## 1. Filtern Sie die Kursnamen, um nur diejenigen zu behalten, die das Wort "Daten" enthalten.

### Lösung

```scala
val kurse = List(
  "Programmierung in Scala",
  "Datenbanken",
  "Webentwicklung mit JavaScript",
  "Algorithmen und Datenstrukturen"
)

val kurseMitDaten = kurse.filter(kurs => kurs.contains("Daten"))

println(kurseMitDaten)
```

## 2. Entfernen Sie aus jedem Kursnamen alle Leerzeichen.

### Lösung

```scala
val kurse = List(
  "Programmierung in Scala",
  "Datenbanken",
  "Webentwicklung mit JavaScript",
  "Algorithmen und Datenstrukturen"
)

val kurseOhneLeerzeichen = kurse.map(kurs => kurs.replace(" ", ""))

println(kurseOhneLeerzeichen)
```

## 3. Sortieren Sie die Kursnamen alphabetisch.

### Lösung

```scala
val kurse = List(
  "Programmierung in Scala",
  "Datenbanken",
  "Webentwicklung mit JavaScript",
  "Algorithmen und Datenstrukturen"
)

val kurseAlphabetisch = kurse.sorted

println(kurseAlphabetisch)
```

## 4. Sortieren Sie umgekehrt alphabetisch.

### Lösung

```scala
val kurse = List(
  "Programmierung in Scala",
  "Datenbanken",
  "Webentwicklung mit JavaScript",
  "Algorithmen und Datenstrukturen"
)

val kurseUmgekehrtAlphabetisch = kurse.sorted.reverse

println(kurseUmgekehrtAlphabetisch)
```