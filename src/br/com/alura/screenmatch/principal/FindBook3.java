package br.com.alura.screenmatch.principal;


import br.com.alura.screenmatch.modelos.pessoa.LivrosR;
import br.com.alura.screenmatch.modelos.pessoa.PessoaR;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Scanner;


//o objetivo deste código é imprimir apenas um objeto do json

public class FindBook3 {

    public static void main(String[] args) {
        // Caminho para o arquivo JSON
        String pessoaJsonPath = "src/br/com/alura/screenmatch/bancodedados/variaspessoas2.json";

        // Criar um objeto Gson
        Gson gson = new Gson();

        try {
            // Ler o arquivo JSON
            FileReader reader = new FileReader(pessoaJsonPath);

            // Definimos  abaixo que o record será um array
            Type pessoaListType = new TypeToken<List<PessoaR>>() {}.getType();

            // Converter JSON para lista de objetos PessoaR(só desserializei)
            List<PessoaR> pessoas = gson.fromJson(reader, pessoaListType);


            // Fechar o reader
            reader.close();



            // Imprimir as informações da pessoa
            System.out.println("Informações da pessoa:");




            //foi colocado uma iteração abaixo, pois o Json estava sendo
            // consumido em sua totalidade,gerando o ', ' antes do nome
            for(PessoaR pessoaR:pessoas){
                System.out.println(pessoaR);
                System.out.println();
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

