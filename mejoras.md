# Instrucciones de Mejoras al Simulador de Negocio de Comida Rápida

## Objetivo

Ahora que el sistema funciona correctamente, tu reto es identificar y aplicar **10 mejoras** en diferentes áreas del proyecto. Trabaja en pareja y utiliza **1 hora con 30 minutos** para completar el ejercicio. Documenta cada mejora en este archivo.

---

## Instrucciones Generales

- Lee cada mejora sugerida y revisa el código para encontrar dónde aplicarla.
- Divide el trabajo entre ambos integrantes.
- Por cada mejora, completa el formato:
    - **Mejora #[número]:**
        - **Ubicación:**
        - **Descripción del cambio:**
        - **Justificación:**
- Al terminar, asegúrate de que el sistema sigue funcionando correctamente.

---

## Mejoras Propuestas y Pistas

### 1. Base de Datos y Persistencia

**Mejora 1:**  
Evita que se registren productos con el mismo nombre.  
_Pista: Busca dónde se agregan productos y valida antes de insertar en la base de datos._

**Mejora 2:**  
Registra la fecha y hora de cada pedido.  
_Pista: Modifica la entidad y la tabla de pedidos para guardar este dato._

---

### 2. Programación Orientada a Objetos

**Mejora 3:**  
Crea una interfaz `DescuentoAplicable` para aplicar descuentos.  
_Pista: Identifica dónde se calcula el descuento y extrae la lógica a una interfaz._

**Mejora 4:**  
Agrega una clase `Cliente` y asócialo a cada pedido.  
_Pista: Un pedido debe tener información básica del cliente (nombre y correo)._

---

### 3. Validaciones y Seguridad

**Mejora 5:**  
Valida que el stock nunca sea negativo.  
_Pista: Antes de vender, revisa si hay suficiente stock disponible._

**Mejora 6:**  
Valida que los precios y cantidades ingresados sean positivos.  
_Pista: Revisa los formularios o métodos donde se ingresan estos datos._

---

### 4. Interfaz de Usuario y Usabilidad

**Mejora 7:**  
Agrega una opción para mostrar un resumen de inventario.  
_Pista: Implementa un método que liste productos, stock y ventas._

**Mejora 8:**  
Solicita confirmación antes de eliminar un producto.  
_Pista: Antes de borrar, pide al usuario que confirme la acción._

---

### 5. Buenas Prácticas y Refactorización

**Mejora 9:**  
Elimina código duplicado en la gestión de pedidos.  
_Pista: Busca métodos similares y unifícalos en uno solo._

**Mejora 10:**  
Agrega comentarios y documentación básica.  
_Pista: Comenta los métodos principales y documenta las clases nuevas._

---

## Entregables

- Código fuente actualizado y funcional.
- Este archivo `mejoras.md` con la descripción de cada cambio.
- Demostración breve de las mejoras implementadas.

---
