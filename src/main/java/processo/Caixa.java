package processo;

import java.util.List;



public class Caixa {
    private Long idCaixa;
    private String nmCaixa;
    private String dsCaixa;
    private Boolean inSistema;
    private List<Processo> processos;

    public Caixa(Long idCaixa, String nmCaixa, String dsCaixa, Boolean inSistema, List<Processo> processos) {
        this.idCaixa = idCaixa;
        this.nmCaixa = nmCaixa;
        this.dsCaixa = dsCaixa;
        this.inSistema = inSistema;
        this.processos = processos;
    }

    public Long getIdCaixa() {
        return idCaixa;
    }

    public void setIdCaixa(Long idCaixa) {
        this.idCaixa = idCaixa;
    }

    public String getNmCaixa() {
        return nmCaixa;
    }

    public void setNmCaixa(String nmCaixa) {
        this.nmCaixa = nmCaixa;
    }

    public String getDsCaixa() {
        return dsCaixa;
    }

    public void setDsCaixa(String dsCaixa) {
        this.dsCaixa = dsCaixa;
    }

    public Boolean getInSistema() {
        return inSistema;
    }

    public void setInSistema(Boolean inSistema) {
        this.inSistema = inSistema;
    }

    public List<Processo> getProcessos() {
        return processos;
    }

    public void setProcessos(List<Processo> processos) {
        this.processos = processos;
    }

    
    
}
