package Controlador;

import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import javax.swing.JLabel;
import java.time.MonthDay;
import java.time.Year;
import java.util.Arrays;

public class Hilo1 extends Thread {

    private static Hilo1 nodo;

    public static Hilo1 getNodo(JLabel Relog) {
        String d = "" + MonthDay.now();
        d = d.substring(2, d.length());
        String[] day = d.split("-");
        day = Arrays.copyOf(day, 3);
        day[2] = "" + Year.now();
        day[2] = day[2].strip();
        System.out.println(Arrays.toString(day));

        if (nodo == null) {
            return new Hilo1(Relog);
        }
        return nodo;
    }

    public static Hilo1 getNodo() {
        if (nodo == null) {
            return new Hilo1();
        }
        return nodo;
    }
    private final JLabel Relog;
    private String Hora, Min, Seg;
    private Calendar c;

    private Hilo1(JLabel Relog) {
        this.Relog = Relog;
        this.Hora = "";
        this.Min = "";
        this.Seg = "";
    }

    private Hilo1() {
        c = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        this.Relog = null;
        this.Hora = "";
        this.Min = "";
        this.Seg = "";
    }

    @Override
    public void run() {
        if (Relog != null) {
            try {
                while (true) {
                    c = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
                    Hora = "" + c.get(Calendar.HOUR_OF_DAY);
                    Min = "" + c.get(Calendar.MINUTE);
                    Seg = "" + c.get(Calendar.SECOND);
                    if (c.get(Calendar.HOUR) > 11) {
                        Relog.setText(Hora + ":" + Min + ":" + Seg + "PM");
                    } else {
                        Relog.setText(Hora + ":" + Min + ":" + Seg + "AM");
                    }
                    if (c.get(Calendar.HOUR_OF_DAY) >= 22) {
                        System.exit(1);
                    }
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println(e.getCause());
            }
        }
    }

    public boolean Abrir() {
        boolean abrir = c.get(Calendar.HOUR_OF_DAY) > 6 && c.get(Calendar.HOUR_OF_DAY) <= 22;
        return abrir;
    }
}
