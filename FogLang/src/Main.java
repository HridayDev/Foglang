import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
	public static void main(String[] args) throws IOException {
		ANTLRInputStream input = new  ANTLRFileStream("F:\\code\\java\\EE\\FogLang\\src\\TestSource.txt");
		programLexer lexer = new programLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		programParser parser = new programParser(tokens);
		ParseTree tree = parser.program(); // start rule
		ParseTreeWalker walker = new ParseTreeWalker();
		programBaseListener listener = new MyListener();
		walker.walk(listener, tree);

	}
}
class MyListener extends programBaseListener {
    @Override
    public void enterFunction(programParser.FunctionContext ctx) {
        // Perform actions when entering a function node
    }

    @Override
    public void exitFunction(programParser.FunctionContext ctx) {
        // Perform actions when exiting a function node
    }
}
