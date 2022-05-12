package Utils;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Horario {
    public static void qualHorario() {
        //Horário
        Calendar data = new GregorianCalendar();
        int hora = data.get(Calendar.HOUR_OF_DAY);

        if (hora > 0 && hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora >= 12  && hora < 18) {
            System.out.println("Boa tarde !");
        } else {
            System.out.println("Boa noite!");
        }
    }
}
