## 🏥 Sistema de Historial Clínico
Proyecto backend desarrollado en *Java puro* utilizando *JDBC* para la persistencia de datos.  
Aplica una *arquitectura en capas, el **patrón DAO*, y buenas prácticas de diseño orientadas a la mantenibilidad y claridad del código.

---

## ⚙️ Tecnologías utilizadas
- *Java SE*
- *JDBC* (conexión directa a base de datos)
- *MySQL* (administrado con DBeaver)
- *Git & GitHub* (control de versiones)
- IDE: NetBeans

---

## 📐 Arquitectura del proyecto
Organizado en capas para garantizar separación de responsabilidades:

```
src/ 
     ├── model/ → Entidades del dominio (Paciente, HistorialClinico, etc.) 
     ├── dao/ → Acceso a datos con JDBC y SQL puro 
     ├── service/ → Lógica de negocio y validaciones 
     ├── config/ → Conexión a BD y helpers reutilizables 
     └── main/ → Menú principal y flujo de ejecución
```
---

## ✅ Buenas prácticas aplicadas
-  *Patrón DAO* para desacoplar la lógica de persistencia
-  *Separación de capas*: main, service, DAO, models, config
-  *Manejo de errores* con mensajes claros y trazables
-  *Código limpio y comentado*, siguiendo convenciones Java
-  *Transacciones* en operaciones críticas

---

## 🧪 Funcionalidades
- Registro y gestión de pacientes
- Alta y consulta de historiales clínicos
- Búsqueda por ID y listado completo
- Validaciones básicas y control de flujo por consola

---

## 🎯 Objetivo del proyecto
Este sistema fue desarrollado como parte de mi formación como desarrollador backend, con foco en:

- Dominio de JDBC y SQL
- Diseño de DAOs robustos
- Aplicación de principios de arquitectura limpia

---
## 👨‍💻 Autor

- Cain Backend Developer en formación | Java & Spring Ecosystem 📍 Buenos Aires, Argentina
