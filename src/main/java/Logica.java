public class Logica {
    public static void main(String[] args) {
        Pantalla panta = new Pantalla();
        panta.setVisible(true);
        panta.setLocationRelativeTo(null);
    }

    private double valor;
    int divisa1;
    int divisa2;
    private double resultado;

    public Logica() {
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDivisa1() {
        return divisa1;
    }

    public void setDivisa1(int divisa1) {
        this.divisa1 = divisa1;
    }

    public int getDivisa2() {
        return divisa2;
    }

    public void setDivisa2(int divisa2) {
        this.divisa2 = divisa2;
    }

    //cambio de divisas
    public double resultadoDivisas() {

        //pesos colomvbianos a dolares y dolares a peso colombiano
        if (divisa1 == 0 && divisa2 == 1) {
            resultado = valor * 0.24;
        } else if (divisa1 == 0 && divisa2 == 0) {
            resultado = valor;
        }
        if (divisa1 == 1 && divisa2 == 0) {
            resultado = valor * 4.157;
        } else if (divisa1 == 1 && divisa2 == 1) {
            resultado = valor;
        }
        
        //peso colombiano a euro y euro a peso colombiano
        if (divisa1 == 0 && divisa2 == 2) {
            resultado = valor * 0.22;
        } else if (divisa1 == 0 && divisa2 == 0) {
            resultado = valor;
        }
         if (divisa1 == 2 && divisa2 == 0) {
            resultado = valor * 4.523;
        } else if (divisa1 == 2 && divisa2 == 2) {
            resultado = valor;
        }
         
         //dolar a euro y euro a dolar
          if (divisa1 == 1 && divisa2 == 2) {
            resultado = valor * 0.92;
        } else if (divisa1 == 1 && divisa2 == 1) {
            resultado = valor;
        }
           if (divisa1 == 2 && divisa2 == 1) {
            resultado = valor * 1.09;
        } else if (divisa1 == 2 && divisa2 == 2) {
            resultado = valor;
        }

        return resultado;
    }
}
