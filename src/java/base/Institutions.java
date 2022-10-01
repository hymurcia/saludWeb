package base;

/**
 *
 * @author Yessid Murcia
 */
public class Institutions {

    //Constructor de la clase
    public Institutions() {
    }

    //metodo para Armar String del contenido de la Institucion
    public String imprimir(String institution) {

        //Instanciar objeto
        Patients pa = new Patients();
        Doctors doc = new Doctors();

        //Declarar variable que entrega el resultado final
        String answer = "";

        //switch donde se selecciona la Institucion
        switch (institution) {
            case "Hospital":
                answer = this.hospital + "<br><br>" + "Doctores en la nomina: <br> " + doc.getDoctor3() + "<br>" + doc.getDoctor5() + "<br> <br>Pacientes del Hospital: <br>" + pa.getEsmeralda() + "<br>" + pa.getEstiven();
                break;
            case "Clinica":
                answer = this.clinica + "<br><br>" + "Doctores en la nomina: <br> " + doc.getDoctor2() + "<br>" + doc.getDoctor4() + "<br> <br>Pacientes de la Clinica: <br>" + pa.getGuillermo() + "<br>" + pa.getEliana();
                break;

            case "CentroDeSalud":
                answer = this.centroDeSalud + "<br><br>" + "Doctores en la nomina: <br> " + doc.getDoctor1() + "<br> <br>Pacientes del Centro de Salud: <br>" + pa.getJose() + "<br>" + pa.getJavier();
                break;

            default:
                answer = "Error ¡Seleccione una institución!";
        }

        return answer;

    }

    //Atributos de la clase
    private String hospital = "Hospital Regional de Chiquinquira - Chiquinquira";
    private String clinica = "Clinica Colsubsidio - Chiquinquira";
    private String centroDeSalud = "ESE Centro de salud San Miguel - San Miguel De sema";

    //Métodos de Encapsulamiento
    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getClinica() {
        return clinica;
    }

    public void setClinica(String clinica) {
        this.clinica = clinica;
    }

    public String getCentroSalud() {
        return centroDeSalud;
    }

    public void setCentroDeSalud(String centroDeSalud) {
        this.centroDeSalud = centroDeSalud;
    }

}
