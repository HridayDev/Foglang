// Generated from program.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class programLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__87=1, T__86=2, T__85=3, T__84=4, T__83=5, T__82=6, T__81=7, T__80=8, 
		T__79=9, T__78=10, T__77=11, T__76=12, T__75=13, T__74=14, T__73=15, T__72=16, 
		T__71=17, T__70=18, T__69=19, T__68=20, T__67=21, T__66=22, T__65=23, 
		T__64=24, T__63=25, T__62=26, T__61=27, T__60=28, T__59=29, T__58=30, 
		T__57=31, T__56=32, T__55=33, T__54=34, T__53=35, T__52=36, T__51=37, 
		T__50=38, T__49=39, T__48=40, T__47=41, T__46=42, T__45=43, T__44=44, 
		T__43=45, T__42=46, T__41=47, T__40=48, T__39=49, T__38=50, T__37=51, 
		T__36=52, T__35=53, T__34=54, T__33=55, T__32=56, T__31=57, T__30=58, 
		T__29=59, T__28=60, T__27=61, T__26=62, T__25=63, T__24=64, T__23=65, 
		T__22=66, T__21=67, T__20=68, T__19=69, T__18=70, T__17=71, T__16=72, 
		T__15=73, T__14=74, T__13=75, T__12=76, T__11=77, T__10=78, T__9=79, T__8=80, 
		T__7=81, T__6=82, T__5=83, T__4=84, T__3=85, T__2=86, T__1=87, T__0=88;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "':'", "';'", 
		"'<'", "'='", "'>'", "'?'", "'@'", "'A'", "'B'", "'C'", "'D'", "'E'", 
		"'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", 
		"'P'", "'Q'", "'R'", "'S'", "'T'", "'U'", "'V'", "'W'", "'X'"
	};
	public static final String[] ruleNames = {
		"T__87", "T__86", "T__85", "T__84", "T__83", "T__82", "T__81", "T__80", 
		"T__79", "T__78", "T__77", "T__76", "T__75", "T__74", "T__73", "T__72", 
		"T__71", "T__70", "T__69", "T__68", "T__67", "T__66", "T__65", "T__64", 
		"T__63", "T__62", "T__61", "T__60", "T__59", "T__58", "T__57", "T__56", 
		"T__55", "T__54", "T__53", "T__52", "T__51", "T__50", "T__49", "T__48", 
		"T__47", "T__46", "T__45", "T__44", "T__43", "T__42", "T__41", "T__40", 
		"T__39", "T__38", "T__37", "T__36", "T__35", "T__34", "T__33", "T__32", 
		"T__31", "T__30", "T__29", "T__28", "T__27", "T__26", "T__25", "T__24", 
		"T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", 
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0"
	};


	public programLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "program.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2Z\u017d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'"+
		"\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3"+
		"\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\3"+
		"9\39\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@\3@\3"+
		"A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3"+
		"L\3M\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3S\3S\3S\3T\3T\3U\3U\3"+
		"V\3V\3W\3W\3X\3X\3Y\3Y\2\2Z\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009b"+
		"O\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00af"+
		"Y\u00b1Z\3\2\2\u017c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2"+
		"\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w"+
		"\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d"+
		"\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2"+
		"\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af"+
		"\3\2\2\2\2\u00b1\3\2\2\2\3\u00b3\3\2\2\2\5\u00b5\3\2\2\2\7\u00b7\3\2\2"+
		"\2\t\u00bc\3\2\2\2\13\u00be\3\2\2\2\r\u00c0\3\2\2\2\17\u00c2\3\2\2\2\21"+
		"\u00c4\3\2\2\2\23\u00c6\3\2\2\2\25\u00c9\3\2\2\2\27\u00cb\3\2\2\2\31\u00cd"+
		"\3\2\2\2\33\u00d3\3\2\2\2\35\u00d5\3\2\2\2\37\u00d8\3\2\2\2!\u00da\3\2"+
		"\2\2#\u00dc\3\2\2\2%\u00de\3\2\2\2\'\u00e0\3\2\2\2)\u00e4\3\2\2\2+\u00e6"+
		"\3\2\2\2-\u00ea\3\2\2\2/\u00ec\3\2\2\2\61\u00ee\3\2\2\2\63\u00f0\3\2\2"+
		"\2\65\u00f2\3\2\2\2\67\u00f4\3\2\2\29\u00f6\3\2\2\2;\u00f8\3\2\2\2=\u00fa"+
		"\3\2\2\2?\u00fc\3\2\2\2A\u00fe\3\2\2\2C\u0100\3\2\2\2E\u0102\3\2\2\2G"+
		"\u0104\3\2\2\2I\u0106\3\2\2\2K\u0108\3\2\2\2M\u010b\3\2\2\2O\u010d\3\2"+
		"\2\2Q\u010f\3\2\2\2S\u0111\3\2\2\2U\u0113\3\2\2\2W\u0115\3\2\2\2Y\u0117"+
		"\3\2\2\2[\u0119\3\2\2\2]\u011b\3\2\2\2_\u011d\3\2\2\2a\u011f\3\2\2\2c"+
		"\u0121\3\2\2\2e\u0123\3\2\2\2g\u0125\3\2\2\2i\u0127\3\2\2\2k\u0129\3\2"+
		"\2\2m\u012b\3\2\2\2o\u012d\3\2\2\2q\u012f\3\2\2\2s\u0132\3\2\2\2u\u0134"+
		"\3\2\2\2w\u0137\3\2\2\2y\u013a\3\2\2\2{\u013c\3\2\2\2}\u013e\3\2\2\2\177"+
		"\u0145\3\2\2\2\u0081\u0147\3\2\2\2\u0083\u0149\3\2\2\2\u0085\u014b\3\2"+
		"\2\2\u0087\u014d\3\2\2\2\u0089\u014f\3\2\2\2\u008b\u0151\3\2\2\2\u008d"+
		"\u0153\3\2\2\2\u008f\u0155\3\2\2\2\u0091\u0157\3\2\2\2\u0093\u0159\3\2"+
		"\2\2\u0095\u015b\3\2\2\2\u0097\u015d\3\2\2\2\u0099\u015f\3\2\2\2\u009b"+
		"\u0162\3\2\2\2\u009d\u0164\3\2\2\2\u009f\u0166\3\2\2\2\u00a1\u0168\3\2"+
		"\2\2\u00a3\u016a\3\2\2\2\u00a5\u016c\3\2\2\2\u00a7\u0171\3\2\2\2\u00a9"+
		"\u0173\3\2\2\2\u00ab\u0175\3\2\2\2\u00ad\u0177\3\2\2\2\u00af\u0179\3\2"+
		"\2\2\u00b1\u017b\3\2\2\2\u00b3\u00b4\7q\2\2\u00b4\4\3\2\2\2\u00b5\u00b6"+
		"\7\63\2\2\u00b6\6\3\2\2\2\u00b7\u00b8\7h\2\2\u00b8\u00b9\7w\2\2\u00b9"+
		"\u00ba\7p\2\2\u00ba\u00bb\7e\2\2\u00bb\b\3\2\2\2\u00bc\u00bd\7T\2\2\u00bd"+
		"\n\3\2\2\2\u00be\u00bf\7u\2\2\u00bf\f\3\2\2\2\u00c0\u00c1\7\67\2\2\u00c1"+
		"\16\3\2\2\2\u00c2\u00c3\7X\2\2\u00c3\20\3\2\2\2\u00c4\u00c5\7y\2\2\u00c5"+
		"\22\3\2\2\2\u00c6\u00c7\7#\2\2\u00c7\u00c8\7?\2\2\u00c8\24\3\2\2\2\u00c9"+
		"\u00ca\7;\2\2\u00ca\26\3\2\2\2\u00cb\u00cc\7\\\2\2\u00cc\30\3\2\2\2\u00cd"+
		"\u00ce\7y\2\2\u00ce\u00cf\7j\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7n\2\2"+
		"\u00d1\u00d2\7g\2\2\u00d2\32\3\2\2\2\u00d3\u00d4\7}\2\2\u00d4\34\3\2\2"+
		"\2\u00d5\u00d6\7(\2\2\u00d6\u00d7\7(\2\2\u00d7\36\3\2\2\2\u00d8\u00d9"+
		"\7?\2\2\u00d9 \3\2\2\2\u00da\u00db\7C\2\2\u00db\"\3\2\2\2\u00dc\u00dd"+
		"\7d\2\2\u00dd$\3\2\2\2\u00de\u00df\7G\2\2\u00df&\3\2\2\2\u00e0\u00e1\7"+
		"k\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7v\2\2\u00e3(\3\2\2\2\u00e4\u00e5"+
		"\7h\2\2\u00e5*\3\2\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9"+
		"\7t\2\2\u00e9,\3\2\2\2\u00ea\u00eb\7*\2\2\u00eb.\3\2\2\2\u00ec\u00ed\7"+
		"K\2\2\u00ed\60\3\2\2\2\u00ee\u00ef\7l\2\2\u00ef\62\3\2\2\2\u00f0\u00f1"+
		"\7.\2\2\u00f1\64\3\2\2\2\u00f2\u00f3\7O\2\2\u00f3\66\3\2\2\2\u00f4\u00f5"+
		"\7p\2\2\u00f58\3\2\2\2\u00f6\u00f7\7\62\2\2\u00f7:\3\2\2\2\u00f8\u00f9"+
		"\7S\2\2\u00f9<\3\2\2\2\u00fa\u00fb\7t\2\2\u00fb>\3\2\2\2\u00fc\u00fd\7"+
		"\66\2\2\u00fd@\3\2\2\2\u00fe\u00ff\7W\2\2\u00ffB\3\2\2\2\u0100\u0101\7"+
		"x\2\2\u0101D\3\2\2\2\u0102\u0103\7:\2\2\u0103F\3\2\2\2\u0104\u0105\7["+
		"\2\2\u0105H\3\2\2\2\u0106\u0107\7|\2\2\u0107J\3\2\2\2\u0108\u0109\7@\2"+
		"\2\u0109\u010a\7?\2\2\u010aL\3\2\2\2\u010b\u010c\7>\2\2\u010cN\3\2\2\2"+
		"\u010d\u010e\7c\2\2\u010eP\3\2\2\2\u010f\u0110\7F\2\2\u0110R\3\2\2\2\u0111"+
		"\u0112\7g\2\2\u0112T\3\2\2\2\u0113\u0114\7J\2\2\u0114V\3\2\2\2\u0115\u0116"+
		"\7k\2\2\u0116X\3\2\2\2\u0117\u0118\7-\2\2\u0118Z\3\2\2\2\u0119\u011a\7"+
		"N\2\2\u011a\\\3\2\2\2\u011b\u011c\7o\2\2\u011c^\3\2\2\2\u011d\u011e\7"+
		"\61\2\2\u011e`\3\2\2\2\u011f\u0120\7R\2\2\u0120b\3\2\2\2\u0121\u0122\7"+
		"s\2\2\u0122d\3\2\2\2\u0123\u0124\7\65\2\2\u0124f\3\2\2\2\u0125\u0126\7"+
		"V\2\2\u0126h\3\2\2\2\u0127\u0128\7w\2\2\u0128j\3\2\2\2\u0129\u012a\79"+
		"\2\2\u012al\3\2\2\2\u012b\u012c\7Z\2\2\u012cn\3\2\2\2\u012d\u012e\7{\2"+
		"\2\u012ep\3\2\2\2\u012f\u0130\7~\2\2\u0130\u0131\7~\2\2\u0131r\3\2\2\2"+
		"\u0132\u0133\7\177\2\2\u0133t\3\2\2\2\u0134\u0135\7k\2\2\u0135\u0136\7"+
		"h\2\2\u0136v\3\2\2\2\u0137\u0138\7>\2\2\u0138\u0139\7?\2\2\u0139x\3\2"+
		"\2\2\u013a\u013b\7E\2\2\u013bz\3\2\2\2\u013c\u013d\7f\2\2\u013d|\3\2\2"+
		"\2\u013e\u013f\7f\2\2\u013f\u0140\7q\2\2\u0140\u0141\7w\2\2\u0141\u0142"+
		"\7d\2\2\u0142\u0143\7n\2\2\u0143\u0144\7g\2\2\u0144~\3\2\2\2\u0145\u0146"+
		"\7I\2\2\u0146\u0080\3\2\2\2\u0147\u0148\7j\2\2\u0148\u0082\3\2\2\2\u0149"+
		"\u014a\7,\2\2\u014a\u0084\3\2\2\2\u014b\u014c\7M\2\2\u014c\u0086\3\2\2"+
		"\2\u014d\u014e\7n\2\2\u014e\u0088\3\2\2\2\u014f\u0150\7Q\2\2\u0150\u008a"+
		"\3\2\2\2\u0151\u0152\7r\2\2\u0152\u008c\3\2\2\2\u0153\u0154\7\64\2\2\u0154"+
		"\u008e\3\2\2\2\u0155\u0156\7U\2\2\u0156\u0090\3\2\2\2\u0157\u0158\7v\2"+
		"\2\u0158\u0092\3\2\2\2\u0159\u015a\78\2\2\u015a\u0094\3\2\2\2\u015b\u015c"+
		"\7Y\2\2\u015c\u0096\3\2\2\2\u015d\u015e\7z\2\2\u015e\u0098\3\2\2\2\u015f"+
		"\u0160\7?\2\2\u0160\u0161\7?\2\2\u0161\u009a\3\2\2\2\u0162\u0163\7@\2"+
		"\2\u0163\u009c\3\2\2\2\u0164\u0165\7#\2\2\u0165\u009e\3\2\2\2\u0166\u0167"+
		"\7D\2\2\u0167\u00a0\3\2\2\2\u0168\u0169\7e\2\2\u0169\u00a2\3\2\2\2\u016a"+
		"\u016b\7H\2\2\u016b\u00a4\3\2\2\2\u016c\u016d\7g\2\2\u016d\u016e\7n\2"+
		"\2\u016e\u016f\7u\2\2\u016f\u0170\7g\2\2\u0170\u00a6\3\2\2\2\u0171\u0172"+
		"\7i\2\2\u0172\u00a8\3\2\2\2\u0173\u0174\7+\2\2\u0174\u00aa\3\2\2\2\u0175"+
		"\u0176\7L\2\2\u0176\u00ac\3\2\2\2\u0177\u0178\7m\2\2\u0178\u00ae\3\2\2"+
		"\2\u0179\u017a\7/\2\2\u017a\u00b0\3\2\2\2\u017b\u017c\7P\2\2\u017c\u00b2"+
		"\3\2\2\2\3\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}