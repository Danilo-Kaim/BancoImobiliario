package propriedades;


public class Companhia {
    private String nome;
    private int preço;
    private int multiplicador;
        

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
     * @return int return the multiplicador
     */
    public int getMultiplicador() {
        return multiplicador;
    }

    /**
     * @param multiplicador the multiplicador to set
     */
    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
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