package cnj.br.projeto.processo;

import java.time.LocalDate;

public class Estatistica {
    private Long idEstatistica;
    private Long nmTask;
    private Long nmNode;
    private LocalDate dtInicio;
    private LocalDate dtFim;
    private Integer nrDuracao;
    private String dsFluxo;
    
    public Estatistica(Long idEstatistica, Long nmTask, Long nmNode, LocalDate dtInicio, LocalDate dtFim,
            Integer nrDuracao, String dsFluxo) {
        this.idEstatistica = idEstatistica;
        this.nmTask = nmTask;
        this.nmNode = nmNode;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.nrDuracao = nrDuracao;
        this.dsFluxo = dsFluxo;
    }

    public Long getIdEstatistica() {
        return idEstatistica;
    }

    public void setIdEstatistica(Long idEstatistica) {
        this.idEstatistica = idEstatistica;
    }

    public Long getNmTask() {
        return nmTask;
    }

    public void setNmTask(Long nmTask) {
        this.nmTask = nmTask;
    }

    public Long getNmNode() {
        return nmNode;
    }

    public void setNmNode(Long nmNode) {
        this.nmNode = nmNode;
    }

    public LocalDate getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(LocalDate dtInicio) {
        this.dtInicio = dtInicio;
    }

    public LocalDate getDtFim() {
        return dtFim;
    }

    public void setDtFim(LocalDate dtFim) {
        this.dtFim = dtFim;
    }

    public Integer getNrDuracao() {
        return nrDuracao;
    }

    public void setNrDuracao(Integer nrDuracao) {
        this.nrDuracao = nrDuracao;
    }

    public String getDsFluxo() {
        return dsFluxo;
    }

    public void setDsFluxo(String dsFluxo) {
        this.dsFluxo = dsFluxo;
    }

    
}
