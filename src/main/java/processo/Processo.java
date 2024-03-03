package processo;

import java.time.LocalDate;

public class Processo {
    private Long idProcesso;
    private Long nrProcesso;
    private Long nrProcessoOrigem;
    private String dsComplemento;
    private LocalDate dtInicio;
    private Long idJBPM;
    private LocalDate dtFim;
    private Long nrDuracao;
    private Long nmActorId;
    private String dsNmUsuCadastroPorcesso;
    private Long idPkTbProcessoPg;
    private Long idSessaoPg;
    private Long nrPorcessoTemp;
    private Caixa caixa;
    
    public Processo(Long idProcesso, Long nrProcesso, Long nrProcessoOrigem, String dsComplemento, LocalDate dtInicio,
            Long idJBPM, LocalDate dtFim, Long nrDuracao, Long nmActorId, String dsNmUsuCadastroPorcesso,
            Long idPkTbProcessoPg, Long idSessaoPg, Long nrPorcessoTemp, Caixa caixa) {
        this.idProcesso = idProcesso;
        this.nrProcesso = nrProcesso;
        this.nrProcessoOrigem = nrProcessoOrigem;
        this.dsComplemento = dsComplemento;
        this.dtInicio = dtInicio;
        this.idJBPM = idJBPM;
        this.dtFim = dtFim;
        this.nrDuracao = nrDuracao;
        this.nmActorId = nmActorId;
        this.dsNmUsuCadastroPorcesso = dsNmUsuCadastroPorcesso;
        this.idPkTbProcessoPg = idPkTbProcessoPg;
        this.idSessaoPg = idSessaoPg;
        this.nrPorcessoTemp = nrPorcessoTemp;
        this.caixa = caixa;
    }

    public Long getIdProcesso() {
        return idProcesso;
    }

    public void setIdProcesso(Long idProcesso) {
        this.idProcesso = idProcesso;
    }

    public Long getNrProcesso() {
        return nrProcesso;
    }

    public void setNrProcesso(Long nrProcesso) {
        this.nrProcesso = nrProcesso;
    }

    public Long getNrProcessoOrigem() {
        return nrProcessoOrigem;
    }

    public void setNrProcessoOrigem(Long nrProcessoOrigem) {
        this.nrProcessoOrigem = nrProcessoOrigem;
    }

    public String getDsComplemento() {
        return dsComplemento;
    }

    public void setDsComplemento(String dsComplemento) {
        this.dsComplemento = dsComplemento;
    }

    public LocalDate getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(LocalDate dtInicio) {
        this.dtInicio = dtInicio;
    }

    public Long getIdJBPM() {
        return idJBPM;
    }

    public void setIdJBPM(Long idJBPM) {
        this.idJBPM = idJBPM;
    }

    public LocalDate getDtFim() {
        return dtFim;
    }

    public void setDtFim(LocalDate dtFim) {
        this.dtFim = dtFim;
    }

    public Long getNrDuracao() {
        return nrDuracao;
    }

    public void setNrDuracao(Long nrDuracao) {
        this.nrDuracao = nrDuracao;
    }

    public Long getNmActorId() {
        return nmActorId;
    }

    public void setNmActorId(Long nmActorId) {
        this.nmActorId = nmActorId;
    }

    public String getDsNmUsuCadastroPorcesso() {
        return dsNmUsuCadastroPorcesso;
    }

    public void setDsNmUsuCadastroPorcesso(String dsNmUsuCadastroPorcesso) {
        this.dsNmUsuCadastroPorcesso = dsNmUsuCadastroPorcesso;
    }

    public Long getIdPkTbProcessoPg() {
        return idPkTbProcessoPg;
    }

    public void setIdPkTbProcessoPg(Long idPkTbProcessoPg) {
        this.idPkTbProcessoPg = idPkTbProcessoPg;
    }

    public Long getIdSessaoPg() {
        return idSessaoPg;
    }

    public void setIdSessaoPg(Long idSessaoPg) {
        this.idSessaoPg = idSessaoPg;
    }

    public Long getNrPorcessoTemp() {
        return nrPorcessoTemp;
    }

    public void setNrPorcessoTemp(Long nrPorcessoTemp) {
        this.nrPorcessoTemp = nrPorcessoTemp;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }
    
    
}
