# Generador de nombres

Generador de nombres y apellidos aleatorios obtenidos mediante una base de datos MySQL. Realizado con **Java** Swing utilizando el patrón MVC.

## Base de datos de nombres y apellidos

Es necesario tener operativa la base de datos **nomape**, que cuenta con 705 nombres populares de Argentina y 1871 apellidos populares de países de habla hispana, Brasil, EEUU e Italia.

Verificar la clave de superusuario **root**. Por defecto, en la aplicación la clave es "**root**".

### Para importar la base de datos:

Las siguientes instrucciones muestran los pasos a seguir utilizando el software *MySQL Workbench*, aunque también es posible importar la base de datos usando *PHPMyAdmin* o la consola.

1. En MySQL Workbench, ir al menú *Server* y seleccionar la opción *Data Import*.
2. Marcar el modo *Import from Self-Contained File* y seleccionar el archivo **nomape.sql**. [*DESCARGAR DESDE AQUI*](https://github.com/caemci/bases-de-datos)
3. En el campo *Default Target Schema*, seleccionar el *schema* ya creado que recibirá los datos importados, o en su defecto, presionar *new* para crear un nuevo *schema*.
4. Presionar *Start import* y esperar el mensaje *Import complete*.
5. En el listado de *schemas*, presionar con el botón derecho y elegir la opción *Refresh All*.
6. Verificar que haya dos tablas creadas (**nombres** y **apellidos**) con registros dentro.

## Exportar nombres generados

Hay dos modos de exportar los resultados: con los nombres y apellidos separados en dos campos diferentes o concatenados para formar un único campo.
El formato de archivo por defecto es *.csv (**c**omma-**s**eparated **v**alues)*  y puede ser abierto con cualquier software de hojas de cálculo (Excel, Calc, etc.) o editores de texto.