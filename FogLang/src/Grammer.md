# STEPS
- Define the purpose and goals of the programming language. This includes deciding on the target audience, the intended use cases, and the features and capabilities of the language.__[-]

- Design the syntax and semantics of the language. This involves deciding on the rules for writing valid programs in the language,  including the structure of the programs, the data types and variables, and the control structures and functions.__[-]

- Implement the lexical analyzer, also known as the lexer or tokenizer. The lexer is responsible for breaking the source code of a program into individual tokens, which are the basic building blocks of the language.__[-]

- Implement the syntax analyzer, also known as the parser. The parser is responsible for analyzing the sequence of tokens produced by the lexer and building an abstract syntax tree (AST) that represents the structure of the program.__[-]

- Implement the semantic analyzer. The semantic analyzer is responsible for checking the meaning and correctness of the program, and ensuring that it follows the rules and conventions of the language.__[]

- Implement the code generator. The code generator is responsible for translating the AST into machine-readable code, such as assembly language or machine code.__[]

- Implement the runtime support. This includes the libraries, functions, and data structures that the language needs in order to execute programs at runtime.__[]

- Test and debug the language. This involves writing and running test programs to ensure that the language is working as intended and fixing any bugs or issues that are discovered.__[]

# CODE EXAMPLE
```
func start () {
	str input = in("Enter something: ");
	int i = 0;
	double d = 1.2;
	while(i < 10) {
		out("hi" + input);
		aInteger = aInteger - 1;
	}
	/*
		This is a comment.
	*/
	if (d == add(0.6, 0.6) || d == add(0.6, 0.6)) {
		out("hi!");
	} else {
		out("bye");
	}
}
func double add (double n1, double n2) {
	return n1 + n2;
}

```
# TOKENS
`KeyWords`:  		[`func`, `str`, `int`, `double`, `while`, `if`, `else`, `return`, `in`]  
`Compare`:   		[`==`, `!=`, `<=`, `>=`, `<`, `>`, `!`, `&&`, `||`]  
`Character`: 	[`(`, `)`, `{`, `}`, `=`, `,`]  
`Operator`:  		[`+`, `-`, `*`, `/`, `%`]  
	