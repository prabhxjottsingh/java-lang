# Understanding JDK, JRE, and JVM

This document explains the key components of the Java platform (JDK, JRE, JVM) and provides an overview of how Java code is compiled into bytecode and executed.

---

## **1. Java Development Kit (JDK)**

### What is JDK?

The **Java Development Kit (JDK)** is a software development environment used to develop Java applications. It includes tools for:

- Compiling Java code
- Debugging
- Packaging

### Key Components:

- **javac**: The Java compiler that converts `.java` files into `.class` files (bytecode).
- **java**: The Java application launcher to execute compiled bytecode.
- Development tools like `javadoc`, `jar`, and debuggers.
- The JRE (explained below).

### Use Case:

For developers writing and compiling Java programs.

---

## **2. Java Runtime Environment (JRE)**

### What is JRE?

The **Java Runtime Environment (JRE)** provides the libraries, Java Virtual Machine (JVM), and other components required to run Java applications. It does not include development tools like `javac`.

### Key Components:

- **JVM**: Executes the bytecode.
- Core libraries required to run Java applications.

### Use Case:

For users who just need to run Java applications without developing them.

---

## **3. Java Virtual Machine (JVM)**

### What is JVM?

The **Java Virtual Machine (JVM)** is the engine that runs Java bytecode. It acts as a translator between the compiled bytecode and the underlying operating system.

### Key Features:

- Platform independence: Write once, run anywhere (WORA).
- Automatic memory management (Garbage Collection).
- Runtime optimizations via Just-In-Time (JIT) compiler.

### JVM Process:

1. Loads bytecode (`.class` files) using the **Class Loader**.
2. Verifies bytecode for security and correctness.
3. Executes the bytecode via the **Interpreter** or JIT compiler.

---

## **4. How Java Code Compiles to Bytecode**

The process of compiling and running a Java program involves several steps:

### Step 1: Write Java Code

Write your code in a `.java` file. For example:

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Step 2: Compilation

Run the Java compiler (`javac`) to convert the source code into bytecode. Bytecode is stored in a `.class` file.

```bash
javac Hello.java
```

- Output: `Hello.class` (platform-independent bytecode).

### Step 3: Class Loading

When you run the program, the JVM's Class Loader loads the `.class` file into memory.

### Step 4: Bytecode Verification

The bytecode verifier checks the bytecode for security violations or invalid instructions.

### Step 5: Execution

The JVM executes the bytecode in two ways:

1. **Interpreter**: Interprets bytecode line-by-line.
2. **JIT Compiler**: Converts frequently used bytecode into native machine code for faster execution.

### Command to Run the Program:

```bash
java Hello
```

Output:

```
Hello, World!
```

---

## **5. Summary of Differences**

| Component | Purpose                       | Key Tools/Features                           |
| --------- | ----------------------------- | -------------------------------------------- |
| JDK       | Develop and compile Java code | Includes `javac`, `java`, libraries, and JRE |
| JRE       | Run Java applications         | Includes JVM and runtime libraries           |
| JVM       | Execute Java bytecode         | Platform-independent runtime engine          |

---

## **Additional Notes**

- **Platform Independence**: Java programs are platform-independent because the bytecode can run on any JVM implementation, regardless of the underlying operating system.
- **Garbage Collection**: JVM automatically handles memory management, freeing up unused objects to improve performance.

---

# Java Data Types and Memory Usage

This document provides an overview of the different data types in Java and the memory they occupy in memory.

## 1. **Primitive Data Types**

| Data Type | Size    | Description                                                    |
| --------- | ------- | -------------------------------------------------------------- |
| `byte`    | 1 byte  | Stores whole numbers from -128 to 127.                         |
| `short`   | 2 bytes | Stores whole numbers from -32,768 to 32,767.                   |
| `int`     | 4 bytes | Stores whole numbers from -2³¹ to 2³¹-1.                       |
| `long`    | 8 bytes | Stores whole numbers from -2⁶³ to 2⁶³-1.                       |
| `float`   | 4 bytes | Stores fractional numbers, precision: 6-7 decimal digits.      |
| `double`  | 8 bytes | Stores fractional numbers, precision: 15-16 decimal digits.    |
| `char`    | 2 bytes | Stores a single character or Unicode values.                   |
| `boolean` | 1 bit   | Stores `true` or `false` (size depends on JVM implementation). |

---

## 2. **Non-Primitive (Reference) Data Types**

Non-primitive types include classes, arrays, and interfaces. The size of these types depends on the following factors:

- The object header (typically **12 bytes** for 32-bit JVM or **16 bytes** for 64-bit JVM without compressed references).
- Memory required for instance variables and references.
- Alignment (padded to the nearest multiple of 8 bytes).

### Example: Object Memory Calculation

```java
class Example {
    int id;         // 4 bytes
    String name;    // Reference (4 bytes in 32-bit JVM or 8 bytes in 64-bit JVM)
}

```
