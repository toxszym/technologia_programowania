# Lista 1 – zespół muzyczny

Aplikacja konsolowa w Javie 17 do zadania 7 z listy 1 (Technologie programowania 2026).
Zespół (`Band`) składa się z muzyków (`Musician`), a każdy muzyk gra na instrumencie
(`Instrument`). Na próbie muzyk stroi swój instrument i na nim gra.

## Uruchamianie

```
mvn clean verify                       # kompilacja, testy, PMD, Checkstyle, jar
java -jar target/band-1.0-SNAPSHOT.jar
```

## Technologie z listy

| Technologia | Gdzie | Polecenie |
|---|---|---|
| Maven | `pom.xml` | `mvn clean verify` |
| PMD | `config/pmd-ruleset.xml` | `mvn pmd:check` |
| Checkstyle | `config/checkstyle.xml` | `mvn checkstyle:check` |
| UML | `docs/class-diagram.md` (Mermaid) | podgląd Markdown w VS Code |
| git | to repozytorium | `git log` |

PMD i Checkstyle są podpięte pod fazę `verify`, więc naruszenie reguł przerywa budowanie.
