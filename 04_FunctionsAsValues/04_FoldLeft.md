# 1

## Aufgabe

Gegeben ist eine Liste von Zahlen: `List(1, 2, 3, 4, 5)`. Berechnen Sie die Summe aller Zahlen mithilfe von `foldLeft`.

## Erwartete Ausgabe

`15`

## Lösung

```scala
val zahlen = List(1, 2, 3, 4, 5)
val summe = zahlen.foldLeft(0)((akkumulator, zahl) => akkumulator + zahl)

println(summe)
```

---

# 2

## Aufgabe

Gegeben ist eine Liste von Strings: `List("Hallo", " ", "Welt", "!")`. Kombinieren Sie alle Strings zu einem einzigen String mithilfe von `foldLeft`.

## Erwartete Ausgabe

Die erwartete Ausgabe ist ein einziger String, der alle Elemente der Liste kombiniert, also `"Hallo Welt!"`.

## Lösung

```scala
val strings = List("Hallo", " ", "Welt", "!")
val kombinierterString = strings.foldLeft("")((akkumulator, s) => akkumulator + s)

println(kombinierterString)
```

---

# 3

## Aufgabe

Gegeben ist eine Liste von Punkten in einem zweidimensionalen Raum.

`val points = List((1, 3), (2, 5), (4, 8), (6, 2))`

Jeder Punkt wird durch ein Tupel `(x, y)` repräsentiert, wobei `x` und `y` die Koordinaten des Punktes sind. Ihre Aufgabe ist es, den Schwerpunkt (den durchschnittlichen Punkt) aller Punkte in der Liste zu berechnen.

## Erwartete Ausgabe

Die erwartete Ausgabe ist ein Tupel `(x, y)`, das den Schwerpunkt aller Punkte in der Liste repräsentiert.

## Lösung

```scala
val points = List((1, 3), (2, 5), (4, 8), (6, 2))

val (sumX, sumY) = points.foldLeft((0, 0)) { (akkumulator, punkt) =>
  (akkumulator._1 + punkt._1, akkumulator._2 + punkt._2)
}

val anzahlPunkte = points.length
val schwerpunkt = (sumX.toDouble / anzahlPunkte, sumY.toDouble / anzahlPunkte)

println(schwerpunkt)
```