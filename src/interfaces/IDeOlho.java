package interfaces;

public interface IDeOlho {
    public void adicionaObservador(IJogador observador);
	public void removeObservador(IJogador observador);
	public void notifique();
}