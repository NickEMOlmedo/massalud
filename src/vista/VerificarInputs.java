package vista;

import java.text.Normalizer;

public class VerificarInputs {

    public static boolean soloLetras(String cadena) {
        if (cadena == null || cadena.equals("")) {
            return false;
        }

        // Normalizar la cadena para eliminar los acentos
        String cadenaSinAcentos = Normalizer.normalize(cadena, Normalizer.Form.NFD)
                .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

        for (int x = 0; x < cadenaSinAcentos.length(); x++) {
            char c = cadenaSinAcentos.charAt(x);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
                return false;
            }
        }
        return true;
    }

    public static boolean soloNumeros(String s) {
        if (s == null || s.equals("")) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
