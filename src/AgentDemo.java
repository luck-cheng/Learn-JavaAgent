import java.lang.instrument.Instrumentation;

/**
 * @author luck(23092676)
 * @since 2019-02-21 10:59
 */
public class AgentDemo {
    public static void premain(String arg, Instrumentation instrumentation) {
        System.err.println("方法 premain 参数：" + arg + ";instrumentation");
        instrumentation.addTransformer((loader, className, classBeingRedefined, protectionDomain, classfileBuffer) -> {
            System.out.println("premain load Class     :" + className);
            return classfileBuffer;
        }, true);
    }
}
