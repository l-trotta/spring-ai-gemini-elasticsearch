package demo.elastic.rag;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.stereotype.Service;

@Service
public class RagService {

    // Both beans autowired from default configuration
    private VectorStore vectorStore;
    private ChatClient chatClient;

    public RagService(VectorStore vectorStore, ChatClient.Builder clientBuilder) {
        this.vectorStore = vectorStore;
        this.chatClient = clientBuilder
            .build();
    }

    public void ingestPDF(String path) {
    }


    public String queryLLM(String question) {

        // Setting the prompt with the context
        String prompt = """
                            You're assisting with providing the rules of the tabletop game Runewars.
                            Use the information from the DOCUMENTS section to provide accurate answers to the
                            question in the QUESTION section. 
                            If unsure, simply state that you don't know.
                            
                            DOCUMENTS:
                            """
                        + """
                            QUESTION:
                            """ + question;

        return null;
    }

    public String queryNoData(String question) {
        return null;
    }
}
