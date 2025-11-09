# 🎮 Juego del Ahorcado

Un juego clásico del ahorcado implementado en Java para la consola. El jugador debe adivinar una palabra secreta letra por letra antes de agotar sus intentos.

## 📋 Descripción

Este es un juego de consola interactivo donde:
- El programa tiene una palabra secreta predefinida
- El jugador debe adivinar la palabra introduciendo letras una por una
- Por cada letra incorrecta, el jugador pierde un intento
- El juego termina cuando el jugador adivina la palabra completa o se queda sin intentos

## 🚀 Cómo Ejecutar

### Requisitos Previos
- Java JDK 8 o superior instalado
- Un terminal o línea de comandos

### Compilar y Ejecutar

1. **Compilar el programa:**
   ```bash
   javac src/Ahorcado.java
   ```

2. **Ejecutar el juego:**
   ```bash
   java -cp src Ahorcado
   ```

## 🎯 Cómo Jugar

1. Al iniciar el juego, verás una serie de guiones bajos (`_`) que representan las letras de la palabra secreta
2. Introduce una letra cuando se te solicite
3. Si la letra está en la palabra, se revelará en su(s) posición(es) correspondiente(s)
4. Si la letra no está en la palabra, perderás un intento
5. Continúa hasta adivinar toda la palabra o agotar los 10 intentos disponibles

### Ejemplo de Juego

```
Hello, World!
Palabra a adivinar: _____
Introduce una letra: 
j
Palabra a adivinar: J____
Introduce una letra: 
a
Palabra a adivinar: JA___
Introduce una letra: 
x
!Letra incorrecta, le quedan: 9 intentos.
Palabra a adivinar: JA___
```

## 🛠️ Estructura del Código

### Variables Principales

- **`palabraSecreta`**: La palabra que el jugador debe adivinar (actualmente: "JAMES")
- **`intentosMaximos`**: Número máximo de intentos permitidos (10)
- **`intentos`**: Contador de intentos fallidos realizados
- **`palabraAdivinada`**: Bandera booleana que indica si la palabra fue completamente adivinada
- **`letrasAdivinadas`**: Array de caracteres que almacena el progreso del jugador

### Lógica del Juego

1. **Inicialización**: Se crea un array de caracteres del mismo tamaño que la palabra secreta, lleno de guiones bajos
2. **Bucle Principal**: El juego continúa mientras:
   - La palabra no haya sido completamente adivinada
   - El jugador tenga intentos restantes
3. **Entrada del Usuario**: Se solicita una letra, que se convierte automáticamente a mayúsculas
4. **Verificación**: Se compara la letra con cada carácter de la palabra secreta
5. **Actualización**: Si la letra es correcta, se revela en el array; si no, se incrementa el contador de intentos
6. **Condición de Victoria**: El juego verifica si todas las letras han sido adivinadas

### Características del Código

- ✅ Conversión automática a mayúsculas para evitar problemas de sensibilidad de mayúsculas/minúsculas
- ✅ Validación de letras repetidas en la palabra
- ✅ Contador de intentos restantes
- ✅ Mensajes informativos para el jugador
- ✅ Cierre apropiado del Scanner para liberar recursos

## 📁 Estructura del Proyecto

```
Ahorcado/
│
├── src/
│   └── Ahorcado.java    # Código principal del juego
│
├── lib/                 # Carpeta para dependencias (vacía)
│
├── bin/                 # Archivos compilados (.class)
│
└── README.md           # Este archivo
```

## 🔧 Posibles Mejoras

Algunas ideas para extender el juego:

- [ ] Agregar una lista de palabras aleatorias
- [ ] Implementar niveles de dificultad
- [ ] Mostrar un dibujo ASCII del ahorcado según los intentos restantes
- [ ] Llevar un registro de puntuaciones
- [ ] Agregar categorías de palabras (animales, países, películas, etc.)
- [ ] Validar que el usuario no repita letras ya introducidas
- [ ] Interfaz gráfica con JavaFX o Swing

## 👨‍💻 Autor

Proyecto educativo para aprender Java

## 📝 Licencia

Este proyecto es de código abierto y está disponible para fines educativos.
