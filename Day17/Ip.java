package Day17;

public class Ip {
    static String defangIPaddr(String address) {
        String ip=address;
        ip=ip.replace(".","[.]");
        return ip;


    }

    public static void main(String[] args) {
        String address = "1.1.1.1";
        String ans=defangIPaddr(address);
        System.out.println(ans);

    }
}
