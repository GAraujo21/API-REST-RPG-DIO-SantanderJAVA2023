# API REST Santander Bootcamp Java 2023

API desenvolvida duarante o bootcamp Santander, realizado pela plataforma de estudos DIO. Logo em seguida, demontro o diagrama de classes que utilizei para seguir este projeto. A ideia é uma base para um jogo RPG, havendo alguns tipos de personagens, movimentos e itens. Por enquanto seguirei está ideia, mas com o pensamento de ampliar a complexidade do trabalho.

## Diagrama de Classes

```mermaid
classDiagram
    class Usuario {
        ID: UUID
        name: String
        personagem: Personagem
    }

    class Personagem {
        vida: int
        forca: int
        magia: int
        carisma: int
        level: int
        status: String
        movimento: String
        item: String
        atacar()
        defender()
        mover()
    }

    class Mago {
        vida: int
        forca: int
        magia: int
        carisma: int
        level: int
        status: String
        item: String
    }

    class Guerreiro {
        vida: int
        forca: int
        magia: int
        carisma: int
        level: int
        status: String
        item: String
    }

    class Bardo {
        vida: int
        forca: int
        magia: int
        carisma: int
        level: int
        status: String
        item: String
    }

    class Item {
        name: String
        forca: int
        magia: int
        carisma: int
        Descricao: String
    }

    class Movimento {
        +movimento(): void
    }

    class MovimentoNormal {
        movimento()
    }

    class MovimentoAgressivo {
        movimento()
    }

    class MovimentoDefensivo {
        movimento()
    }

    Personagem <|-- Guerreiro
    Personagem <|-- Mago
    Personagem <|-- Bardo

    Movimento <|-- MovimentoNormal
    Movimento <|-- MovimentoAgressivo
    Movimento <|-- MovimentoDefensivo

    Usuario "0..1" *-- "1" Personagem
    Personagem "1" --> "0..N" Movimento : movimento
    Personagem "0..1" --> "0..N" Item : item
