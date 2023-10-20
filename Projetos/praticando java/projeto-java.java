// Interface Document
interface Document {
    void criarConteudo();
}

// Implementação de um documento PDF
class PDFDocument implements Document {
    @Override
    public void criarConteudo() {
        System.out.println("Conteúdo do PDF criado.");
    }
}

// Implementação de um documento de planilha
class PlanilhaDocument implements Document {
    @Override
    public void criarConteudo() {
        System.out.println("Conteúdo da planilha criado.");
    }
}

// Interface para a fábrica de documentos
interface DocumentFactory {
    Document criarDocumento();
}

// Implementação da fábrica de documentos PDF
class PDFDocumentFactory implements DocumentFactory {
    @Override
    public Document criarDocumento() {
        return new PDFDocument();
    }
}

// Implementação da fábrica de documentos de planilha
class PlanilhaDocumentFactory implements DocumentFactory {
    @Override
    public Document criarDocumento() {
        return new PlanilhaDocument();
    }
}

public class FactoryMethodExample {
    public static void main(String[] args) {
        // Crie uma fábrica de PDF
        DocumentFactory pdfFactory = new PDFDocumentFactory();
        Document pdfDocument = pdfFactory.criarDocumento();
        pdfDocument.criarConteudo();

        // Crie uma fábrica de planilha
        DocumentFactory planilhaFactory = new PlanilhaDocumentFactory();
        Document planilhaDocument = planilhaFactory.criarDocumento();
        planilhaDocument.criarConteudo();
    }
}

