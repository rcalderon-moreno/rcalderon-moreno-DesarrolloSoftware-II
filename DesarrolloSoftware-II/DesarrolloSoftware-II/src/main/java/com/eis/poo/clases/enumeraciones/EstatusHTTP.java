package com.eis.poo.clases.enumeraciones;

public enum EstatusHTTP {
    OK(200, "OK", "La solicitud fue exitosa"),
    CREATED(201, "CREATED", "Recurso creado correctamente"),
    BAD_REQUEST(400, "BAD REQUEST", "La solicitud es incorrecta"),
    UNAUTHORIZED(401, "UNAUTHORIZED", "No autorizado"),
    FORBIDDEN(403, "FORBIDDEN", "Acceso prohibido"),
    NOT_FOUND(404, "NOT FOUND", "Recurso no encontrado"),
    INTERNAL_ERROR(500, "INTERNAL SERVER ERROR", "Error interno del servidor");

    private final int codigo;
    private final String nombre;
    private final String descripcion;

    EstatusHTTP(int codigo, String nombre, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public static EstatusHTTP desdeCodigo(int codigo) {
        for (EstatusHTTP estado : EstatusHTTP.values()) {
            if (estado.getCodigo() == codigo) {
                return estado;
            }
        }
        return null;
    }
}
