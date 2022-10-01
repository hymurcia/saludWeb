package base;

/**
 *
 * @author Yessid Murcia
 */
public class Base {

    //Instanciar objetos
    Patients pa = new Patients();
    Doctors doc = new Doctors();
    Institutions serv = new Institutions();
    
    //metodo que lee el valor de patient y retorna la Respuesta
    public String patient(String patient) {
        return getRespuestaPatient(patient);
    }

    //invoca el metodo de imprimir y lo retona al metodo patient
    public String getRespuestaPatient(String patient) {
        return pa.imprimir(patient);
    }

    //metodo que lee el valor de Doctor y retorna la Respuesta
    public String doctor(String doctor) {
        return getRespuestaDoctor(doctor);
    }

    //invoca el metodo de imprimir y lo retona al metodo doctor
    public String getRespuestaDoctor(String doctor) {
        return doc.imprimir(doctor);
    }
    
    //metodo que lee el valor de la Institucion y retorna la Respuesta
    public String institution(String institution) {
        return getRespuestaInstitution(institution);
    }

    //invoca el metodo de imprimir y lo retona al metodo institutions
    public String getRespuestaInstitution(String institution) {
        return serv.imprimir(institution);
    }
}
