# FPA Spring-Boot Demo

Beispiel Projekt für Spring Boot, mit dem die Funktionsweise von Spring MVC anhand von zwei Controllern und einem Service veranschaulicht werden soll.

## Programmstart

Zum Starten des Programms sind folgende Schritte auszuführen:

1. Im Verzeichnis, in dem sich die pom.xml befinden den Befehl *mvn clean package* ausführen (Maven muss installiert sein)
2. Im Verzeichnis */target* befindet sich die Datei *spring-boot-demo-<VERSION>.war*.
Ausführen mit *java -jar spring-boot-demo-<VERION>.war*

**Den Platzhalter <VERSION> mit der entsprechenden Versionsnnummer ersetzen, bpsw. spring-boot-demo-1.0-SNAPSHOT.**

## Adressen

Die Anwendung ist unter den folgenden URLs erreichbar:

* http://localhost:8080/fpa/fachbereich/3/modulnummer/B18
* http://localhost:8080/fpa/

Alle anderen Adressen liefern entweder kein Ergebnis oder einen Fehler.