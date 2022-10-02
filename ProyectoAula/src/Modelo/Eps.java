package Modelo;

public class Eps { //En esta clase se obtienen los datos de las clases Registro, Acita e Inisesion
    private String horarios;
    private String areaSalud;
    private Acita apartarcita;
    private Registro registrar;
    private Inisesion inisesion;

    public Eps(String horarios, String areaSalud, Acita apartarcita, Registro registrar, Inisesion inisesion) {
        this.horarios = horarios;
        this.areaSalud = areaSalud;
        this.apartarcita = apartarcita;
        this.registrar = registrar;
        this.inisesion = inisesion;
    }

    public String getHorarios() {
        return horarios;
    }

    public String getAreaSalud() {
        return areaSalud;
    }

    public Acita getApartarcita() {
        return apartarcita;
    }

    public Registro getRegistrar() {
        return registrar;
    }

    public Inisesion getInisesion() {
        return inisesion;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public void setAreaSalud(String areaSalud) {
        this.areaSalud = areaSalud;
    }

    public void setApartarcita(Acita apartarcita) {
        this.apartarcita = apartarcita;
    }

    public void setRegistrar(Registro registrar) {
        this.registrar = registrar;
    }

    public void setInisesion(Inisesion inisesion) {
        this.inisesion = inisesion;
    }
    
    
}
