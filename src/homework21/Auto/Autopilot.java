package homework21.Auto;

import leson21.Autobus;

public class Autopilot {
    private String softwareVersion;
    //Двунаправленная связь
    private leson21.Autobus autobus;

    public Autopilot(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    @Override
    public String toString() {
        return "Autopilot{" +
                "SV: '" + softwareVersion + '\'' +
                '}';
    }

    public leson21.Autobus getAutobus() {
        return autobus;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }
}
