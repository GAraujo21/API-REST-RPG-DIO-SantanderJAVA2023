# API-REST-RPG-DIO-SantanderJAVA2023

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
        tipo: String
    }

    Personagem <|-- Guerreiro
    Personagem <|-- Mago
    Personagem <|-- Bardo

    Usuario *-- Personagem
    Personagem --> Movimento : movimento
    Personagem --> Item : item
