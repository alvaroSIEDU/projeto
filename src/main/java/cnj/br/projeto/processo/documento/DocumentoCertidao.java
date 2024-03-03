package cnj.br.projeto.processo.documento;

public class DocumentoCertidao {
    private Long idDocumentoCertidao;
    private ProcessoDocumento documento;
    
    public DocumentoCertidao(Long idDocumentoCertidao, ProcessoDocumento documento) {
        this.idDocumentoCertidao = idDocumentoCertidao;
        this.documento = documento;
    }

    public Long getIdDocumentoCertidao() {
        return idDocumentoCertidao;
    }

    public void setIdDocumentoCertidao(Long idDocumentoCertidao) {
        this.idDocumentoCertidao = idDocumentoCertidao;
    }

    public ProcessoDocumento getDocumento() {
        return documento;
    }

    public void setDocumento(ProcessoDocumento documento) {
        this.documento = documento;
    }

    
}
