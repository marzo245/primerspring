# 🧪 Proyecto Inicial con Spring Boot

Este repositorio documenta los pasos básicos para crear y probar una aplicación Java utilizando el framework **Spring Boot**, con recursos estáticos y endpoints dinámicos.

## 📚 Tabla de Contenidos

1. [🚀 Creación del Proyecto](#-creación-del-proyecto)
2. [🌐 Desarrollo del Primer Endpoint](#-desarrollo-del-primer-endpoint)
3. [🖥️ Recurso Estático HTML](#️-recurso-estático-html)
4. [✅ Pruebas del Endpoint](#-pruebas-del-endpoint)
5. [🚫 Manejo de Rutas No Definidas](#-manejo-de-rutas-no-definidas)
6. [🧪 Prueba Final sin Ruta](#-prueba-final-sin-ruta)
7. [💬 Interfaz Dinámica con HTML + JS](#-interfaz-dinámica-con-html--js)
8. [🧪 Pruebas con Datos Dinámicos](#-pruebas-con-datos-dinámicos)

---

## 🚀 Creación del Proyecto

El proyecto fue generado utilizando [Spring Initializr](https://start.spring.io/).  
Incluye dependencias básicas para desarrollo web con Spring Boot.

![Creación del proyecto](https://github.com/user-attachments/assets/1bd0069e-ae5d-4f47-ada6-4b3840ad4374)

---

## 🌐 Desarrollo del Primer Endpoint

Se implementó un **controlador REST** con un endpoint básico que retorna un mensaje de texto plano.

![Primer endpoint](https://github.com/user-attachments/assets/b7887971-4584-40a8-8b35-dfd841e9d97d)

---

## 🖥️ Recurso Estático HTML

Se agregó el archivo `greeting.html` dentro del directorio `resources/static/`, el cual puede ser accedido directamente por el navegador.

![Recurso estático HTML](https://github.com/user-attachments/assets/e55a977b-6f05-4702-8550-7092c8c5d7f9)

---

## ✅ Pruebas del Endpoint

Las pruebas se realizaron accediendo al endpoint a través del navegador y validando el mensaje de respuesta.

![Prueba 1](https://github.com/user-attachments/assets/db812c4f-d55a-4a2a-ba0c-e913778d5711)  
![Prueba 2](https://github.com/user-attachments/assets/1187b8ab-226c-4f81-b605-5d7bf19cee0e)

---

## 🚫 Manejo de Rutas No Definidas

Se configuró el comportamiento por defecto para rutas inexistentes, devolviendo un mensaje o recurso personalizado.

![Ruta sin definir](https://github.com/user-attachments/assets/b2d774ad-c702-4f66-b89c-33e402faf510)

---

## 🧪 Prueba Final sin Ruta

Se validó el comportamiento cuando se accede a una ruta no definida, mostrando el mensaje correspondiente.

![Prueba final](https://github.com/user-attachments/assets/4005a529-03dc-481c-b36e-cddfe7c37b4e)

---

## 💬 Interfaz Dinámica con HTML + JS

Se desarrolló una interfaz en HTML con JavaScript que permite enviar datos mediante un formulario al endpoint `/Hello` usando `POST`.  
El backend procesa la información y retorna un mensaje dinámico.

![Interfaz dinámica](https://github.com/user-attachments/assets/b32716c9-2790-4078-a2ce-b72c8c67e52f)

---

## 🧪 Pruebas con Datos Dinámicos

Se realizaron pruebas enviando diferentes mensajes desde la interfaz HTML y visualizando las respuestas generadas por el backend.

**Ejemplo de mensaje personalizado:**

![Resultado](https://github.com/user-attachments/assets/66a8fa81-b4ea-4d71-a2af-487b8ba72e8b)

**Envío de información adicional:**

![Resultado adicional](https://github.com/user-attachments/assets/67b915cc-2c03-4d22-84de-39b7064f387f)

---

## 📄 Licencia

Este proyecto está bajo la Licencia [MIT](https://opensource.org/licenses/MIT) *(puedes cambiarla si usas otra como GNU/GPL)*.

---

## 🙌 Autor

Diego Chicuazuque  
Estudiante de Ingeniería de Sistemas  



