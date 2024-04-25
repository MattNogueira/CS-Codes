public class Pessoa {
  private String nome;
  private String endereco;
  private String telefone;

  public Pessoa(String nome, String endereco, String telefone) {
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
  }

  public Pessoa(String nome, String endereco) {
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = "Não possui.";
  }

  public Pessoa() {
    this.nome = "Nenhum nome informado";
    this.endereco = "Nenhum endereço informado";
    this.telefone = "Nenhum telefone informado";
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getTelefone() {
    return telefone;
  }
}
