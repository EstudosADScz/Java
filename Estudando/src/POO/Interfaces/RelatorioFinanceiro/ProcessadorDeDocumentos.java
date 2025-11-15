package POO.Interfaces.RelatorioFinanceiro;
import java.util.ArrayList;
import java.util.List;

public class ProcessadorDeDocumentos {

    public static void main(String[] args) {
        RelatorioFinanceiro relatorioQ3 = new RelatorioFinanceiro("Balanço do Q3");
        Contrato contratoServico = new Contrato("Termos de Serviço SaaS");
        RelatorioFinanceiro relatorioAnual = new RelatorioFinanceiro("Balanço Anual 2024");

        List<Imprimivel> documentos = new ArrayList<>();
        documentos.add(relatorioQ3);
        documentos.add(contratoServico);
        documentos.add(relatorioAnual);

        System.out.println("### Solução 1: Processando com 'instanceof' ###");
        
        String emailDestino = "diretoria@empresa.com";

        for (Imprimivel doc : documentos) {
            System.out.println("---");
            System.out.print("[Impressão]: ");
            doc.imprimir();

            if (doc instanceof EnviavelPorEmail emailDoc) {
                System.out.print("[E-mail]: ");
                emailDoc.enviar(emailDestino);
            } else {
                String tipo = doc.getClass().getSimpleName();
                System.out.println("[E-mail]: (Documento do tipo '" + tipo + "' não pode ser enviado)");
            }
        }
    }
    
}
