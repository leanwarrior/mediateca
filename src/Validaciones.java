import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaciones {

    public static boolean validarCodigo(String codigo, String tipoMaterial) {
        String patron = "";
        if (tipoMaterial.equalsIgnoreCase("libro")) {
            patron = "^LIB\\d{5}$";
        } else if (tipoMaterial.equalsIgnoreCase("revista")) {
            patron = "^REV\\d{5}$";
        } else if (tipoMaterial.equalsIgnoreCase("cd")) {
            patron = "^CDA\\d{5}$";
        } else if (tipoMaterial.equalsIgnoreCase("dvd")) {
            patron = "^DVD\\d{5}$";
        }
        Pattern p = Pattern.compile(patron);
        Matcher m = p.matcher(codigo);
        return m.matches();
    }

    public static boolean validarNumero(String numero) {
        Pattern p = Pattern.compile("^\\d+$");
        Matcher m = p.matcher(numero);
        return m.matches();
    }

    public static boolean validarFecha(String fechaStr) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        df.setLenient(false);
        try {
            Date fecha = df.parse(fechaStr);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
