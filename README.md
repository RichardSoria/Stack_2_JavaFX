# 🧱 Stack - 2 - JavaFX

Este proyecto implementa una pequeña aplicación en **JavaFX** que permite **comprobar si un código está balanceado** en cuanto al uso de paréntesis `(` y `)`.

La interfaz gráfica está desarrollada con **FXML**, mientras que la lógica de validación se realiza mediante una clase personalizada llamada `Pila`, basada en el uso del tipo de datos abstracto **Stack (Pila LIFO)**.

---

## 🚀 Tecnologías utilizadas
- **Java 25**
- **JavaFX**
- **FXML**
- **Paradigma orientado a objetos**

---

## 🧩 Descripción general

La aplicación permite al usuario ingresar un bloque de texto (por ejemplo, un fragmento de código) y verificar si los **paréntesis están correctamente balanceados**.  
Si el código está incompleto o vacío, se muestran alertas informativas para guiar al usuario.

---

## ⚙️ Clases principales

### 🧠 `Clases.Pila`
Implementa una estructura de **pila genérica de caracteres** para comprobar la correcta apertura y cierre de paréntesis.

**Funciones clave:**
- `push(Character c)`: Inserta un carácter en la pila.
- `pop()`: Extrae el último carácter insertado (lanza excepción si la pila está vacía).
- `balanceado(String codigo)`: Recorre el código y verifica si los paréntesis están correctamente emparejados.

**Ventajas:**
- Permite aislar la lógica del análisis del código.
- Representa de forma práctica el funcionamiento del TAD *Stack* (último en entrar, primero en salir).
- Puede ser extendida fácilmente para manejar otros símbolos (`{}`, `[]`, `<>`).

---

### 🖥️ `VentanaController`
Controlador JavaFX que enlaza los elementos del FXML con la lógica de la aplicación.

**Responsabilidades:**
- Capturar el texto ingresado por el usuario.
- Llamar al método `balanceado()` de la clase `Pila`.
- Mostrar el resultado en pantalla.
- Desplegar alertas si el campo está vacío o si el código presenta errores.

---

### 🎨 `Ventana.fxml`
Archivo FXML que define la interfaz de usuario:
- Un **TextArea** para ingresar el código.
- Un **Button** para comprobar el estado del código.
- Un **Label** que muestra el resultado.
- Colores y tipografía aplicados para resaltar la estructura visual.

---
