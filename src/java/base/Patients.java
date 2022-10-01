package base;

/**
 *
 * @author Yessid Murcia
 */
public class Patients extends Institutions {

    //Constructor de la clase
    public Patients() {
    }

    //metodo para Armar e Imprimir String del Paciente
    @Override
    public String imprimir(String patient) {

        //Instanciar objeto
        Doctors doc = new Doctors();

        //Declarar variable que entrega el resultado final
        String answer = "";

        //switch donde se selecciona el Paciente
        switch (patient) {
            case "Jose":
                answer = getCentroSalud() + "<br>" + "<br>" + doc.getDoctor1() + "<br>" + getJose();
                break;
            case "Eliana":
                answer = getClinica() + "<br>" + "<br>" + doc.getDoctor2() + "<br>" + getEliana();
                break;
            case "Estiven":
                answer = getHospital() + "<br>" + "<br>" + doc.getDoctor3() + "<br>" + getEstiven();
                break;
            case "Javier":
                answer = getCentroSalud() + "<br>" + "<br>" + doc.getDoctor1() + "<br>" + getJavier();
                break;
            case "Guillermo":
                answer = getClinica() + "<br>" + "<br>" + doc.getDoctor2() + "<br>" + getGuillermo();
                break;
            case "Esmeralda":
                answer = getHospital() + "<br>" + "<br>" + doc.getDoctor5() + "<br>" + getEsmeralda();
                break;

            default:
                answer = "Error ¡Seleccione un paciente!";
        }

        return answer;

    }

    //Atributos de la subclase
    private String sexM = "Masculino";
    private String sexF = "Femenino";
    private int id1 = 01245;
    private String nameJose = "Jose Fernando";
    private String lastNameJose = "Pineda Rodriguez";
    private String addressJose = "Calle 6 #5-13 - San Miguel de Sema";
    private String reasonJose = "El paciente sufre de asma y le duele el pecho";
    private String dateJose = "01/Oct/2022";
    private int id2 = 75395;
    private String nameEliana = "Yeimi Eliana";
    private String lastNameEliana = "Pineda Pineda";
    private String addressEliana = "Carrera 6 #2-15 - San Miguel de Sema";
    private String reasonEliana = "La paciente tiene un fuerte dolor en la vista";
    private String dateEliana = "29/Sep/2022";
    private int id3 = 74816;
    private String nameEstiven = "Estiven Arturo";
    private String lastNameEstiven = "Murcia Sanchez";
    private String addressEstiven = "Carrera 5 #4-17 - San Miguel de Sema";
    private String reasonEstiven = "El paciente se accidento en la bicicleta y se corto un brazo";
    private String dateEstiven = "28/Sep/2022";
    private int id4 = 32615;
    private String nameJavier = "Javier Eduardo";
    private String lastNameJavier = "Moreno Pinilla";
    private String addressJavier = "Vereda Peña Blanca - San Miguel de Sema";
    private String reasonJavier = "El paciente tiene una fuerte fiebre y dolor de cabeza";
    private String dateJavier = "30/Sep/2022";
    private int id5 = 12437;
    private String nameGuillermo = "Yamith Guillermo";
    private String lastNameGuillermo = "Moreno Pinilla";
    private String addressGuilermo = "Carrera 8 #14-1 - San Miguel de Sema";
    private String reasonGuillermo = "El paciente se clavo una puntilla en la mano";
    private String dateGuillermo = "02/Oct/2022";
    private int id6 = 98654;
    private String nombreEsmeralda = "Nidia Esmeralda";
    private String lastNameEsmeralda = "Salinas Salinas";
    private String addressEsmeralda = "Vereda San Isidro - San Miguel de Sema";
    private String reasonEsmeralda = "La paciente la mordio un perro";
    private String dateEsmeralda = "24/Sep/2022";

    //Funciones donde se arman los datos de los pacientes 
    public String getJose() {
        return "<br> Nombres: " + this.nameJose + " <br> Apellidos: " + this.lastNameJose + " <br> Codigo: " + this.id1 + " <br> Sexo: " + this.sexM + "<br> Direccion Residencia: " + this.addressJose + " <br> Motivo de consulta: " + this.reasonJose + " <br> Fecha: " + this.dateJose;
    }

    public String getEliana() {
        return "<br> Nombres: " + this.nameEliana + " <br> Apellidos: " + this.lastNameEliana + " <br> Codigo: " + this.id2 + " <br> Sexo: " + this.sexF + "<br> Direccion Residencia: " + this.addressEliana + " <br> Motivo de consulta: " + this.reasonEliana + " <br> Fecha: " + this.dateEliana;
    }

    public String getEstiven() {
        return "<br> Nombres: " + this.nameEstiven + " <br> Apellidos: " + this.lastNameEstiven + " <br> Codigo: " + this.id3 + " <br> Sexo: " + this.sexM + "<br> Direccion Residencia: " + this.addressEstiven + " <br> Motivo de consulta: " + this.reasonEstiven + " <br> Fecha: " + this.dateEstiven;
    }

    public String getJavier() {
        return "<br> Nombres: " + this.nameJavier + " <br> Apellidos: " + this.lastNameJavier + " <br> Codigo: " + this.id4 + " <br> Sexo: " + this.sexM + "<br> Direccion Residencia: " + this.addressJavier + " <br> Motivo de consulta: " + this.reasonJavier + " <br> Fecha: " + this.dateJavier;
    }

    public String getGuillermo() {
        return "<br> Nombres: " + this.nameGuillermo + " <br> Apellidos: " + this.lastNameGuillermo + " <br> Codigo: " + this.id5 + " <br> Sexo: " + this.sexM + "<br> Direccion Residencia: " + this.addressGuilermo + " <br> Motivo de consulta: " + this.reasonGuillermo + " <br> Fecha: " + this.dateGuillermo;
    }

    public String getEsmeralda() {
        return "<br> Nombres: " + this.nombreEsmeralda + " <br> Apellidos: " + this.lastNameEsmeralda + " <br> Codigo: " + this.id6 + " <br> Sexo: " + this.sexF + "<br> Direccion Residencia: " + this.addressEsmeralda + " <br> Motivo de consulta: " + this.reasonEsmeralda + " <br> Fecha: " + this.dateEsmeralda;
    }

    //Métodos de Encapsulamiento
    public String getSexM() {
        return sexM;
    }

    public void setSexM(String sexM) {
        this.sexM = sexM;
    }

    public String getSexF() {
        return sexF;
    }

    public void setSexF(String sexF) {
        this.sexF = sexF;
    }

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    public int getId3() {
        return id3;
    }

    public void setId3(int id3) {
        this.id3 = id3;
    }

    public int getId4() {
        return id4;
    }

    public void setId4(int id4) {
        this.id4 = id4;
    }

    public int getId5() {
        return id5;
    }

    public void setId5(int id5) {
        this.id5 = id5;
    }

    public int getId6() {
        return id6;
    }

    public void setId6(int id6) {
        this.id6 = id6;
    }

    public String getNameJose() {
        return nameJose;
    }

    public void setNameJose(String nameJose) {
        this.nameJose = nameJose;
    }

    public String getLastNameJose() {
        return lastNameJose;
    }

    public void setLastNameJose(String lastNameJose) {
        this.lastNameJose = lastNameJose;
    }

    public String getAddressJose() {
        return addressJose;
    }

    public void setAddressJose(String addressJose) {
        this.addressJose = addressJose;
    }

    public String getReasonJose() {
        return reasonJose;
    }

    public void setReasonJose(String reasonJose) {
        this.reasonJose = reasonJose;
    }

    public String getDateJose() {
        return dateJose;
    }

    public void setDateJose(String dateJose) {
        this.dateJose = dateJose;
    }

    public String getNameEliana() {
        return nameEliana;
    }

    public void setNameEliana(String nameEliana) {
        this.nameEliana = nameEliana;
    }

    public String getLastNameEliana() {
        return lastNameEliana;
    }

    public void setLastNameEliana(String lastNameEliana) {
        this.lastNameEliana = lastNameEliana;
    }

    public String getAddressEliana() {
        return addressEliana;
    }

    public void setAddressEliana(String addressEliana) {
        this.addressEliana = addressEliana;
    }

    public String getReasonEliana() {
        return reasonEliana;
    }

    public void setReasonEliana(String reasonEliana) {
        this.reasonEliana = reasonEliana;
    }

    public String getDateEliana() {
        return dateEliana;
    }

    public void setDateEliana(String dateEliana) {
        this.dateEliana = dateEliana;
    }

    public String getNameEstiven() {
        return nameEstiven;
    }

    public void setNameEstiven(String nameEstiven) {
        this.nameEstiven = nameEstiven;
    }

    public String getLastNameEstiven() {
        return lastNameEstiven;
    }

    public void setLastNameEstiven(String lastNameEstiven) {
        this.lastNameEstiven = lastNameEstiven;
    }

    public String getAddressEstiven() {
        return addressEstiven;
    }

    public void setAddressEstiven(String addressEstiven) {
        this.addressEstiven = addressEstiven;
    }

    public String getReasonEstiven() {
        return reasonEstiven;
    }

    public void setReasonEstiven(String reasonEstiven) {
        this.reasonEstiven = reasonEstiven;
    }

    public String getDateEstiven() {
        return dateEstiven;
    }

    public void setDateEstiven(String dateEstiven) {
        this.dateEstiven = dateEstiven;
    }

    public String getNameJavier() {
        return nameJavier;
    }

    public void setNameJavier(String nameJavier) {
        this.nameJavier = nameJavier;
    }

    public String getLastNameJavier() {
        return lastNameJavier;
    }

    public void setLastNameJavier(String lastNameJavier) {
        this.lastNameJavier = lastNameJavier;
    }

    public String getAddressJavier() {
        return addressJavier;
    }

    public void setAddressJavier(String addressJavier) {
        this.addressJavier = addressJavier;
    }

    public String getReasonJavier() {
        return reasonJavier;
    }

    public void setReasonJavier(String reasonJavier) {
        this.reasonJavier = reasonJavier;
    }

    public String getDateJavier() {
        return dateJavier;
    }

    public void setDateJavier(String dateJavier) {
        this.dateJavier = dateJavier;
    }

    public String getNameGuillermo() {
        return nameGuillermo;
    }

    public void setNameGuillermo(String nameGuillermo) {
        this.nameGuillermo = nameGuillermo;
    }

    public String getLastNameGuillermo() {
        return lastNameGuillermo;
    }

    public void setLastNameGuillermo(String lastNameGuillermo) {
        this.lastNameGuillermo = lastNameGuillermo;
    }

    public String getAddressGuilermo() {
        return addressGuilermo;
    }

    public void setAddressGuilermo(String addressGuilermo) {
        this.addressGuilermo = addressGuilermo;
    }

    public String getReasonGuillermo() {
        return reasonGuillermo;
    }

    public void setReasonGuillermo(String reasonGuillermo) {
        this.reasonGuillermo = reasonGuillermo;
    }

    public String getDateGuillermo() {
        return dateGuillermo;
    }

    public void setDateGuillermo(String dateGuillermo) {
        this.dateGuillermo = dateGuillermo;
    }

    public String getNombreEsmeralda() {
        return nombreEsmeralda;
    }

    public void setNombreEsmeralda(String nombreEsmeralda) {
        this.nombreEsmeralda = nombreEsmeralda;
    }

    public String getLastNameEsmeralda() {
        return lastNameEsmeralda;
    }

    public void setLastNameEsmeralda(String lastNameEsmeralda) {
        this.lastNameEsmeralda = lastNameEsmeralda;
    }

    public String getAddressEsmeralda() {
        return addressEsmeralda;
    }

    public void setAddressEsmeralda(String addressEsmeralda) {
        this.addressEsmeralda = addressEsmeralda;
    }

    public String getReasonEsmeralda() {
        return reasonEsmeralda;
    }

    public void setReasonEsmeralda(String reasonEsmeralda) {
        this.reasonEsmeralda = reasonEsmeralda;
    }

    public String getDateEsmeralda() {
        return dateEsmeralda;
    }

    public void setDateEsmeralda(String dateEsmeralda) {
        this.dateEsmeralda = dateEsmeralda;
    }
}
