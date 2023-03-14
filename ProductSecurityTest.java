import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

class getPassword {
    public static void main(String[] args) throws Exception {

        for( int i=0 ; i < 999999; i++) {

            String secretCode = "admin1," + i + ",888888";

            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] digest = md.digest(secretCode.getBytes(StandardCharsets.UTF_8));
            String sha256 = DatatypeConverter.printHexBinary(digest).toLowerCase();

            if ( sha256.equalsIgnoreCase("69c0144fad2f52e2bacfb9ffbd73f39ba4c9b0abc55d4b759cb8b970ee4de82c")) {
                System.out.println(i);
            }
        }
    }
}

class validatePassword {
    public static void main(String[] args) throws Exception {
        String credentials = "admin1,33982,888888";

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] digest = md.digest(credentials.getBytes(StandardCharsets.UTF_8));
        String sha256 = DatatypeConverter.printHexBinary(digest).toLowerCase();


        System.out.println(sha256);
    }
}


