public class Vul {
    String cmd;
    public void setCmd(String cmd){
        this.cmd = cmd;
        try {
            Runtime.getRuntime().exec(this.cmd);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
