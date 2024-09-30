public class ContoCorrente {
    protected String titolare;
    protected double saldo;
    protected int nMovimenti;
    protected final int maxMovimenti = 50;
    protected final double maxPrelievo = 500;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public void preleva(double importo) throws BancaException {
        if (importo > saldo) {
            throw new BancaException("Il conto è in rosso");
        }
        saldo -= importo;
        nMovimenti++;
    }

    public void stampaSaldo() {
        System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Movimenti: " + nMovimenti);
    }
}
