package br.com.alura.screenmatch.principal;
import br.com.alura.screenmatch.modelos.pessoa.PessoaR;
import com.google.gson.Gson;



    public class FindBook {
        public static void main(String[] args){

            String json = "{\"nome\":\"Selma\",\"idade\":75,\"profissao\":\"Funcionária Pública\", \"cidade\":\"Salvador\"}";
            String PessoaJson = "src/br/com/alura/screenmatch/bancodedados/pessoas.json";



            Gson gson = new Gson();
            PessoaR minhaPessoaR = gson.fromJson(json, PessoaR.class);



            System.out.println("Informações da pessoa:");
            System.out.println(minhaPessoaR);
        }
    }

