public class Main {

    public static void main(String[] args) {

        HospitalManagement ERDirector = new HospitalManagement();

        Employee pepa = new Nurse(1, "Pepa", "Emergency", true);
        ERDirector.callUpon(pepa);

        Employee rox = new Doctor(2, "Roxy", "Emergency", true);
        ERDirector.callUpon(rox);

    }

}
