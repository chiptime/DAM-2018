public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean correcto(){
        if((dia > 0 && dia < 32) && (mes > 0 && mes < 12))
            return true;
        else
            return false;
    }


    public void larga() {
        System.out.println("Estamos a" + dia +
                ", de" + mes +
                ", del" + año );
    }
    public void corta() {
        System.out.println(String.format("%2d/%2d/4%",dia,mes,año));
    }
}





