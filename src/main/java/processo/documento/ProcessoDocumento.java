package processo.documento;

import java.time.LocalDate;
import java.util.List;


public class ProcessoDocumento {
    private Long idProcessoDocumento;
    private String dsProcessoDocumento;
    private LocalDate dtInclusao;
    private LocalDate dtExclusao;
    private String dsMotivoExclusao;
    private Boolean inAtivo;
    private String observacaoProcedimento;
    private Long idJbpmTASK;
    private Boolean inDocumentoSigiloso;
    private String dsNomeUsuarioInclusao;
    private String dsNomePapel;
    private String dsNomeUsuarioAteracao;
    private String dsNomeUsuarioExclusao;
    private String dsNomeLocalizacao;
    private LocalDate dtAlteracao;
    private Long idPkTbProcessoDocumentoPg;
    private Long idSessaoPg;
    private Long nrDocumento;
    private String dsInstancia;
    private LocalDate dtJuntada;
    private Boolean inLido;
    private Long nrOrdem;
    private Long idInstanciaOrigem;
    private String dsNomeUsuarioJuntada;
    private String dsLocalizacaoUsuarioJuntada;
    private Boolean inTipoOrigemJuntada;
    private Boolean inAtividadeEspecifica;
    private String dsNumeroGuia;
    private Boolean inDestacarProcesso;
    private Boolean bloquearVisualizacao;
    private Long idLocalizacaoBloqueio;
    private Boolean inSincronizaSessaoMs;
    private Boolean inInterioTeor;
    private List<DocumentoCertidao> certidaos;

    public ProcessoDocumento(Long idProcessoDocumento, String dsProcessoDocumento, LocalDate dtInclusao,
            LocalDate dtExclusao, String dsMotivoExclusao, Boolean inAtivo, String observacaoProcedimento,
            Long idJbpmTASK, Boolean inDocumentoSigiloso, String dsNomeUsuarioInclusao, String dsNomePapel,
            String dsNomeUsuarioAteracao, String dsNomeUsuarioExclusao, String dsNomeLocalizacao, LocalDate dtAlteracao,
            Long idPkTbProcessoDocumentoPg, Long idSessaoPg, Long nrDocumento, String dsInstancia, LocalDate dtJuntada,
            Boolean inLido, Long nrOrdem, Long idInstanciaOrigem, String dsNomeUsuarioJuntada,
            String dsLocalizacaoUsuarioJuntada, Boolean inTipoOrigemJuntada, Boolean inAtividadeEspecifica,
            String dsNumeroGuia, Boolean inDestacarProcesso, Boolean bloquearVisualizacao, Long idLocalizacaoBloqueio,
            Boolean inSincronizaSessaoMs, Boolean inInterioTeor, List<DocumentoCertidao> certidaos) {
        this.idProcessoDocumento = idProcessoDocumento;
        this.dsProcessoDocumento = dsProcessoDocumento;
        this.dtInclusao = dtInclusao;
        this.dtExclusao = dtExclusao;
        this.dsMotivoExclusao = dsMotivoExclusao;
        this.inAtivo = inAtivo;
        this.observacaoProcedimento = observacaoProcedimento;
        this.idJbpmTASK = idJbpmTASK;
        this.inDocumentoSigiloso = inDocumentoSigiloso;
        this.dsNomeUsuarioInclusao = dsNomeUsuarioInclusao;
        this.dsNomePapel = dsNomePapel;
        this.dsNomeUsuarioAteracao = dsNomeUsuarioAteracao;
        this.dsNomeUsuarioExclusao = dsNomeUsuarioExclusao;
        this.dsNomeLocalizacao = dsNomeLocalizacao;
        this.dtAlteracao = dtAlteracao;
        this.idPkTbProcessoDocumentoPg = idPkTbProcessoDocumentoPg;
        this.idSessaoPg = idSessaoPg;
        this.nrDocumento = nrDocumento;
        this.dsInstancia = dsInstancia;
        this.dtJuntada = dtJuntada;
        this.inLido = inLido;
        this.nrOrdem = nrOrdem;
        this.idInstanciaOrigem = idInstanciaOrigem;
        this.dsNomeUsuarioJuntada = dsNomeUsuarioJuntada;
        this.dsLocalizacaoUsuarioJuntada = dsLocalizacaoUsuarioJuntada;
        this.inTipoOrigemJuntada = inTipoOrigemJuntada;
        this.inAtividadeEspecifica = inAtividadeEspecifica;
        this.dsNumeroGuia = dsNumeroGuia;
        this.inDestacarProcesso = inDestacarProcesso;
        this.bloquearVisualizacao = bloquearVisualizacao;
        this.idLocalizacaoBloqueio = idLocalizacaoBloqueio;
        this.inSincronizaSessaoMs = inSincronizaSessaoMs;
        this.inInterioTeor = inInterioTeor;
        this.certidaos = certidaos;
    }

    public Long getIdProcessoDocumento() {
        return idProcessoDocumento;
    }

    public void setIdProcessoDocumento(Long idProcessoDocumento) {
        this.idProcessoDocumento = idProcessoDocumento;
    }

    public String getDsProcessoDocumento() {
        return dsProcessoDocumento;
    }

    public void setDsProcessoDocumento(String dsProcessoDocumento) {
        this.dsProcessoDocumento = dsProcessoDocumento;
    }

    public LocalDate getDtInclusao() {
        return dtInclusao;
    }

    public void setDtInclusao(LocalDate dtInclusao) {
        this.dtInclusao = dtInclusao;
    }

    public LocalDate getDtExclusao() {
        return dtExclusao;
    }

    public void setDtExclusao(LocalDate dtExclusao) {
        this.dtExclusao = dtExclusao;
    }

    public String getDsMotivoExclusao() {
        return dsMotivoExclusao;
    }

    public void setDsMotivoExclusao(String dsMotivoExclusao) {
        this.dsMotivoExclusao = dsMotivoExclusao;
    }

    public Boolean getInAtivo() {
        return inAtivo;
    }

    public void setInAtivo(Boolean inAtivo) {
        this.inAtivo = inAtivo;
    }

    public String getObservacaoProcedimento() {
        return observacaoProcedimento;
    }

    public void setObservacaoProcedimento(String observacaoProcedimento) {
        this.observacaoProcedimento = observacaoProcedimento;
    }

    public Long getIdJbpmTASK() {
        return idJbpmTASK;
    }

    public void setIdJbpmTASK(Long idJbpmTASK) {
        this.idJbpmTASK = idJbpmTASK;
    }

    public Boolean getInDocumentoSigiloso() {
        return inDocumentoSigiloso;
    }

    public void setInDocumentoSigiloso(Boolean inDocumentoSigiloso) {
        this.inDocumentoSigiloso = inDocumentoSigiloso;
    }

    public String getDsNomeUsuarioInclusao() {
        return dsNomeUsuarioInclusao;
    }

    public void setDsNomeUsuarioInclusao(String dsNomeUsuarioInclusao) {
        this.dsNomeUsuarioInclusao = dsNomeUsuarioInclusao;
    }

    public String getDsNomePapel() {
        return dsNomePapel;
    }

    public void setDsNomePapel(String dsNomePapel) {
        this.dsNomePapel = dsNomePapel;
    }

    public String getDsNomeUsuarioAteracao() {
        return dsNomeUsuarioAteracao;
    }

    public void setDsNomeUsuarioAteracao(String dsNomeUsuarioAteracao) {
        this.dsNomeUsuarioAteracao = dsNomeUsuarioAteracao;
    }

    public String getDsNomeUsuarioExclusao() {
        return dsNomeUsuarioExclusao;
    }

    public void setDsNomeUsuarioExclusao(String dsNomeUsuarioExclusao) {
        this.dsNomeUsuarioExclusao = dsNomeUsuarioExclusao;
    }

    public String getDsNomeLocalizacao() {
        return dsNomeLocalizacao;
    }

    public void setDsNomeLocalizacao(String dsNomeLocalizacao) {
        this.dsNomeLocalizacao = dsNomeLocalizacao;
    }

    public LocalDate getDtAlteracao() {
        return dtAlteracao;
    }

    public void setDtAlteracao(LocalDate dtAlteracao) {
        this.dtAlteracao = dtAlteracao;
    }

    public Long getIdPkTbProcessoDocumentoPg() {
        return idPkTbProcessoDocumentoPg;
    }

    public void setIdPkTbProcessoDocumentoPg(Long idPkTbProcessoDocumentoPg) {
        this.idPkTbProcessoDocumentoPg = idPkTbProcessoDocumentoPg;
    }

    public Long getIdSessaoPg() {
        return idSessaoPg;
    }

    public void setIdSessaoPg(Long idSessaoPg) {
        this.idSessaoPg = idSessaoPg;
    }

    public Long getNrDocumento() {
        return nrDocumento;
    }

    public void setNrDocumento(Long nrDocumento) {
        this.nrDocumento = nrDocumento;
    }

    public String getDsInstancia() {
        return dsInstancia;
    }

    public void setDsInstancia(String dsInstancia) {
        this.dsInstancia = dsInstancia;
    }

    public LocalDate getDtJuntada() {
        return dtJuntada;
    }

    public void setDtJuntada(LocalDate dtJuntada) {
        this.dtJuntada = dtJuntada;
    }

    public Boolean getInLido() {
        return inLido;
    }

    public void setInLido(Boolean inLido) {
        this.inLido = inLido;
    }

    public Long getNrOrdem() {
        return nrOrdem;
    }

    public void setNrOrdem(Long nrOrdem) {
        this.nrOrdem = nrOrdem;
    }

    public Long getIdInstanciaOrigem() {
        return idInstanciaOrigem;
    }

    public void setIdInstanciaOrigem(Long idInstanciaOrigem) {
        this.idInstanciaOrigem = idInstanciaOrigem;
    }

    public String getDsNomeUsuarioJuntada() {
        return dsNomeUsuarioJuntada;
    }

    public void setDsNomeUsuarioJuntada(String dsNomeUsuarioJuntada) {
        this.dsNomeUsuarioJuntada = dsNomeUsuarioJuntada;
    }

    public String getDsLocalizacaoUsuarioJuntada() {
        return dsLocalizacaoUsuarioJuntada;
    }

    public void setDsLocalizacaoUsuarioJuntada(String dsLocalizacaoUsuarioJuntada) {
        this.dsLocalizacaoUsuarioJuntada = dsLocalizacaoUsuarioJuntada;
    }

    public Boolean getInTipoOrigemJuntada() {
        return inTipoOrigemJuntada;
    }

    public void setInTipoOrigemJuntada(Boolean inTipoOrigemJuntada) {
        this.inTipoOrigemJuntada = inTipoOrigemJuntada;
    }

    public Boolean getInAtividadeEspecifica() {
        return inAtividadeEspecifica;
    }

    public void setInAtividadeEspecifica(Boolean inAtividadeEspecifica) {
        this.inAtividadeEspecifica = inAtividadeEspecifica;
    }

    public String getDsNumeroGuia() {
        return dsNumeroGuia;
    }

    public void setDsNumeroGuia(String dsNumeroGuia) {
        this.dsNumeroGuia = dsNumeroGuia;
    }

    public Boolean getInDestacarProcesso() {
        return inDestacarProcesso;
    }

    public void setInDestacarProcesso(Boolean inDestacarProcesso) {
        this.inDestacarProcesso = inDestacarProcesso;
    }

    public Boolean getBloquearVisualizacao() {
        return bloquearVisualizacao;
    }

    public void setBloquearVisualizacao(Boolean bloquearVisualizacao) {
        this.bloquearVisualizacao = bloquearVisualizacao;
    }

    public Long getIdLocalizacaoBloqueio() {
        return idLocalizacaoBloqueio;
    }

    public void setIdLocalizacaoBloqueio(Long idLocalizacaoBloqueio) {
        this.idLocalizacaoBloqueio = idLocalizacaoBloqueio;
    }

    public Boolean getInSincronizaSessaoMs() {
        return inSincronizaSessaoMs;
    }

    public void setInSincronizaSessaoMs(Boolean inSincronizaSessaoMs) {
        this.inSincronizaSessaoMs = inSincronizaSessaoMs;
    }

    public Boolean getInInterioTeor() {
        return inInterioTeor;
    }

    public void setInInterioTeor(Boolean inInterioTeor) {
        this.inInterioTeor = inInterioTeor;
    }

    public List<DocumentoCertidao> getCertidaos() {
        return certidaos;
    }

    public void setCertidaos(List<DocumentoCertidao> certidaos) {
        this.certidaos = certidaos;
    }

    
    
}
