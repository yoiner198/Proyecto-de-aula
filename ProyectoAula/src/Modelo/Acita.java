package Modelo;

public class Acita { //esta clase define las variables necesarias para luego usarlas en el proceso de apartar citas
    
    private String motivoConsula;
    private String tipoConsulta;

    public Acita(String motivoConsula, String tipoConsulta) {
        this.motivoConsula = motivoConsula;
        this.tipoConsulta = tipoConsulta;
    }

    public String getMotivoConsula() {
        return motivoConsula;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setMotivoConsula(String motivoConsula) {
        this.motivoConsula = motivoConsula;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }
    
    
}
