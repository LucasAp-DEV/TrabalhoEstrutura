import java.time.LocalDate;
import java.util.*;

public class TrabalhoJava {

    public static void main(String[] args) {

//        Exercício 2 - Listas dinâmicas:
//        Crie uma classe nova chamada TrabalhoJava e crie o método main.
//        Dentro do método main, defina um ArrayList e adicione 3 objetos distintos criados a partir da classe Aluno.
//        (esses 3 objetos serão importantes para o restante do trabalho)
//        Percorra a lista e imprima cada um dos objetos (lembrando do método toString() criado no exercício anterior).

        Aluno aluno1 = new Aluno("Maria", LocalDate.of(2002, 8, 20), 54321);
        Aluno aluno2 = new Aluno("Pedro", LocalDate.of(2001, 10, 10), 67890);
        Aluno aluno3 = new Aluno("Ana", LocalDate.of(2003, 3, 5), 98765);

        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        listaAlunos.add(aluno3);

        System.out.println("Lista de Alunos:");
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }

//        Exercício 3 - Listas dinâmicas
//        Ainda no método main da classe criada no exercício anterior, remova os itens da posição 0 e 1 e imprima novamente a lista, mostrando que agora só possui um registro.

        listaAlunos.remove(0);
        listaAlunos.remove(0);

        System.out.println("\nLista apos a remocao:");
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }

//        Exercício 5 - Conjuntos (Set):
//        No método main, crie um Set (HashSet) de Alunos e crie mais um objeto de Aluno e defina nesse objeto novo um valor de matrícula já utilizado em algum outro objeto.
//                Tente adicionar os 4 objetos de Aluno dentro do HashSet e percorra (utilizando um for) o Set mostrando todos os objetos.
//        obs: se tudo correr bem, só teremos 3 objetos impressos do HashSet, uma vez que o método equals entenderá os 2 objetos de mesma matrícula como iguais.

        Set<Aluno> conjuntoAlunos = new HashSet<>(listaAlunos);


        Aluno aluno4 = new Aluno("Joao", LocalDate.of(2000, 5, 15), 54321);


        boolean adicionado = conjuntoAlunos.add(aluno4);
        if (adicionado) {
            System.out.println("\nAluno adicionado com sucesso ao HashSet!");
        } else {
            System.out.println("Nao foi possível adicionar o aluno ao HashSet. Ja existe um aluno com a mesma matrícula.");
        }

        System.out.println("\nObjetos no HashSet antes da uniao:");
        for (Aluno aluno : conjuntoAlunos) {
            System.out.println(aluno);
        }

//        Exercício 6 - Conjuntos (Set):
//        Crie 2 objetos Set de alunos e coloque no primeiro set 2 alunos. No segundo set, coloque mais 2 alunos, porém, somente um deles pode ser igual a um objeto adicionado no primeiro set.
//        Utilizando o conceito de união dos Set (union), adicione o segundo conjunto no primeiro e imprima o resultado. O resultado deverá conter apenas 3 objetos, visto que um deles é igual de propósito.

        Set<Aluno> conjuntoAlunos2 = new HashSet<>();
        conjuntoAlunos2.add(aluno1);
        conjuntoAlunos2.add(aluno2);

        Set<Aluno> conjuntoAlunos3 = new HashSet<>();
        conjuntoAlunos3.add(aluno2);
        conjuntoAlunos3.add(aluno3);

        conjuntoAlunos2.addAll(conjuntoAlunos3);

        System.out.println("\nResultado da união dos conjuntos:");
        for (Aluno aluno : conjuntoAlunos2) {
            System.out.println(aluno);
        }

//        Exercício 7 - Filas (LinkedList):
//        No método main, crie uma LinkedList de objetos Aluno. Adicione pelo menos dois alunos à fila. Em seguida, implemente um algoritmo que remova e imprima o nome do primeiro aluno na fila.

        LinkedList<Aluno> filaAlunos = new LinkedList<>();

        filaAlunos.add(new Aluno("Maria", LocalDate.of(2002, 8, 20), 54321));
        filaAlunos.add(new Aluno("Pedro", LocalDate.of(2001, 10, 10), 67890));

        if (!filaAlunos.isEmpty()) {
            Aluno primeiroAluno = filaAlunos.removeFirst();
            System.out.println("\nNome do primeiro aluno na fila: " + primeiroAluno.getNome());
        } else {
            System.out.println("A fila de alunos está vazia.");
        }

//        Exercício 8 - Filas (LinkedList):
//
//        No método main, crie uma LinkedList de objetos Aluno. Adicione pelo menos dois alunos à fila. Em seguida, implemente um algoritmo que remova e
//        imprima o nome do último aluno na fila.
        if (!filaAlunos.isEmpty()) {
            Aluno ultimoAluno = filaAlunos.removeLast();
            System.out.println("\nNome do primeiro aluno na fila: " + ultimoAluno.getNome());
        } else {
            System.out.println("A fila de alunos está vazia.");
        }

//        Exercício 9 - Pilhas (Stack):
//
//        No método main, crie uma Stack de objetos Aluno. Adicione pelo menos dois alunos à pilha. Em seguida, implemente um
//        algoritmo que remova e imprima o nome do primeiro aluno na pilha.
//        obs: Lembrem-se que na fila o "primeiro" objeto não corresponde ao primeiro adicionado.

        Stack<Aluno> pilhaAlunos = new Stack<>();

        pilhaAlunos.push(new Aluno("Maria", LocalDate.of(2002, 8, 20), 54321));
        pilhaAlunos.push(new Aluno("Pedro", LocalDate.of(2001, 10, 10), 67890));

        if (!pilhaAlunos.isEmpty()) {
            Aluno primeiroAluno = pilhaAlunos.pop();
            System.out.println("\nNome do primeiro aluno na pilha: " + primeiroAluno.getNome());
        } else {
            System.out.println("A pilha de alunos está vazia.");
        }

//        Exercício 10 - Pilhas (Stack):
//
//        No método main, crie uma Stack de objetos Aluno. Adicione pelo menos dois alunos à pilha.
//        Em seguida, implemente um algoritmo que remova e imprima o nome do último aluno na pilha.

        Stack<Aluno> pilhaAlunos2 = new Stack<>();

        pilhaAlunos2.push(new Aluno("Maria", LocalDate.of(2002, 8, 20), 54321));
        pilhaAlunos2.push(new Aluno("Pedro", LocalDate.of(2001, 10, 10), 67890));

        if (!pilhaAlunos2.isEmpty()) {
            Aluno ultimoAluno = pilhaAlunos2.pop(); // Removendo o último aluno da pilha
            System.out.println("\nNome do último aluno na pilha: " + ultimoAluno.getNome());
        } else {
            System.out.println("A pilha de alunos estA vazia.");
        }

    }
}
