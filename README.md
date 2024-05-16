# API-REST-RPG-DIO-SantanderJAVA2023

## Diagrama de Classes

```mermaid
classDiagram
    class Usuario {
        ID: String
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
        type: Type
    }

    class Type {
        type: String
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
        Descricao: String
    }

    class Movimento {
        tipo: String
    }

    Usuario *-- Personagem
    Personagem --> Type
    Personagem --> Movimento : movimento
    Personagem --> Item : item
    Type --> Item : item
