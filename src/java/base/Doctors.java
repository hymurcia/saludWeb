package base;

/**
 *
 * @author Yessid Murcia
 */
public class Doctors extends Institutions {

    //Constructor de la clase
    public Doctors() {
    }

    //metodo para Armar e Imprimir String del Doctor
    @Override
    public String imprimir(String doctor) {

        //Instanciar objeto
        Patients pa = new Patients();

        //Declarar variable que entrega el resultado final
        String answer = "";

        //switch donde se selecciona el Doctor y se arman los datos 
        switch (doctor) {
            case "Dr1":
                answer = this.doctor1 + "<br> " + getCentroSalud() + "<br> <br>Pacientes a su cargo: <br>" + pa.getJose() + "<br>" + pa.getJavier();
                break;
            case "Dr2":
                answer = this.doctor2 + "<br> " + getClinica() + "<br> <br>Pacientes a su cargo: <br>" + pa.getGuillermo() + "<br>" + pa.getEliana();
                break;
            case "Dr3":
                answer = this.doctor3 + "<br> " + getHospital()+ "<br> <br>Pacientes a su cargo: <br>" + pa.getEstiven();
                break;
                case "Dr4":
                answer = this.doctor4 + "<br> " + getClinica()+ "<br> <br>Pacientes a su cargo: <br>" +  "<br> No tiene pacientes porque esta de vacaciones";
                break;
                case "Dr5":
                answer = this.doctor5 + "<br> " + getHospital()+ "<br> <br>Pacientes a su cargo: <br>"+ pa.getEsmeralda();
                break;
            default:
                answer = "Error ¡Seleccione un doctor!";
        }

        return answer;

    }
    
    //Atributos de la subclase
    private String doctor1 = "Doctora: Meiken Merchan";
    private String doctor2 = "Doctor: Augusto Cardenas";
    private String doctor3 = "Doctora: Pilar Hurtado";
    private String doctor4 = "Doctora: Alexandra Arevalo";
    private String doctor5 = "Doctor: Cesar Cardenas";
    

    //Métodos de Encapsulamiento
    public void setDoctor1(String doctor1) {
        this.doctor1 = doctor1;
    }

    public void setDoctor2(String doctor2) {
        this.doctor2 = doctor2;
    }

    public void setDoctor3(String doctor3) {
        this.doctor3 = doctor3;
    }

    public String getDoctor1() {
        return doctor1;
    }

    public String getDoctor2() {
        return doctor2;
    }

    public String getDoctor3() {
        return doctor3;
    }

    public String getDoctor4() {
        return doctor4;
    }

    public void setDoctor4(String doctor4) {
        this.doctor4 = doctor4;
    }

    public String getDoctor5() {
        return doctor5;
    }

    public void setDoctor5(String doctor5) {
        this.doctor5 = doctor5;
    }

}
