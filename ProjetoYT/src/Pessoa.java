
public abstract class Pessoa {

    // Atributos da classe:
    protected String nome;
    protected String sexo;
    protected int idade;
    protected int experiencia;

    // Métodos:
    /**
     * Método construtor 'Pessoa com experiencia'
     *
     * @param nome
     * @param idade
     * @param sexo 'M' ou 'F'
     * @param experiencia experiencia atual da pessoa
     */
    public Pessoa(String nome, int idade, String sexo, int experiencia) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = experiencia;
    }

    /**
     * Método contrutor 'Pessoa Iniciante'
     *
     * @param nome
     * @param idade
     * @param sexo 'M' ou 'F'
     */
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    // Getters e Setters:
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    /**
     * Adicionar experiencia
     */
    public void ganharExp() {
        setExperiencia(getExperiencia() + 1);
    }

    @Override
    public String toString() {
        return "\nnome: " + nome + "\n sexo: " + sexo + "\n idade: " + idade + "\n experiencia: " + experiencia;
    }

}
