package br.com.principal.topicos_especiais_em_java;

import javax.sound.midi.Soundbank;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program02 {
    public static void main(String[] args) {

        //Somando uma unidade de tempo

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        //Adiciona a Data que está no calendario + 4 horas
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();

        System.out.println(sdf.format(d));
    }
}
