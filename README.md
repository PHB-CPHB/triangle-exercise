# Triangle Exercise

School assignment for testing kinds of triangles

## Prerequisites

You need to have Java 1.8 installed
You need to have Maven installed
## How to use

### As a commandline tool

1. Clone the project
2. Go to the folder
3. Run `javac folder/*.java` - Example `javac trianglesexercise/*.java`
4. run `java folder/main args[0] args[1] args[2]` - Example `java trianglesexercise/main 1 2 3` - Return

### Usage in IDE
I have used Netbeans
1. Clone the project
2. Open IDE
3. Import project in IDE
4. Go to TrianglesExercise.java
5. Outcomment Commandline Usage and incommet Netbeans Usage

### Test cases

| Input      | Expected output      | actual output        |
|------------|----------------------|----------------------|
| (2,2,2)    | Equilateral Triangle | Equilateral Triangle |
| (2,2,3)    | Isosceles Triangle   | Isosceles Triangle   |
| (2,3,4)    | Scalene Triangle     | Scalene Triangle     |
| (0,2,3)    | Not a triangle       | Not a triangle       |
| (2,-1,4)   | Not a triangle       | Not a triangle       |
| (50,50,50) | Equilateral Triangle | Equilateral Triangle |