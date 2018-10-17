public class NIF {
    private long docu;
    private char letra[] = {
        'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'
    };
    private char letraBuena;

    public NIF(long docu, char letraBuena) {
        this.docu = docu;
        this.letraBuena = letraBuena;
    }



    public char calcularLetra(long docu){
        return letra[(int) (docu % 23)];
    }
    public boolean comprobarLetra(){
        if(calcularLetra(this.docu) == this.letraBuena)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "NIF{" +
                "docu=" + docu +
                ", letraBuena=" + letraBuena +
                '}';
    }

    public long getDocu() {
        return docu;
    }

    public void setDocu(long docu) {
        this.docu = docu;
    }

    public char[] getLetra() {
        return letra;
    }

    public void setLetra(char[] letra) {
        this.letra = letra;
    }

    public char getLetraBuena() {
        return letraBuena;
    }

    public void setLetraBuena(char letraBuena) {
        this.letraBuena = letraBuena;
    }

}
