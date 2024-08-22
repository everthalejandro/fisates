# language: es
@Tocar
Característica: Tocar himno de la alegria
  Yo como usuario deseo interpretar el himno de la alegria

  Antecedentes:
    Dado que se ingresa al piano

  Esquema del escenario: Tocar himno de la alegria
    Cuando se tocan las notas <nota> con <repeticion>
    Ejemplos:
      | nota                                                                                                                                                                                         | repeticion |
      | "si, si, do, re, re, do, si, la, sol, sol, la, si, si, la, la"                                                                                                                                    | "1"        |
      | "si, si, do, re, re, do, si, la, sol, sol, la, si, si, la, la"                                                                                                                                    | "2"        |
      | "si, si, do, re, re, do, si, la, sol, sol, la, si, si, la, sol, la, si, sol, la, si, do, si, sol, la, si, do, si, sol, sol, fa, re, si, si, do, re, re, do, si, la, sol, sol, la, si, si, la, la" | "1"        |