import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name = "Notas")
public class Notas {
    @Id
    @GeneratedValue
    private long IdAluno;
    @Column(nullable = false)
    private double Peso;
    @Column(nullable = false)
    private double Nota1;
    @Column(nullable = false)
    private double Nota2;
    @Column(nullable = false)
    private double Nota3;
    @Column(nullable = false)
    private double Nota4;


    public long getIdAluno() {
        return IdAluno;
    }

    public void setIdAluno(long idAluno) {
        IdAluno = idAluno;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public double getNota1() {
        return Nota1;
    }

    public void setNota1(double nota1) {
        Nota1 = nota1;
    }

    public double getNota2() {
        return Nota2;
    }

    public void setNota2(double nota2) {
        Nota2 = nota2;
    }

    public double getNota3() {
        return Nota3;
    }

    public void setNota3(double nota3) {
        Nota3 = nota3;
    }

    public double getNota4() {
        return Nota4;
    }

    public void setNota4(double nota4) {
        Nota4 = nota4;
    }
}
