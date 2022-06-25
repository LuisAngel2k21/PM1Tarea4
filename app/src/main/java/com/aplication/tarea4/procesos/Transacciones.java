package com.aplication.tarea4.procesos;

public class Transacciones
{

    public static final String NameDatabase = "BDTarea";
    public static final String tablafotos = "fotos";

    public static final String id = "id";
    public static final String nombres = "nombres";
    public static final String descripcion = "descripcion";
    public static final String pathImage = "pathImage";
    public static final String image = "image";

    public static final String CreateTableFotos = "CREATE TABLE fotos " +
            "(id INTEGER PRIMARY KEY AUTOINCREMENT,"+
            "nombres TEXT, descripcion TEXT, pathImage TEXT, image BLOB)";

    public static final String DropTableFotos = "DROP TABLE IF EXISTS " + tablafotos;
    public static final String SELECT_ALL_TABLE_PICTURE = "SELECT * FROM " + tablafotos;
}
