
# 💻 Java Development Concepts Repository

Welcome to the `java_dev` repository! This collection is a comprehensive showcase of fundamental and advanced Java programming concepts, designed to aid learners and enthusiasts in understanding the intricacies of Java development.

---

## 📂 Repository Overview

Explore a wide variety of Java concepts, each demonstrated through practical examples.

| 🧾 File Name              | 🔍 Description |
|--------------------------|----------------|
| [`Arrays.java`](#arraysjava) | Array usage and manipulation |
| [`Class.java`](#classjava) | Object instantiation and class structure |
| [`Compute.java`](#computejava) | Basic computations and logic |
| [`Demo.java`](#demojava) | A simple Java program demo |
| [`Encapsulation.java`](#encapsulationjava) | OOP encapsulation principle |
| [`Geeks.java`](#geeksjava) | Sample problem-based structure |
| [`JaggedArr.java`](#jaggedarrjava) | Working with jagged arrays |
| [`MethodOverloading.java`](#methodoverloadingjava) | Demonstrates method overloading |
| [`Multidimentions.java`](#multidimentionsjava) | Multidimensional arrays usage |
| [`MultipleObj.java`](#multipleobjjava) | Handling multiple objects |
| [`Random2d.java`](#random2djava) | Randomized 2D arrays |
| [`Static.java`](#staticjava) | Static keyword usage |
| [`Stringbuffer.java`](#stringbufferjava) | StringBuffer class demonstration |
| [`Strings.java`](#stringsjava) | String operations in Java |
| [`ThisSuper.java`](#thissuperjava) | Use of `this` and `super` keywords |
| [`t.java`](#tjava) | Extra practice file |
| [`te.java`](#tejava) | Extra practice file |
---

## 🚀 Getting Started

```bash
# Clone the repository
git clone https://github.com/gitx64/java_dev.git

# Navigate into the project directory
cd java_dev

# Compile any Java file
javac FileName.java

# Run the compiled class
java FileName
```

Replace `FileName` with the actual Java file name (without `.java` extension).

---

## 📌 Code Samples

Below are snippets from each Java file included in this repository:

<a name="arraysjava"></a>
### 🧾 Arrays.java
```java
public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for(int number : numbers) {
            System.out.println(number);
        }
    }
}
```

<a name="classjava"></a>
### 🧾 Class.java
```java
public class MyClass {
    int x = 5;

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        System.out.println(myObj.x);
    }
}
```

<a name="computejava"></a>
### 🧾 Compute.java
```java
public class Compute {
    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        System.out.println("Square of 4 is: " + square(4));
    }
}
```

<a name="demojava"></a>
### 🧾 Demo.java
```java
public class Demo {
    public static void main(String[] args) {
        System.out.println("This is a demo program.");
    }
}
```

<a name="encapsulationjava"></a>
### 🧾 Encapsulation.java
```java
public class Encapsulation {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setName("John");
        System.out.println(obj.getName());
    }
}
```

<a name="geeksjava"></a>
### 🧾 Geeks.java
```java
public class Geeks {
    public static void main(String[] args) {
        System.out.println("Welcome to GeeksforGeeks!");
    }
}
```

<a name="jaggedarrjava"></a>
### 🧾 JaggedArr.java
```java
public class JaggedArr {
    public static void main(String[] args) {
        int[][] jagged = new int[3][];
        jagged[0] = new int[2];
        jagged[1] = new int[3];
        jagged[2] = new int[1];

        for(int i = 0; i < jagged.length; i++) {
            for(int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = i + j;
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

<a name="methodoverloadingjava"></a>
### 🧾 MethodOverloading.java
```java
public class MethodOverloading {
    public void display(int a) {
        System.out.println("Argument: " + a);
    }

    public void display(String a) {
        System.out.println("Argument: " + a);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.display(5);
        obj.display("Hello");
    }
}
```

<a name="multidimentionsjava"></a>
### 🧾 Multidimentions.java
```java
public class Multidimentions {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

<a name="multipleobjjava"></a>
### 🧾 MultipleObj.java
```java
public class MultipleObj {
    int x = 10;

    public static void main(String[] args) {
        MultipleObj obj1 = new MultipleObj();
        MultipleObj obj2 = new MultipleObj();
        obj2.x = 20;
        System.out.println("obj1 x: " + obj1.x);
        System.out.println("obj2 x: " + obj2.x);
    }
}
```

<a name="random2djava"></a>
### 🧾 Random2d.java
```java
import java.util.Random;

public class Random2d {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Random rand = new Random();

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

<a name="staticjava"></a>
### 🧾 Static.java
```java
public class Static {
    static int count = 0;

    public Static() {
        count++;
    }

    public static void main(String[] args) {
        new Static();
        new Static();
        System.out.println("Number of instances: " + count);
    }
}
```

<a name="stringbufferjava"></a>
### 🧾 Stringbuffer.java
```java
public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);
    }
}
```

<a name="stringsjava"></a>
### 🧾 Strings.java
```java
public class Strings {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
    }
}
```

<a name="thissuperjava"></a>
### 🧾 ThisSuper.java
```java
class Parent {
    int num = 100;
}

public class ThisSuper extends Parent {
    int num = 200;

    public void display() {
        System.out.println("num: " + num);
        System.out.println("super.num: " + super.num);
    }

    public static void main(String[] args) {
        ThisSuper obj = new ThisSuper();
        obj.display();
    }
}
```

<a name="tjava"></a>
### 🧾 t.java
```java
public class t {
    public static void main(String[] args) {
        System.out.println("Test file t.java");
    }
}
```

<a name="tejava"></a>
### 🧾 te.java
```java
public class te {
    public static void main(String[] args) {
        System.out.println("Test file te.java");
    }
}
```

---

## 🤝 Contributing

Contributions are welcome! If you have suggestions or improvements:

```bash
# Fork the repo, create a new branch and make changes
git checkout -b feature-name
git commit -m "Add feature"
git push origin feature-name
```

Then open a **Pull Request** 🚀

---

## 📬 Feedback

Open an issue [here](https://github.com/gitx64/java_dev/issues) for bugs, improvements, or suggestions.

---

> Made with ❤️ by [gitx64](https://github.com/gitx64)
