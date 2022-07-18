<h2> Enunciado do Exercício📄 </h2>

Implemente as classes **Disciplina** e **Curso** conforme especificado a seguir. As duas classes devem ser implementadas no pacote universidade.

**Classe Disciplina: define uma disciplina.**
- public void setNome(String nomeDisciplina): atribui o nome da instância da disciplina;
- public String getNome(): retorna o nome da instância da disciplina;
- public void setQtdCreditos(int qtdCreditos): atribui a quantidade de créditos na instância da disciplina;
- public int getQtdCreditos(): retorna a quantidade de créditos da instância da disciplina.

**Classe Curso: define um curso. Cada instância de curso deve armazenar um vetor de disciplinas (referências para objetos Disciplina).**
- public void setNome(String nomeCurso): atribui o nome da instância do curso;
- public String getNome(): retorna o nome da instância do curso;
- public void setMaxDisciplinas(int maxDisciplinas): atribui a quantidade de máxima de disciplinas na instância de disciplina (tamanho máximo do vetor de disciplinas);
- public boolean adicionarDisciplina(Disciplina d): adiciona uma disciplina no vetor de disciplinas. Se o vetor estiver cheio, a disciplina não é adicionada e o retorno é false. Caso contrário, o retorno é true.
- public String[] getListaDisciplinasStr(): retorna um vetor de String com as disciplinas da instância do curso. O tamanho do vetor deve ser igual à quantidade de disciplina adicionadas ao curso. Cada String deve ter o formato: "NomeDisciplina: QtdCreditos".

<h3> Saída </h3>

- Resultado dos métodos utilizados no Main
