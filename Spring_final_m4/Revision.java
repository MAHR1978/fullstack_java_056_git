package Spring_final_m4;

class Revision {
    private int identificador;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String tipo;
    private String observaciones;

    public Revision() {
    }

    public Revision(int identificador, int rutCliente, String dia, String hora, String lugar, String tipo, String observaciones) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.tipo = tipo;
        this.observaciones = observaciones;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String mostrarDetalle() {
        return "La revisión será en " + lugar + " a las " + hora + " del día " + dia + ", y es de tipo " + tipo;
    }

    @Override
    public String toString() {
        return "Identificador: " + identificador + "\n RUT cliente: " + rutCliente + "\n Día: " + dia + "\n Hora: " + hora +
                "\n Lugar: " + lugar + "\n Tipo: " + tipo + "\n Observaciones: " + observaciones;
    }
}