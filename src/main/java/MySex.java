public class MySex implements Sex {
    public String sex = "man";
    public MySex(){
        System.out.println("MySex()");
    }
    public String getSex() {
        System.out.println("getSex()");
        return sex;
    }

    public void setSex(String sex) {
        System.out.println("setSex()");
        this.sex = sex;
//        try {
//            Runtime.getRuntime().exec("gnome-calculator");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
