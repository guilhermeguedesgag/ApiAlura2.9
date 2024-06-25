package br.com.alura.screenmatch.principal;


import br.com.alura.screenmatch.modelos.pessoa.PessoaR;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;



//o objetivo deste código é imprimir apenas um objeto do json

public class FindBook2 {

    public static void main(String[] args) {
        // Caminho para o arquivo JSON
        String pessoaJsonPath = "src/br/com/alura/screenmatch/bancodedados/pessoas.json";

        // Criar um objeto Gson
        Gson gson = new Gson();

        try {
            // Ler o arquivo JSON
            FileReader reader = new FileReader(pessoaJsonPath);

            // Converter JSON para objeto PessoaR
            PessoaR minhaPessoaR = gson.fromJson(reader, PessoaR.class);

            // Fechar o reader
            reader.close();

            // Imprimir as informações da pessoa
            System.out.println("Informações da pessoa:");
            System.out.println(minhaPessoaR);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

