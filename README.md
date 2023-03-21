# Convesor_de_Unidades_JAVA
![baner](https://user-images.githubusercontent.com/90876974/226710155-0eb5a788-5201-4155-8e50-ce7db2ae86d5.png)
## Introducción

El CDU_JAVA (Conversor de Unudaes JAVA) es un proyecto con el fin de desarrollar
las habilidades de logica de programacion y conseptos basicos abquiridos en el 
programa ONE de alura latam.

Este proyecto consiste en una serie de conversores de unidades, tanto de divisas,
longitud o temperatura sin embargo se puede expandir la lista a diferentes tipos 
de conversiones, ajustandose a las nesesidades del usuario.

## Como Funciona

* Al ejecutar la clse principal aparesera una interfaz donde podras seleccionar el
  el tipo de conversion que quieras de una lista.
  
![interfaz](https://user-images.githubusercontent.com/90876974/226712866-51874cd1-cff6-4abe-a331-ae2ba5683615.png)


* Cuando este seleccionado el tipo de convercion el icono y el titulo cambiaran de
  accuerdo a lo seleccionado.

![temperatura](https://user-images.githubusercontent.com/90876974/226713265-633f0005-957b-4c46-8e4b-97f336e5eb26.png)
 
* Te pedira ingresar el valor a convertir asi como podras elegir de una lista tanto
  la unidad de entrada como de salida.

![longitud](https://user-images.githubusercontent.com/90876974/226713318-7cce8e69-ec5a-4739-88a9-1d400265883f.png)


* Tambien puedes seleccionar el tipo de convercion en el menu editar de la barra 
  superior.

## Ejemplo
  El sigiiente video muestra el funcionamiento del video con mas detalle.
  

https://user-images.githubusercontent.com/90876974/226716193-db80efb9-d68d-4ea2-a3a7-80c0e0cc07b6.mp4


  
## Agregando Converciones

Para agregar un nuevo tipo de convercion hay que crear una nueva clase en la 
carpeta principal del proyecto (com.mycompany.conversorunidades) con la logica de
la conversion correspondiente.

![codigo](https://user-images.githubusercontent.com/90876974/226713384-f6ee3871-1be2-4518-b6db-e78a26a1e66f.png)


En la clase "interfazApp" instanciar la clase correspondiente, agregar tanto en 
la lista de converciones como en la estructura switch-case el caso que corresponda
a la nueva clase, por ultimo puedes agregar un icono en la clase "listaIconos"
repitiendo el proseso anterior.

## Posibles Errores

En caso de que las imagenes creen un error utiliza la ruta absoluta de la imagen en cuestion para resolver el problema.
Cambiando la ruta en la clase "listaIconos".

