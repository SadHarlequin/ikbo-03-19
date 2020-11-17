package practice_9.ex_2;

public class LabClass {
    private LabClassUI classUI;

    public LabClass() {
        this.classUI = new LabClassDriver();
    }

    public LabClassUI getClassUI() {
        return classUI;
    }
}
