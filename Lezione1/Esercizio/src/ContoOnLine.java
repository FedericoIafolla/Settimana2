public class ContoOnLine extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxPrelievo) {
        super(titolare, saldo);
        this.maxPrelievo = maxPrelievo;
    }

    @Override
    public void preleva(double importo) throws BancaException {
        if (importo > maxPrelievo) {
            throw new BancaException("Il prelievo non è disponibile. Supera il massimo prelievo consentito.");
        }
        super.preleva(importo);
    }

    @Override
    public void stampaSaldo() {
        super.stampaSaldo();
        System.out.println("Massimo prelievo possibile: " + maxPrelievo);
    }
}
