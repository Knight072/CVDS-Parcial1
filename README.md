1. Se arroja la excepción cuando entra como parámetro una edad negativa, cuando los días de antelación tienen un valor negativo y, además, se ingresa una tarifa base menor a cero.
2. edad:
     |Número | Clase equivalencia   | Resultado|
     |------ |--------------------  |----------|
     |0 <    | no se aceptan edades |Incorrecto|
              negativas
     |------ |--------------------  |----------|
     |0-18   | edad menor de edad    |Correcto  |
     |19-65  | edad para adulto      |Correcto  |
     |66-118 | edad para adulto mayor |Correcto|
     |118 > | no se aceptan edades tan altas |Incorrecto|
   
   tarifabase:
     |Número | Clase equivalencia   | Resultado|
     |------ |--------------------  |----------|
     |0 <    | tarifa negativa para |Incorrecto|
               un vuelo
     |0      | tarifa gratis        |Correcto  |
     |0 >    | tarifa válida para   |Correcto  |
               un vuelo
   diasantelacion:
     |Número | Clase equivalencia   | Resultado|
     |------ |--------------------  |----------|
     |0 <    | ya no tiene validez  |Incorrecto|
     |0-20   | no aplica descuento  |Correcto  |
     |20 >   | aplica descuento     |Correcto  |

4. edad:


