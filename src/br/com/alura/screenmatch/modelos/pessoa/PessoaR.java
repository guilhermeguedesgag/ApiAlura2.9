package br.com.alura.screenmatch.modelos.pessoa;

    public record PessoaR(String nome, String idade, String profissao, String cidade, LivrosR livrosJson) {
       // aqui ele gravou a estrutura do Record, a pessoa terá está estrutura


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








