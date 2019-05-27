package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datas {

    private final SimpleDateFormat FORMATO_DATA = new SimpleDateFormat("EEEE, d' de 'MMMM' de 'yyyy HH:mm:ss");
    private final SimpleDateFormat DATA = new SimpleDateFormat("dd/MM/yyyy");
    public Integer dia=16;
    public Integer mes=06;
    public Integer ano=1994;

    public Datas() {

    }

    public String converterData(Integer dia, Integer mes, Integer ano){
        return DATA.format(new Date("1994"+"06"+"16"));
    }

    public String dataAtual() {
        return DATA.format(new Date());
    }
    public String dataCompleta() {
        return FORMATO_DATA.format(new Date());
    }

    public String dataAtual(Date data) {
        return FORMATO_DATA.format(data);
    }

    public Date dataAtual(String data) throws ParseException {
        return FORMATO_DATA.parse(data);
    }

    /**
     *
     * @return
     */
    public Date date() {
        return new Date();
    }

    public static Datas getInstance() {
        return DatasHolder.INSTANCE;
    }

    private static class DatasHolder {

        private static final Datas INSTANCE = new Datas();
    }


    public java.sql.Date getCurrentDate() {
        java.util.Date today = new java.util.Date();
        return new java.sql.Date(today.getTime());
    }
}
