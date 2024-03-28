No repositório estudado, há diversos code smells analisados, e alguns tomariam tempo significativo para refatoração. Portanto, os seguintes code smells, de rápida fatoração, foram priorizados.

CODE SMELL 1: LONG PARAMETER LIST
Listas longas de parâmetros em Facade refatoradas em classes EmpregadoDetails e EmpregadoComissionadoDetails

CODE SMELL 2: COMMENTS
Diversos comentários redundantes de procedientos autoexplicativos foram removidos.

CODE SMELL 3: SPECULATIVE GENERALITY
Decisão if comentada e deprecada em FolhaService.

Em seguida, demais code smells que tomariam tempo significativo, ou até completa reestruturação do projeto, para serem consertados:

CODE SMELL 4: OUTROS BLOATERS
Long Methods e, por consequência, Long Classes estão presentes em vários services, que poderiam ser divididos em diferentes responsabilidades.

CODE SMELL 5: SHOTGUN SURGERY
Dividir responsabilidades dos services em classes diferentes acarretaria em diversas mudanças no projeto, por conta das diversas interdependências. É consequência direta do acúmulo de responsabilidades de classes longas.

CODE SMELL 6: MIDDLE MAN
Classe Sistema serve apenas para delegar funções e inicializar hash maps.

CODE SMELL 7: DUPLICATE CODE
AlteraEmpregado está implementado três vezes na Facade de forma inelegante.
