| Aufgabe | Nur ein Rückgabewert | Resultat nur abhängig von Parametern | Verändert keine existierenden Werte | pure oder impure |
| ------- | -------------------- | ------------------------------------ | ----------------------------------- | ---------------- |
| 1.1     | Ja                   | Nein                                 | Nein                                | **impure**       |
| 1.2     | Ja                   | Ja                                   | Ja                                  | **pure**         |
| 1.3     | Ja                   | Ja                                   | Ja                                  | **pure**         |
| 1.4     | Ja                   | **Nein** (wegen `Math.random`)       | Ja                                  | **impure**       |
| 1.5     | Ja                   | Ja                                   | Ja                                  | **pure**         |
| 1.6     | Ja                   | Ja                                   | **Nein** (`console.log`)            | **impure**       |