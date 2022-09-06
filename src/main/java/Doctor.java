public class Doctor extends Employee {

    public Doctor(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Doctor in action ...");
    }

    @Override
    public void performDuties() {
        prescribeMedicine();
        diagnosePatient();
    }

    private void prescribeMedicine(){
        System.out.println("Prescribing medicine");
    }

    private void diagnosePatient(){
        System.out.println("Diagnosing Patient");
    }

}
