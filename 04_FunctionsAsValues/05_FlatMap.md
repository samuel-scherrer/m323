# 1

## Aufgabe

Gegeben ist eine Liste von Listen, die Zahlen enthält: `List(List(1, 2), List(3, 4), List(5, 6))`. Ihre Aufgabe ist es, eine neue Liste zu erstellen, die alle Elemente der Unterlisten enthält, wobei jede Zahl verdoppelt wird. Verwenden Sie dazu die `flatMap`-Funktion in Kombination mit `map`.

## Lösung

```scala
val listOfLists = List(List(1, 2), List(3, 4), List(5, 6))

val verdoppelteUndVereinigteListe = listOfLists.flatMap(sublist => sublist.map(zahl => zahl * 2))

println(verdoppelteUndVereinigteListe)
```

---

# 2

## Aufgabe

Gegeben ist eine Liste von Personen, wobei jede Person durch ein Tupel aus Name und einer Liste ihrer Lieblingsfarben dargestellt wird: `List(("Max", List("Blau", "Grün")), ("Anna", List("Rot")), ("Julia", List("Gelb", "Blau", "Grün")))`. Ihre Aufgabe ist es, eine Liste aller einzigartigen Farben zu erstellen, die als Lieblingsfarben angegeben wurden. Verwenden Sie dafür die `flatMap`-Funktion, gefolgt von `distinct`.

## Lösung

```scala
val personenFarben = List(
  ("Max", List("Blau", "Grün")),
  ("Anna", List("Rot")),
  ("Julia", List("Gelb", "Blau", "Grün"))
)

val alleFarben = personenFarben.flatMap(person => person._2)

val einzigartigeFarben = alleFarben.distinct

println(einzigartigeFarben)
```