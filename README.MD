# Test Nequi API

API desarrollada en **Spring Boot** para gestionar franquicias, oficinas y productos.

## Cómo Ejecutar en Local

1. Clona este repositorio:
   ```bash
   git clone https://github.com/SantiagoCaceres9818/Test-Nequi
2. Navega al directorio del proyecto
    ```bash
    cd Test-Nequi
3. Ejecuta la aplicación
    ```bash
    mvn spring-boot:run


## ENDPOINTS 

## Franquicias
POST /api/franchise
Crear una nueva franquicia.
Body:
    ```json
{
  "name": "Franquicia Ejemplo"
}

PUT /api/franchise/{id}?name={name}
Actualizar el nombre de una franquicia.


## Sucursales

POST /api/{franchiseId}/office
Crear una oficina asociada a una franquicia.
Body:
    ```json
{
  "name": "Oficina Ejemplo"
}

## Productos

POST /api/{officeId}/product
Crear un producto asociado a una oficina.
Body:
    ```json
{
  "name": "Producto Ejemplo",
  "stock": 100
}

DELETE /api/{officeId}/product/{productId}
Eliminar un producto.