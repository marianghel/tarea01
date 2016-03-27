
package Modelo;

public class Curso {
    private String sigla, nombreCurso;
    private String creditos;

    public Curso(String sigla, String nombreCurso, String creditos) {
        this.sigla = sigla;
        this.nombreCurso = nombreCurso;
        this.creditos = creditos;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getCreditos() {
        return creditos;
    }
    public String getInformacion(){
        return "Sigla:"+getSigla()+"\nNombre curso: "+getNombreCurso()+"\nCreditos: "+getCreditos();
    }
}
