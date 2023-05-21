package tarea2;

public class Tarea2 {
    public static void main(String[] args) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {
        Expendedor exp = new Expendedor(2, 1000);
        Moneda m;
        Comprador c;
        try {
            m = null;
            c = new Comprador(m, 657, exp);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        }
        try {
            m = new Moneda500();
            c = new Comprador(m, 657, exp);
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage() + " , " + exp.getVuelto().getValor());
        }
        try {
            m = new Moneda1500();
            c = new Comprador(m, 5, exp);
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage() + " , " + exp.getVuelto().getValor());
        }
        try {
            m = new Moneda1000();
            c = new Comprador(m, 1, exp);
            System.out.println(c.queIngeriste() + " , tu vuelto es: " + c.cuantoVuelto());
            m = new Moneda1500();
            c = new Comprador(m, 1, exp);
            System.out.println(c.queIngeriste() + " , tu vuelto es: " + c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m, 1, exp);
            System.out.println(c.queIngeriste() + " , tu vuelto es:" + c.cuantoVuelto());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage() + " , " + exp.getVuelto().getValor());
        }
        try {
            m = new Moneda1000();
            c = new Comprador(m, 2, exp);
            System.out.println(c.queIngeriste() + " , tu vuelto es: " + c.cuantoVuelto());
            m = new Moneda1500();
            c = new Comprador(m, 2, exp);
            System.out.println(c.queIngeriste() + " , tu vuelto es: " + c.cuantoVuelto());
            m = new Moneda1500();
            c = new Comprador(m, 2, exp);
            System.out.println(c.queIngeriste() + " , tu vuelto es:" + c.cuantoVuelto());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage() + " , " + exp.getVuelto().getValor());
        }
        try {
            m = new Moneda1000();
            c = new Comprador(m, 3, exp);
            System.out.println(c.queIngeriste() + " , tu vuelto es: " + c.cuantoVuelto());
            m = new Moneda1500();
            c = new Comprador(m, 3, exp);
            System.out.println(c.queIngeriste() + " , tu vuelto es: " + c.cuantoVuelto());
            m = new Moneda1500();
            c = new Comprador(m, 3, exp);
            System.out.println(c.queIngeriste() + " , tu vuelto es:" + c.cuantoVuelto());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage() + " , " + exp.getVuelto().getValor());
        }
        try {
            m = new Moneda1000();
            c = new Comprador(m, 4, exp);
            System.out.println(c.queIngeriste() + " , tu vuelto es: " + c.cuantoVuelto());
            m = new Moneda1500();
            c = new Comprador(m, 4, exp);
            System.out.println(c.queIngeriste() + " , tu vuelto es: " + c.cuantoVuelto());
            m = new Moneda1500();
            c = new Comprador(m, 4, exp);
            System.out.println(c.queIngeriste() + " , tu vuelto es:" + c.cuantoVuelto());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage() + " , " + exp.getVuelto().getValor());
        }
    }
}