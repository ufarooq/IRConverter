/** @author: Hasitha Rajapakse */
package magpiebridge.converter.minimaltestsuite.java6;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import magpiebridge.converter.categories.Java8Test;
import magpiebridge.converter.minimaltestsuite.MinimalTestSuiteBase;
import org.junit.experimental.categories.Category;

@Category(Java8Test.class)
public class TryCatchFinallyTest extends MinimalTestSuiteBase {
  @Override
  public String getMethodSignature() {
    return identifierFactory.getMethodSignature(
        "tryCatchFinally", getDeclaredClassSignature(), "void", Collections.emptyList());
  }

  @Override
  public List<String> expectedBodyStmts() {
    return Stream.of(
            "r0 := @this: TryCatchFinally",
            "$r1 = \"\"",
            "$r1 = \"this is try block\"",
            "$i0 = 0",
            "$i1 = $i0",
            "$i2 = $i0 + 1",
            "$i0 = $i2",
            "$r2 = <java.lang.System: java.io.PrintStream out>",
            "virtualinvoke $r2.<java.io.PrintStream: void println(int)>($i0)",
            "goto label1",
            "$r3 := @caughtexception",
            "$r4 = $r3",
            "$r1 = \"this is catch block\"",
            "label1:",
            "$r1 = \"this is finally block\"",
            "return")
        .collect(Collectors.toList());
  }
}
