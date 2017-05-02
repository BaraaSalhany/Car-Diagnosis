import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;
import helper.KnowledgeSessionHelper;
import entity.OAV;
import java.util.Scanner;
import java.io.PrintStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        final KieSession session = KnowledgeSessionHelper.statefulKnowledgeSession("rules-test");
        Scanner scanner = new Scanner(System.in);
        PrintStream stream = new PrintStream(System.out);
        session.setGlobal("input", scanner);
        session.setGlobal("output", stream);

        System.out.println("Try to crank the starter.");
        OAV start = new OAV(OAV.Objects.TheStarter,OAV.TheStarterAttr.TryCrank,true,1.0);
        session.insert(start);

        session.fireAllRules();
    }
}