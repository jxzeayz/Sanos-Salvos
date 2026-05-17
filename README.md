# Sanos y Salvos

Plataforma web para la localización y recuperación de mascotas perdidas.

Este proyecto corresponde al caso semestral de la asignatura Desarrollo Fullstack III. La solución está basada en una arquitectura de microservicios, utilizando React para el frontend, Spring Boot para backend, PostgreSQL/PostGIS para persistencia, RabbitMQ para mensajería, MinIO para almacenamiento de imágenes y Docker Compose para levantar el ambiente completo.

## Tecnologías base

- React + Vite
- Spring Boot
- Java 17
- Maven
- PostgreSQL + PostGIS
- RabbitMQ
- MinIO
- Docker / Docker Compose
- Git / GitHub

## Estructura del proyecto

Sanos-Salvos/
- frontend/
- bff-web/
- docker/
- ms-archivos/
- ms-auditoria/
- ms-auth/
- ms-geolocalizacion/
- ms-mascotas/
- ms-matching/
- ms-notificaciones/
- docker-compose.yml
- README.md
- .gitignore

## Microservicios trabajados actualmente

- ms-matching: puerto 8083
- ms-notificaciones: puerto 8085
- ms-archivos: puerto 8086
- ms-auditoria: puerto 8087

## Servicios de infraestructura

- PostgreSQL/PostGIS: puerto 5432
- RabbitMQ: puerto 5672
- RabbitMQ Management: http://localhost:15672
- MinIO API: puerto 9000
- MinIO Console: http://localhost:9001

## Credenciales locales

Estas credenciales son solo para desarrollo local.

PostgreSQL:
- Usuario: admin
- Contraseña: admin123
- Base de datos: sanosysalvos

RabbitMQ:
- URL: http://localhost:15672
- Usuario: admin
- Contraseña: admin123

MinIO:
- URL: http://localhost:9001
- Usuario: admin
- Contraseña: admin123

## Requisitos para ejecutar el proyecto

Antes de levantar el proyecto, se necesita tener instalado:

- Git
- Node.js
- Java JDK 17
- Maven
- Docker Desktop
- Docker Compose
- Visual Studio Code o IntelliJ IDEA

## Clonar el repositorio

git clone https://github.com/jxzeayz/Sanos-Salvos.git
cd Sanos-Salvos

## Levantar ambiente completo con Docker Compose

Desde la raíz del proyecto ejecutar:

docker compose up -d --build

Este comando levanta:

- PostgreSQL/PostGIS
- RabbitMQ
- MinIO
- ms-matching
- ms-notificaciones
- ms-archivos
- ms-auditoria

## Ver contenedores activos

docker ps

## Validar microservicios

Invoke-RestMethod http://localhost:8083/actuator/health
Invoke-RestMethod http://localhost:8085/actuator/health
Invoke-RestMethod http://localhost:8086/actuator/health
Invoke-RestMethod http://localhost:8087/actuator/health

Todos deberían responder con status UP.

## Apagar ambiente Docker

docker compose down

Este comando apaga los contenedores, pero mantiene los volúmenes de datos.

## Frontend

Para ejecutar el frontend de forma local:

cd frontend
npm install
npm run dev

Luego abrir:

http://localhost:5173

## Comandos Git recomendados

Antes de empezar a trabajar:

git fetch origin
git status

Si hay cambios nuevos en GitHub:

git pull origin main

Para guardar cambios:

git add .
git commit -m "Mensaje descriptivo del cambio"
git push

## Estado actual

Actualmente el proyecto cuenta con:

- Infraestructura Docker funcionando.
- Frontend base creado con React + Vite.
- Microservicios base creados con Spring Boot.
- Dockerfiles creados para los microservicios trabajados.
- Docker Compose integrado para levantar infraestructura y microservicios.
- Health checks funcionando en los microservicios principales.
