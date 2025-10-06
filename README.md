# 🧱 Stack - 2 - JavaFX
### 🧩 Verificador de código balanceado con paréntesis, llaves y corchetes

</div>

Este proyecto implementa una aplicación en **JavaFX** que permite **comprobar si un código está correctamente balanceado** en el uso de:

- Paréntesis `()`
- Llaves `{ }`
- Corchetes `[ ]`

La interfaz está desarrollada con **FXML**, mientras que la lógica de validación se implementa mediante una clase personalizada `Pila`, basada en el TAD **Stack (LIFO)**.

---

## 🚀 Tecnologías utilizadas

- ☕ **Java 25**
- 🎨 **JavaFX**
- 🧾 **FXML**
- 🧠 **Programación orientada a objetos**

---

## 🧩 Descripción general

La aplicación permite al usuario pegar o escribir un fragmento de código y:

1. **Contabilizar** cuántos elementos de apertura (`(`, `{`, `[`) contiene.
2. **Verificar** si los símbolos de apertura y cierre están **correctamente emparejados y balanceados**.
3. **Mostrar alertas** si el código está vacío o presenta errores.

Esto resulta útil para analizar código fuente y comprender cómo funciona internamente una **pila de control de símbolos** — uno de los fundamentos de los compiladores y analizadores sintácticos.

---

## ⚙️ Clases principales

### 🧠 `Clases.Pila`

Implementa una estructura de **pila genérica de caracteres** que gestiona la apertura y cierre de los símbolos.

#### 🔧 Métodos principales:

| Método | Descripción |
|--------|--------------|
| `push(Character c)` | Inserta un carácter en la pila. |
| `pop()` | Extrae el último carácter insertado (lanza excepción si la pila está vacía). |
| `esVacia()` | Indica si la pila está vacía. |
| `balanceado(String codigo)` | Verifica si los símbolos están correctamente balanceados (`()`, `{}`, `[]`). |
| `contarAperturas(String codigo)` | Devuelve el número de cada símbolo de apertura encontrado. |

#### 🧠 Ventajas:
- Simula el funcionamiento real del **TAD Stack (Last In, First Out)**.
- Aísla la lógica de validación del entorno gráfico.
- Facilita la **extensión del programa** a otros símbolos o reglas de validación.

---

### 🖥️ `VentanaController`

Controlador JavaFX encargado de conectar la interfaz con la lógica de negocio.

**Responsabilidades:**
- Capturar el texto ingresado por el usuario.
- Contabilizar símbolos de apertura mediante `contarAperturas()`.
- Verificar balanceo con `balanceado()`.
- Mostrar resultados o alertas según corresponda.

---

### 🎨 `Ventana.fxml`

Define la interfaz gráfica de la aplicación:

- 🧾 **TextArea** para ingresar el código.
- 🧮 **Label/Area de resultados** con el conteo de símbolos y estado del balanceo.
- 🖱️ **Button** para ejecutar la comprobación.
- 🎨 Estilo visual minimalista con tipografía clara y colores de contraste.

---