package propriedades;



public class Terreno{
    protected String nome;
    protected Cor cor;
    protected int qntcasa;
    protected int preço;
    protected boolean hotel;

    /**
     * @return int return the qntcasa
     */
    public int getQntcasa() {
        return qntcasa;
    }

    /**
     * @param qntcasa the qntcasa to set
     */
    public void setQntcasa(int qntcasa) {
        this.qntcasa = qntcasa;
    }

    /**
     * @return int return the preço
     */
    public int getPreço() {
        return preço;
    }

    /**
     * @param preço the preço to set
     */
    public void setPreço(int preço) {
        this.preço = preço;
    }

    /**
     * @return boolean return the hotel
     */
    public boolean isHotel() {
        return hotel;
    }

    /**
     * @param hotel the hotel to set
     */
    public void setHotel(boolean hotel) {
        this.hotel = hotel;
    }


    /**
     * @return Cor return the cor
     */
    public Cor getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(Cor cor) {
        this.cor = cor;
    }


    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

}