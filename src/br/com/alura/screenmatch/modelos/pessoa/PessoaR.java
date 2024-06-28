package br.com.alura.screenmatch.modelos.pessoa;

    public record PessoaR(String nome, String idade, String profissao, String cidade, LivrosR livrosJson) {
       // aqui ele gravou a estrutura do Record, a pessoa terá está estrutura

//    @Override
//        public String toString() {
//        return  "Nome: " + nome + "\n" +
//                "Idade: " + idade + "\n" +
//                "Profissão: " + profissao + "\n" +
//                "Cidade: " + cidade + "\n" +
//
//                "Livros preferidos: " +
//
//                (livrosJson != null ? "\n Título: " + livrosJson.titulo() +
//                        "\n Autor: "+ livrosJson.autor() : "Não preenchido") + "\n";
//
//        }

        @Override
        public String toString () {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Nome: ").append(nome).append("\n")
                    .append("Idade: ").append(idade).append("\n")
                    .append("Profissão: ").append(profissao).append("\n")
                    .append("Cidade: ").append(cidade).append("\n");

            if (livrosJson != null) {
                stringBuilder.append("Livros preferidos: ").append("\n")
                        .append("Título: ").append(livrosJson.titulo()).append("\n")
                        .append("Autor: ").append(livrosJson.autor()).append("\n");
            }
            return stringBuilder.toString();
        }

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
        }*/




