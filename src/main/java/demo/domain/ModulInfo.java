package demo.domain;

/**
 * Created by Benjamin Haupt on 07.06.15.
 */
public class ModulInfo {
    private String modulNummer;
    private int credits;
    private String präsenzeit;
    private int semester;
    private Status status;

    public ModulInfo(String modulNummer, int credits, String präsenzeit, int semester, Status status) {
        this.modulNummer = modulNummer;
        this.credits = credits;
        this.präsenzeit = präsenzeit;
        this.semester = semester;
        this.status = status;
    }

    public String getModulNummer() {
        return modulNummer;
    }

    public int getCredits() {
        return credits;
    }

    public String getPräsenzeit() {
        return präsenzeit;
    }

    public int getSemester() {
        return semester;
    }

    public Status getStatus() {
        return status;
    }
}