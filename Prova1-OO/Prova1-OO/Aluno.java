public class Aluno
{
    private String nome;
    private int votos;
    
    public Aluno(String nome)
    {
        this.nome = nome;
        votos = 0;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public void getVotos(int votos)
    {
        this.votos = votos;
    }
    
    public int getVotos()
    {
        return votos;
    }
    
    public void fuiVotado()
    {
        votos++;
    }
}
