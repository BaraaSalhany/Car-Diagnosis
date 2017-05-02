package entity;

public class PrintCarDiagnosis {
    private OAV oav;
    private String str;
    private boolean flag;

    public PrintCarDiagnosis(OAV oav, String str, boolean flag) {
        this.oav = oav;
        this.str = str;
        this.flag = flag;
    }

    public OAV getOav() {
        return oav;
    }

    public void setOav(OAV oav) {
        this.oav = oav;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
