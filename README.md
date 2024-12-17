# Convertidor de Monedas

## Requisitos previos

- Tener instalado Java Development Kit (JDK) en tu sistema.
- Contar con acceso a internet para conectarse a la API.
- Obtener una clave de API gratuita en [ExchangeRate-API](https://www.exchangerate-api.com/) y reemplazar `TU_API_KEY` en la clase `Moneda`.

## Estructura del proyecto

convertidor-monedas/ ├── src/ │ ├── Principal.java # Clase principal con la lógica del programa. 
                              │ ├── Moneda.java # Clase auxiliar para obtener datos de la API. 
                     └── lib/ └── gson-2.11.0.jar # Biblioteca para manejar JSON.

## Qué hace la aplicación

Esta aplicación permite convertir monedas entre diferentes divisas seleccionadas utilizando una API de tasas de cambio. El funcionamiento es el siguiente:

1. **Selección de moneda de origen**: El usuario elige una moneda base de entre las disponibles:
   - ARS - Peso argentino
   - BOB - Boliviano boliviano
   - BRL - Real brasileño
   - CLP - Peso chileno
   - COP - Peso colombiano
   - USD - Dólar estadounidense

2. **Selección de moneda de destino**: El usuario elige la moneda a la que desea convertir.

3. **Ingreso del monto**: El usuario ingresa el monto a convertir.

4. **Cálculo del resultado**: La aplicación calcula el valor convertido utilizando la tasa de cambio obtenida de la API y muestra el resultado.

5. **Repetir conversión**: Una vez realizado el cálculo, el usuario puede optar por realizar otra conversión o salir de la aplicación.
