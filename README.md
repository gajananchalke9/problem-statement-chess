# Chess Piece Movement Simulator

This is a Spring Boot application that simulates the movement of chess pieces—Pawn, King, Queen, and Knight on an empty chessboard.
The application provides both a RESTful web interface and an interactive terminal mode.

---

## Features

* Simulates movements for:

  * **Pawn**: Moves one step forward.
  * **King**: Moves one step in any direction.
  * **Queen**: Moves any number of steps in any direction.
  * **Knight**: Moves in an L-shape (two steps in one direction and then one step perpendicular).
* Supports both **White** and **Black** pieces.
* Provides:

  * **RESTful API** for web interactions.
  * **Interactive terminal mode** for command-line usage.

---

## Prerequisites

Following things need to be installed on your system:

* **Java Development Kit (JDK) 17 or later**: Verify with `java -version`.
* **Apache Maven 3.5 or later**: Verify with `mvn -version`.

---

## Building the Application

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/yourusername/chess-piece-movement.git
   cd chess-piece-movement
   ```

2. **Build with Maven**:

   ```bash
   mvn clean package
   ```

   This will generate an executable JAR file in the `target/` directory.

---

## Running the Application

### Web Interface

Start the application:

```bash
java -jar target/chess-piece-movement-0.0.1-SNAPSHOT.jar
```

Access the REST API at:

```
http://localhost:8080/chess/moves?piece=KING&position=D5&color=WHITE
```

### Interactive Terminal Mode

Run the application in interactive mode:

```bash
java -jar target/chess-piece-movement-0.0.1-SNAPSHOT.jar interactive
```

Follow the on-screen prompts to input piece type, position, and color.

---