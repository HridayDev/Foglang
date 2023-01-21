grammar program;

program : function*;
function : 'func' identifier '(' parameters? ')' '{' statement* '}';
parameters : parameter (',' parameter)*;
parameter : type identifier;
type : 'int' | 'double' | 'str';
statement : assignment | control_flow | function_call | block;
assignment : identifier '=' expression;
control_flow : 'if' '(' condition ')' statement ('else' statement)?
                | 'while' '(' condition ')' statement;
function_call : identifier '(' arguments? ')';
arguments: expression (',' expression)*;

block : '{' statement* '}';
expression : term (('+' | '-') term)*;
term : factor (('*' | '/') factor)*;
factor : number | identifier | function_call | '(' expression ')';
condition : expression ('==' | '!=' | '<' | '<=' | '>' | '>=') expression
            | '!' condition
            | condition ('&&' | '||') condition;
number : digit+;
identifier : letter (letter | digit)*;
digit : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
letter : 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i' | 'j'
        | 'k' | 'l' | 'm' | 'n' | 'o' | 'p' | 'q' | 'r' | 's' | 't'
        | 'u' | 'v' | 'w' | 'x' | 'y' | 'z'
        | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'H' | 'I' | 'J'
        | 'K' | 'L' | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T'
        | 'U' | 'V' | 'W' | 'X' | 'Y' | 'Z';