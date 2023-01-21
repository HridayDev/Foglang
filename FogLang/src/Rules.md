# LEXER RULES  
- Here are the 4 kinds of keywords to sort as {Keyword: "func"}
+ `KeyWords`:  		[`func`, `str`, `int`, `double`, `while`, `if`, `else`, `return`, `in`]  
+ `Compare`:   		[`==`, `!=`, `<=`, `>=`, `<`, `>`, `!`, `&&`, `||`]  
+ `Character`: 		[`(`, `)`, `{`, `}`, `=`, `,`]  
+ `Operator`:  		[`+`, `-`, `*`, `/`, `%`]  
- If something is between " and ", print it as {String: "String here"}  
- If something is not a keyword or a string, print it as {Data: "ThisIsNotAKeyword"}  
- If something is written between /* and */ and is not a string, ignore it  
- Ignore all white spaces  
- Easily expandable keywords  
Here is an example: 
- input: `func 	== (} > +- "Hi String" /* A Comment */  NotAKeyword`
- output: `[{Keyword: "func"}{Compare: "=="}{Character: "("}{Character: "}"}{Comapre: ">"}{Operator: "+"}{Operator: "-"}{String: "Hi String"}{Data: "NotAKeyword"}]`

# PARSER STEPS
- To start using ANTLR to parse input text and recognize the grammar rules you have defined, you can follow these steps:

- Install ANTLR: To use ANTLR, you will need to install it on your machine. You can download the latest version of ANTLR from the ANTLR website (https://www.antlr.org/) and follow the instructions provided to install it.

- Define the grammar of your language: Use a formal notation, such as Extended Backus-Naur Form (EBNF) or Context-Free Grammar (CFG), to specify the grammar rules of your language. This will typically involve defining a set of terminal symbols (e.g., keywords, operators, and punctuation) and non-terminal symbols (e.g., statements, expressions, and declarations), as well as the rules that define how these symbols can be combined to form valid programs.

- Integrate your lexer: Make sure that your lexer is able to produce a stream of tokens that ANTLR can use as input. You may need to modify your lexer to ensure that it produces the right kind of tokens for ANTLR.

- Generate the parser: Use ANTLR to generate a parser based on the grammar you have defined. ANTLR will typically produce a parser in the form of a program or library that you can use to parse input text and recognize the grammar rules you have defined.

- Test the parser: Use test cases to verify that the parser is able to correctly parse input text and recognize the grammar rules you have defined. You may need to iterate on the definition of your grammar and the implementation of the parser to get it working correctly.

# GRAMMER IN CFG
```
program ::= function*
function ::= "func" identifier "(" parameters? ")" "{" statement* "}"
parameters ::= parameter ("," parameter)*
parameter ::= type identifier
type ::= "int" | "double" | "str"
statement ::= assignment | control_flow | function_call | block
assignment ::= identifier "=" expression
control_flow ::= "if" "(" condition ")" statement ("else" statement)?
                | "while" "(" condition ")" statement
function_call ::= identifier "(" arguments? ")"
arguments ::= expression ("," expression)*
block ::= "{" statement* "}"
expression ::= term (("+" | "-") term)*
term ::= factor (("*" | "/") factor)*
factor ::= number | identifier | function_call | "(" expression ")"
condition ::= expression ("==" | "!=" | "<" | "<=" | ">" | ">=") expression
            | "!" condition
            | condition ("&&" | "||") condition
number ::= digit+
identifier ::= letter (letter | digit)*
digit ::= "0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"
letter ::= "a" | "b" | "c" | "d" | "e" | "f" | "g" | "h" | "i" | "j"
        | "k" | "l" | "m" | "n" | "o" | "p" | "q" | "r" | "s" | "t"
        | "u" | "v" | "w" | "x" | "y" | "z"
        | "A" | "B" | "C" | "D" | "E" | "F" | "G" | "H" | "I" | "J"
        | "K" | "L" | "M" | "N" | "O" | "P" | "Q" | "R" | "S" | "T"
        | "U" | "V" | "W" | "X" | "Y" | "Z" |
```