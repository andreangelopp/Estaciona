
package modelo.pack_3;
import modelo.pack_3.ValidacaoString.ValidacaoSTR;

public class Funcionario extends PessoaFisica {
    

    private String matricula;
    private String dataAdmissao;
    private String dataDemissao;
    
    
    public Funcionario(int id, String nomeCompleto, Contato contato, String cpf,
                       String matricula,String dataAdmissao,String dataDemissao) {
        
        super(id, nomeCompleto, contato, cpf);
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
        this.dataDemissao = dataDemissao;
    }
    
    public Funcionario(String nomeCompleto, Contato contato, String cpf,
                       String matricula,String dataAdmissao,String dataDemissao){
            super(nomeCompleto, contato, cpf);
            setDataAdmissao(dataAdmissao);
            setDataDemissao(dataDemissao);
            setMatricula(matricula);
    }

    // ========= GET ==============
    public String getMatricula() {
        return matricula;
    }
    
    public String getDataAdmissao() {
        return dataAdmissao;
    }
     
    public String getDataDemissao() {
        return dataDemissao;
    }
    
    
    // ========= SET ===============
    public final void setMatricula(String matricula) {
        
        if(!matricula.equals("")){
            this.matricula = matricula;
        }else{
            throw new IllegalArgumentException("Matricula Inválida.");
        }    
        
    }

    public final void setDataAdmissao(String dataAdmissao) {
           
       if(ValidacaoSTR.validaData(dataAdmissao)){
           this.dataAdmissao = dataAdmissao;
       }else{
       
           throw new IllegalArgumentException("Data Admissao Invalida.");
       }
        
    }

    public final void setDataDemissao(String dataDemissao) {
        
        if(ValidacaoSTR.validaData(dataDemissao)){
            this.dataDemissao = dataDemissao;
        }else{
            throw new IllegalArgumentException("Data Demissao Invalida.");
        }
            
    }
}