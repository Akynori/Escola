import lombok.Data;


import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Matricula")
public class Matricula {
    @Id
    @GeneratedValue
    private long IdAluno;
    @Column(nullable = false)
    private String NomeAluno;
    @Column(nullable = false)
    private int IdadeAluno;
    @Column(nullable = false)
    private Date data_de_nascimento;

    public long getIdAluno() {
        return IdAluno;
    }

    public void setIdAluno(long idAluno) {
        IdAluno = idAluno;
    }

    public String getNomes() {
        return NomeAluno;
    }

    public void setNomes(String nomes) {
        NomeAluno = nomes;
    }

    public int getIdade() {
        return IdadeAluno;
    }

    public void setIdade(int IdadeAluno) {
        this.IdadeAluno = IdadeAluno;
    }

    public Date getData_de_nascimento() {
        return data_de_nascimento;
    }

    public void setData_de_nascimento(Date data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }
}
