package Spring_final_m4;

class Capacitacion {
    private int identificador;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    private int cantidadAsistentes;

    public Capacitacion() {
    }

    public Capacitacion(int identificador, int rutCliente, String dia, String hora, String lugar, String duracion, int cantidadAsistentes) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
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

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public String mostrarDetalle() {
        return "La capacitación será en " + lugar + " a las " + hora + " del día " + dia + ", y durará " + duracion + " minutos";
    }

    @Override
    public String toString() {
        return "Identificador: " + identificador + "\n RUT cliente: " + rutCliente + "\n Día: " + dia + "\n Hora: " + hora +
                "\n Lugar: " + lugar + "\n Duración: " + duracion + "\n Cantidad de asistentes: " + cantidadAsistentes;
    }
}

