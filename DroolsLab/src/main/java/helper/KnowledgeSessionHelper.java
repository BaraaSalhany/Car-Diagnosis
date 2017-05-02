package helper;

import org.kie.api.KieServices;
import org.kie.api.runtime.*;

public class KnowledgeSessionHelper {
    private KnowledgeSessionHelper(){}
    private final static KieContainer container = KieServices.Factory.get().getKieClasspathContainer();

    public static StatelessKieSession statelessKnowledgeSession(String sessionName){
        return container.newStatelessKieSession(sessionName);
    }

    public static KieSession statefulKnowledgeSession(String sessionName){
        return container.newKieSession(sessionName);
    }
}
