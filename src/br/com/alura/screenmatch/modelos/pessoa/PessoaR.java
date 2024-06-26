package br.com.alura.screenmatch.modelos.pessoa;

    public record PessoaR(String nome, String idade, String profissao, String cidade, LivrosR livrosJson) {
       // aqui ele gravou a estrutura do Record, a pessoa terá está estrutura
    }
    /*Todo: esse record acima, resumiu todo esse conteudo abaixo:

        public class Pessoa {
        private String nome;
        private String idade;
        private String profissao;
        private String cidade;



        public Pessoa(String nome, String idade, String profissao, String cidade) {
            this.nome = nome;
            this.idade = idade;
            this.profissao = profissao;
            this.cidade = cidade;
        }
        @Override
        public String toString() {
            return "Pessoa{" +
                    "nome='" + nome + '\'' +
                    ", idade='" + idade + '\'' +
                    ", profissão='"  + profissao + '\'' + ", cidade='" + cidade + '\'' + '}';
        }

     */

