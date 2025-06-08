1. ## Objetivo del Programa ## 

El programa tiene como objetivo principal permitir al usuario ingresar una cadena de signos y una serie de elementos en un stack. Luego, el programa verifica la validez de la cadena de paréntesis y ordena los elementos del stack, mostrando tanto el stack original como el ordenado.
2. ## El programa se compone de las siguientes clases ## 

App: Esta es la clase principal que contiene el método main. Se encarga de interactuar con el usuario, solicitando la entrada de datos y mostrando los resultados.

Validar: Esta clase  contiene un método estático isValid que verifica si la cadena de paréntesis ingresada es valida. Este método utiliza un stack para comprobar que cada paréntesis abierto tenga su correspondiente paréntesis cerrado.

OrdenarStack: Esta clase se encarga de ordenar un stack de cadenas. Contiene dos métodos:

sortStack: Ordena el stack de cadenas de manera que los elementos más pequeños queden en la parte superior del stack. Utiliza un stack temporal para realizar la ordenación.
printStack: Imprime el contenido del stack desde el tope hasta la base, mostrando los elementos en el orden en que se encuentran 