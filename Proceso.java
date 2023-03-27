public class Proceso{
    private String nombreProceso;
    private String nombreUsuario;
    private int valorNice;
    private int pr;
    
    public Proceso() {
        this.nombreProceso = "";
        this.nombreUsuario = "";
        this.valorNice = 0;
        this.pr = 0;
    }

    public Proceso(String nombreProceso, String nombreUsuario, int valorNice, int pr) {
        this.nombreProceso = nombreProceso;
        this.nombreUsuario = nombreUsuario;
        this.valorNice = valorNice;
        this.pr = pr;
    }


    public String getNombreProceso() {
        return this.nombreProceso;
    }

    public void setNombreProceso(String nombreProceso) {
        this.nombreProceso = nombreProceso;
    }

    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getValorNice() {
        return this.valorNice;
    }

    public void setValorNice(int valorNice) {
        this.valorNice = valorNice;
    }

    public Proceso nombreProceso(String nombreProceso) {
        setNombreProceso(nombreProceso);
        return this;
    }

    public Proceso nombreUsuario(String nombreUsuario) {
        setNombreUsuario(nombreUsuario);
        return this;
    }

    public Proceso valorNice(int valorNice) {
        setValorNice(valorNice);
        return this;
    }

    public int getPr() {
        return this.pr;
    }

    public void setPr(int pr) {
        this.pr = pr;
    }

    public Proceso pr(int pr) {
        setPr(pr);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " nombreProceso='" + getNombreProceso() + "'" +
            ", nombreUsuario='" + getNombreUsuario() + "'" +
            ", valorNice='" + getValorNice() + "'" +
            "}";
    }

}