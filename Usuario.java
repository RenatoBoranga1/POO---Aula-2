import java.time.LocalDate;

public class Usuario {

    private static int ultimoId = 0; // Variável estática para o ID sequencial

    private int id;
    private String nome;
    private String email;
    private String senha;
    private LocalDate dataNascimento;

    public Usuario() {
        this.id = gerarIdSequencial(); // Define o ID ao criar o usuário
    }

    private static synchronized int gerarIdSequencial() {
        return ++ultimoId; // Incrementa e retorna o próximo ID disponível
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() < 2) {
            throw new RuntimeException("Nome muito pequeno");
        }
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + this.nome + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
